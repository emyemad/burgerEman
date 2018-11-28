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

public class changeAdapter extends ArrayAdapter<changeList> {

public changeAdapter(Context context, ArrayList<changeList> words) {
        super(context, 0, words);

        }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.change_list , parent , false);
        }

        changeList item = getItem(position);

        ImageView changeImg = view.findViewById(R.id.changeImg);
        changeImg.setImageResource(item.getBotatoPhoto());

        TextView changeTxt = view.findViewById(R.id.changeTxt);
        changeTxt.setText(item.getChangeBotato());

        return view;
    }
}
