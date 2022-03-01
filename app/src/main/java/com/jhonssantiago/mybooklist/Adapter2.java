package com.jhonssantiago.mybooklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter2 extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Book> books;


    public Adapter2(Context context, ArrayList<Book> books) {
        this.books = books;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
       return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Book book = books.get(position);

        view = inflater.inflate(R.layout.details_book, null); //view vazia

        TextView textViewTitulo = view.findViewById(R.id.textView_titulo); //preenchendo view
        textViewTitulo.setText(book.getTitulo());
        ImageView image = view.findViewById(R.id.img_item);
        image.setImageResource(book.getCapa());
        TextView textViewCategoria = view.findViewById(R.id.textView_categoria);
        textViewCategoria.setText(book.getCategoria());
        TextView textViewSinopse = view.findViewById(R.id.textView_sinopse);
        textViewSinopse.setText(book.getSinopse());
        TextView textViewPreco = view.findViewById(R.id.textView_preco);
        textViewPreco.setText(book.getPreco());

        return view;
    }
}
