package com.example.blazej.projekt;

import java.util.List;

/**
 * Created by Blazej on 31.12.2017.
 */

public class Recipe {

    private int id;
    private String recipeTitle;
    private String description;
    private String category;
    private String components;

    public Recipe(){}

    public Recipe(int id, String recipeTitle,String description,String category, String components){
        this.id = id;
        this.recipeTitle = recipeTitle;
        this.description = description;
        this.category = category;
        this.components = components;
    }

    public Recipe(String recipeTitle, String description,String category,String components){
        this.recipeTitle = recipeTitle;
        this.description = description;
        this.components = components;
        this.category = category;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
