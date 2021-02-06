package com.example.dogapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PerritoViewHolder extends RecyclerView.ViewHolder {

TextView txtNombre ;
TextView txtAnno;
ImageView imfoto;
    public PerritoViewHolder( View itemView) {
        super(itemView);


txtNombre = itemView.findViewById(R.id.txtNombre);
txtAnno = itemView.findViewById(R.id.txtedad);
imfoto = itemView.findViewById(R.id.image_dog1);






    }
}
