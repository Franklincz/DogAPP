package com.example.dogapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Perritos {

String nombre;
String anno;
int idfoto;


    public Perritos(String nombre, String anno, int idfoto) {
        this.nombre = nombre;
        this.anno = anno;
        this.idfoto = idfoto;
    }
}
