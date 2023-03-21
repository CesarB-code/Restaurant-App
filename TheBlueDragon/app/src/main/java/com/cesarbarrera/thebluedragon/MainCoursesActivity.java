package com.cesarbarrera.thebluedragon;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);
        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish [] mainCourses = {
                new Dish("Mutton ", "Sheep leg cooked with the best salt in all the Shire", 90),
                new Dish("Rabbit stew","Rabbit stew made with cheese ,dill, chicken broth and taters " , 100),
                new Dish("Raw Fish", "Raw and wiggling ", 50),
                new Dish("POTATOES", "Boil them , mash them , stick them in a stew", 30),
                new Dish("Deer leg", "Seasoned venison", 140)

        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);

        mainCoursesList.setAdapter(dishesAdapter);

    }
}
