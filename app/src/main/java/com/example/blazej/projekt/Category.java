package com.example.blazej.projekt;



import java.util.Arrays;

public enum Category{
    DESSERT("DESSERT"), COURSE("COURSE"), BREAKFAST("BREAKFAST"),DINNER("DINNER"),LUNCH("LUNCH"),
    SUPPER("SUPPER"),SIDEDISH("SIDE DISH"), SOUP("SOUP");

    private final String text;

    Category(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static String[] getCategory(Class<? extends  Enum<?>> e){
        return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
    }

}
