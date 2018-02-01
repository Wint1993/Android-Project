package com.example.blazej.projekt;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Blazej on 31.12.2017.
 */

public class DatabaseHandler  extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 3;

    private static final String DATABASE_NAME = "recipeDatabases1";

    private static final String TABLE_RECIPES = "recipe";

    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "recipeTitle";
    private static final String KEY_DESC = "description";
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_COMPONENTS = "components";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_RECIPES + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_DESC + " TEXT," + KEY_CATEGORY + " TEXT," + KEY_COMPONENTS + " TEXT" + ");";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    public void addRecipe(Recipe recipe){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME,recipe.getRecipeTitle());
        values.put(KEY_DESC,recipe.getDescription());
        values.put(KEY_CATEGORY,recipe.getCategory());
        values.put(KEY_COMPONENTS,recipe.getComponents());
        db.insert(TABLE_RECIPES,null,values);
        db.close();
    }

    public List<Recipe> getAllRecipe(){
        List<Recipe> recipeList = new ArrayList<Recipe>();
        String selectQuery = "SELECT * FROM " + TABLE_RECIPES;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                Recipe recipe = new Recipe();
                recipe.setId(Integer.parseInt(cursor.getString(0)));
                recipe.setRecipeTitle(cursor.getString(1));
                recipe.setDescription(cursor.getString(2));
                recipe.setCategory(cursor.getString(3));
                recipe.setComponents(cursor.getString(4));
                recipeList.add(recipe);
            } while (cursor.moveToNext());
        }
        return recipeList;
    }

    public Cursor getRecipeList(){
        SQLiteDatabase db = this.getWritableDatabase();
         Cursor data = db.rawQuery("SELECT * FROM "+ TABLE_RECIPES,null);
         return data;
    }

    public Recipe getRecipe(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_RECIPES, new String[] {KEY_ID,
        KEY_NAME,KEY_DESC,KEY_CATEGORY,KEY_COMPONENTS}, KEY_ID + "=?",
                new String[] {String.valueOf(id)},null,null,null,null);
        if (cursor != null)
            cursor.moveToFirst();
        Recipe recipe = new Recipe(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),
                cursor.getString(3),cursor.getString(4));

        return recipe;

    }

    public String getRecipeTitle(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_RECIPES, new String[] {KEY_ID,
                        KEY_NAME,KEY_DESC,KEY_CATEGORY,KEY_COMPONENTS}, KEY_ID + "=?",
                new String[] {String.valueOf(id)},null,null,null,null);
        if (cursor != null)
            cursor.moveToFirst();
        String name = cursor.getString(1);
        return name;
    }

    public int updateRecipe(Recipe recipe){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME,recipe.getRecipeTitle());
        values.put(KEY_DESC,recipe.getDescription());
        values.put(KEY_CATEGORY,recipe.getCategory());
        values.put(KEY_COMPONENTS,recipe.getComponents());
        return db.update(TABLE_RECIPES, values, KEY_ID + " = ?",
                new String[] { String.valueOf(recipe.getId()) });
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RECIPES);
        onCreate(db);
    }
    public void deleteContact(Recipe recipe) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_RECIPES, KEY_ID + " = ?",
                new String[] { String.valueOf(recipe.getId()) });
        db.close();
    }

}
