package com.example.MyCuisine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import static com.example.MyCuisine.MainActivity.recipeList;

public class RecipeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_recipe_detail);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        int recipeId = i.getIntExtra("recipeId", 0);
        RecipeModel currentRecipe = recipeList.get(recipeId);

        Toolbar recipeToolbar = findViewById(R.id.toolbar);
        recipeToolbar.setTitle(currentRecipe.getTitle());
        TextView recipeTitle = findViewById(R.id.recipeTitle);
        recipeTitle.setText(currentRecipe.getTitle());
        TextView recipeIngredients = findViewById(R.id.recipeIngredients);
        recipeIngredients.setText(currentRecipe.getIngredients());
        TextView recipeTutorial = findViewById(R.id.recipeTutorial);
        recipeTutorial.setText(currentRecipe.getTutorial());


        ImageView recipePhoto = findViewById(R.id.recipePhoto);
        try {
            AssetManager assetManager = this.getAssets();
            InputStream ims = assetManager.open("img/" + currentRecipe.getId() + ".jpg");
            Drawable d = Drawable.createFromStream(ims, null);
            recipePhoto.setImageDrawable(d);
        } catch (IOException ex) {
            return;
        }
    }
}
