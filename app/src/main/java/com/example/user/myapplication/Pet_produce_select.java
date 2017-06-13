package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Pet_produce_select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_produce_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageButton ibtn1=(ImageButton)findViewById(R.id.imageButton) ;
        ImageButton ibtn2=(ImageButton)findViewById(R.id.imageButton2) ;
        ImageButton ibtn3=(ImageButton)findViewById(R.id.imageButton3) ;
        ibtn1.setOnClickListener(click1);
        ibtn2.setOnClickListener(click2);
        ibtn3.setOnClickListener(click3);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "歡迎來信回報Bug     ckes15owen@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private View.OnClickListener click1=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            Uri uri = Uri.parse("http://goods.ruten.com.tw/item/show?11070812852725");
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        }
    };
    private View.OnClickListener click2=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            Uri uri = Uri.parse("http://www.pcstore.com.tw/wj6688/M12263711.htm");
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        }
    };
    private View.OnClickListener click3=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            Uri uri = Uri.parse("http://goods.ruten.com.tw/item/show?21107317016650");
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        }
    };


}