package com.example.gridviewbase_latv0298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;
    contenido contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvdatos = findViewById(R.id.gvcontenedor);
        ArrayList<String> arreglo = new ArrayList<>();
        arreglo.add("Fernando");
        arreglo.add("Francisco");
        arreglo.add("Saul");
        arreglo.add("Guadalupe");
        arreglo.add("Roberto");
        arreglo.add("Angel");
        arreglo.add("Sabino");
        arreglo.add("Julissa");
        arreglo.add("Alma");
        arreglo.add("Alicia");
        arreglo.add("Joel");

        contenido = new contenido(this, arreglo);
        gvdatos.setAdapter(contenido);
    }
}
