package com.example.android.burgereman;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class botatoAdapter extends ArrayAdapter<botatoList> {

    public botatoAdapter(Context context, ArrayList<botatoList> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        botatoList botatoItem = getItem(position);


        ImageView img = v.findViewById(R.id.botato_img);
        img.setImageResource(botatoItem.getBotatoImg());

        TextView txt = v.findViewById(R.id.botato_txt);
        txt.setText(botatoItem.getBotatoName());

        TextView txtPrice = v.findViewById(R.id.botato_price);
        txtPrice.setText(botatoItem.getBotatoPrice());

        return v;
    }
}
