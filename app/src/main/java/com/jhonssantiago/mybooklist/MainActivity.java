package com.jhonssantiago.mybooklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView_itens;
    private MyAdapter meuAdapter;
    private ArrayList<Book> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView_itens = findViewById(R.id.listView_itens);
        criarLista();
        meuAdapter = new MyAdapter(getApplicationContext(), books);
        listView_itens.setAdapter(meuAdapter);
        listView_itens.setOnItemClickListener(this);
    }

    private void criarLista(){
        books = new ArrayList<>();
        Book b1 = new Book(R.drawable.ic_launcher_background, "Titulo1", "categoria", "sinopse", "23,00");
        Book b2 = new Book(R.drawable.ic_launcher_background, "Titulo2", "categoria", "sinopse", "23,00");

        books.add(b1);
        books.add(b2);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Book book = (Book) meuAdapter.getItem(position);
        Toast.makeText(getApplicationContext(), book.toString(), Toast.LENGTH_SHORT).show();
    }
}