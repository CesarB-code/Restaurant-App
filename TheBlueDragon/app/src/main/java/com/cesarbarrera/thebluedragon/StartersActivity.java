package com.cesarbarrera.thebluedragon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);



        Dish [] dishes = {
                new Dish("Salted Pork"," BBQ marinated Pork roasted with salt and pepper on skin ",999),
                new Dish("Lembas","Elvish whey bread with honey and cinnimon", 180),
                new Dish("Roasted Chicken", "Chicken roasted by a fire and seasoned with salt , pepper , garlic and butter", 200),
                new Dish("Roasted Vegtables", "Vegatbles roasted and smoked with rosemary, salt , pepper, oil and garlic", 120),
                new Dish("Ale", "Refreshing ale made from hobbiton", 200),
                new Dish("Wine", "Wine from the streets of Gondor", 250),
                new Dish("Water", "Fresh mountain water", 0)

        };


        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);

    }
}