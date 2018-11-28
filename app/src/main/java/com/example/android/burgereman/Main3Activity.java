package com.example.android.burgereman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    int[] potatoPhoto = {R.drawable.potato1 , R.drawable.choclatepotato , R.drawable.nicepotato};
    String [ ] potatoKind = {"Potato 1 " , "Choclate Potato" , "Nice Potato"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView listView = findViewById(R.id.change_list);

        ArrayList<changeList> items = new ArrayList<>();
        for(int i = 0 ; i<potatoKind.length ; i++){

            items.add(new changeList( potatoPhoto[i] , potatoKind[i]));
        }
        changeAdapter adapter = new changeAdapter(getApplicationContext() , items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Main3Activity.this , Main2Activity.class);

                intent.putExtra("sender_key2" , "Main3Activity");
                intent.putExtra("botato_img2" ,potatoPhoto[position]);
                intent.putExtra("botato_name2" , potatoKind[position]);
                startActivity(intent);
            }
        });
    }
}
