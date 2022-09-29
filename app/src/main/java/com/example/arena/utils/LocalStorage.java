package com.example.arena.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStorage {
    private static final String CART = "CART";
    private static final String SECTOR = "SECTOR";

    private final SharedPreferences sharedPreferences;

    public LocalStorage(Context context) {
        sharedPreferences = context.getSharedPreferences("Preferences", 0);
    }



    public String getCart() {
        if(sharedPreferences.contains(CART))
            return sharedPreferences.getString(CART, null);
        else return null;
    }

    public void setCart(String cart) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(CART, cart);
        editor.apply();
    }

    public String getSector() {
        if(sharedPreferences.contains(SECTOR))
            return sharedPreferences.getString(SECTOR, null);
        else return null;
    }

    public void setSector(String sector) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SECTOR, sector);
        editor.apply();
    }
}
