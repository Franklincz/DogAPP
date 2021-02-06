package com.example.dogapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter  extends RecyclerView.Adapter<PerritoViewHolder> {
 List<Perritos> perritos;
RVAdapter(List<Perritos> perritos){

    this.perritos=perritos;

}


    @Override
    public PerritoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.elemto_lista_dog,parent,false);
     PerritoViewHolder pvh = new PerritoViewHolder(vista);





    return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PerritoViewHolder holder, int position) {

        holder.txtNombre.setText(perritos.get(position).nombre);
        holder.txtAnno.setText(perritos.get(position).anno);
        holder.imfoto.setImageResource(perritos.get(position).idfoto);
    }

    @Override
    public int getItemCount() {
        return perritos.size();
    }
}
