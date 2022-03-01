package com.jhonssantiago.mybooklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityDetailsBook extends AppCompatActivity {
    private ListView listView_itens;
    private Adapter2 meuAdapter2;
    private ArrayList<Book> books;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_book);

        Intent i = getIntent();
        int capa = i.getIntExtra("capa", 0);
        String titulo = i.getStringExtra("titulo");
        String preco = i.getStringExtra("preco");
        String categoria = i.getStringExtra("categoria");
        String sinopse= i.getStringExtra("sinopse");
        books = new ArrayList<>();


       Book b = new Book(capa, titulo, categoria, sinopse, preco);
       books.add(b);

        listView_itens = findViewById(R.id.listView_details);
        meuAdapter2 = new Adapter2(getApplicationContext(), books);
        listView_itens.setAdapter(meuAdapter2);




    }
}