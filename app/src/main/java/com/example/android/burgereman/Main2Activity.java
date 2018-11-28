package com.example.android.burgereman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

  public   int botatoImg1 , botatoImg2;
    public  String botatoName1 , botatoName2;

   public ImageView imgview1 , imgview2;
    public  TextView txtname1 , txtname2;

  /*  public Main2Activity(int img1, String name1) {

        this.img1 = img1;
        this.img2 = img1;
        this.name1 = name1;
        this.name2 = name1;


    } */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgview1 = findViewById(R.id.img1);
        imgview2 = findViewById(R.id.img2);

        txtname1 = findViewById(R.id.name1);
        txtname2 = findViewById(R.id.name2);

        // get the key of intent from the fragment
        final String sender=this.getIntent().getExtras().getString("sender_key");

        //IF ITS THE FRAGMENT THEN RECEIVE DATA
        if(sender != null)
        {
            this.receiveData();
            }

        final String sender2=this.getIntent().getExtras().getString("sender_key2");

        //IF ITS THE FRAGMENT THEN RECEIVE DATA
        if(sender2 != null)
        {
            this.receiveData2();
        }

      /*  imgview1.setImageResource(img1);
        imgview2.setImageResource(img2);

        txtname1.setText(name1);
        txtname2.setText(name2);  */
    }

    private void receiveData()
    {
        //RECEIVE DATA VIA INTENT
        Intent i = getIntent();

        botatoName1 = i.getStringExtra("botato_name");
        botatoName2 = i.getStringExtra("botato_name");

         botatoImg1 = i.getIntExtra("botato_img",0);
        botatoImg2 = i.getIntExtra("botato_img",0);


        //SET DATA TO TEXTVIEWS
        txtname1.setText(botatoName1);
        txtname2.setText(botatoName2);

        //SET DATA TO ImageViews
        imgview1.setImageResource(botatoImg1);
        imgview2.setImageResource(botatoImg2);
    }


    private void receiveData2()
    {
        //RECEIVE DATA VIA INTENT
        Intent i = getIntent();

        botatoName1 = i.getStringExtra("botato_name");
        botatoName2 = i.getStringExtra("botato_name2");

        botatoImg1 = i.getIntExtra("botato_img" , 0);
        botatoImg2 = i.getIntExtra("botato_img2",0);


        //SET DATA TO TEXTVIEWS

        txtname1.setText(botatoName1);
        txtname2.setText(botatoName2);

        //SET DATA TO ImageViews
        imgview1.setImageResource(botatoImg1);
        imgview2.setImageResource(botatoImg2);
    }

    public void order(View view) {

        Toast.makeText(getApplicationContext() , "Order has Done" , Toast.LENGTH_SHORT).show();
    }

    public void change(View view) {
        // open the list to change botatos

        Intent intent = new Intent(Main2Activity.this , Main3Activity.class);
        startActivity(intent);

    }
}
