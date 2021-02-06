package com.example.dogapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class BottomNavigation extends AppCompatActivity {
RecyclerView rvLista;
List<Perritos> listaperritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

rvLista =(RecyclerView)findViewById(R.id.recyclerid);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rvLista.setLayoutManager(lm);
        rvLista.setHasFixedSize(true);

        this.cargarData();
        this.cargarAdapter();




       BottomNavigationView bottomNavigationView = findViewById(R.id.botomm_nav);

        bottomNavigationView.setSelectedItemId(R.id.home);

        //dagsgasud

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){


            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:

                        return true;


                    case R.id.Buscar:
                        startActivity(new Intent(getApplicationContext() ,Busqueda.class));
                        overridePendingTransition(0,0
                        );

                        return true;


                    case R.id.Mis_Donaciones:
                        startActivity(new Intent(getApplicationContext() ,Donaciones.class));
                        overridePendingTransition(0,0
                        );

                        return true;


                    case R.id.Notificaciones:
                        startActivity(new Intent(getApplicationContext() ,Notificaciones.class));
                        overridePendingTransition(0,0
                        );

                        return true;





                    case R.id.Micuenta:
                        startActivity(new Intent(getApplicationContext() ,Micuenta.class));
                        overridePendingTransition(0,0
                        );

                        return true;







                }

                return false;
            }
        });



    }



    private void cargarData (){


        listaperritos = new ArrayList<>();
        listaperritos.add(new Perritos("jefri","1 anio",R.drawable.dog2));
        listaperritos.add(new Perritos("jefri","1 anio",R.drawable.perro3));
        listaperritos.add(new Perritos("jefri","1 anio",R.drawable.perro5));
        listaperritos.add(new Perritos("jefri","1 anio",R.drawable.perro7));
        listaperritos.add(new Perritos("jefri","1 anio",R.drawable.dog2));
    }

private void cargarAdapter(){
        RVAdapter adapter = new RVAdapter(listaperritos);
        rvLista.setAdapter(adapter);

}









    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intent in = new Intent(this, MainActivity.class);
       startActivity(in);
        finish();

        return super.onKeyDown(keyCode, event);
    }




}