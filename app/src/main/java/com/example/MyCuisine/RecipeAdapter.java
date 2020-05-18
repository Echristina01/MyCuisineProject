package com.example.MyCuisine;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.UserViewHolder> {
    private ArrayList<RecipeModel> recipeList;
    private Context context;

    //    Inner Class
    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView recipeTitleTextView;
        public ImageView recipePhotoImageView;

        // Constructor inner class
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitleTextView = itemView.findViewById(R.id.recipeTitle);
            recipePhotoImageView = itemView.findViewById(R.id.recipePhoto);
        }
    }
    public class CardClickListener implements View.OnClickListener{
//        private int id;
        private RecipeModel rm;
        private Context context;
        public CardClickListener(RecipeModel rm, Context context) {
            this.rm = rm;
            this.context = context;
        }

        @Override
        public void onClick(View view) {
            System.out.println(this.rm.getId());
            Intent intent = new Intent(context, RecipeDetailActivity.class);
            intent.putExtra("recipeId", this.rm.getId());
            context.startActivity(intent);
        }
    }

    // Constructor
    public RecipeAdapter(ArrayList<RecipeModel> userList, Context context) {
        this.recipeList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        UserViewHolder uvh = new UserViewHolder(v);
        return uvh;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        RecipeModel currentRecipe = this.recipeList.get(position);
        holder.recipeTitleTextView.setText(currentRecipe.getTitle());

        try {
            AssetManager assetManager = context.getAssets();
            InputStream ims = assetManager.open("img/" + currentRecipe.getId() + ".jpg");
            Drawable d = Drawable.createFromStream(ims, null);
            holder.recipePhotoImageView.setImageDrawable(d);
        } catch (IOException ex) {
            return;
        }

        holder.itemView.setOnClickListener(new CardClickListener(currentRecipe, context));
    }

    @Override
    public int getItemCount() {
        return this.recipeList.size();
    }
}
