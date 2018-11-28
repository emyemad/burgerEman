package com.example.android.burgereman;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

int [] botatImg = {R.drawable.botato , R.drawable.botato2 , R.drawable.botato , R.drawable.botato2 ,
        R.drawable.botato , R.drawable.botato2};

String [] botatName = {"Botato 1" ,"Botato 2" , "Botato 3" , "Botato 4" , "Botato 5" , "Botato 6"  };
String [] botatPrice = {"From 4,000 LBP" ,"From 5,000 LBP" , "From 5,500 LBP" ,"From 3,750 LBP" ,
        "From 4,000 LBP" , "From 4,500 LBP" };

ListView listView ;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        listView = view.findViewById(R.id.listview);

        ArrayList<botatoList> items = new ArrayList<>();
        for(int i = 0 ; i<botatImg.length ; i++){
            items.add(new botatoList(botatImg[i] , botatName[i] , botatPrice[i] ) );
        }

        botatoAdapter adapter = new botatoAdapter(getActivity() , items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // new Main2Activity(botatImg[position]  , botatName[position] );

                Intent intent = new Intent(getActivity() , Main2Activity.class);
                intent.putExtra("sender_key" , "BlankFragment");
                intent.putExtra("botato_img" ,botatImg[position]);
                intent.putExtra("botato_name" , botatName[position]);
                startActivity(intent);
            }
        });
        return view;
    }

}
