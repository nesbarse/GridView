package com.example.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
public class CategoriasActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        GridView gridview = (GridView) findViewById(R.id.gridCategorias);
        gridview.setAdapter(new CategoriasAdapter(this));
    }
}