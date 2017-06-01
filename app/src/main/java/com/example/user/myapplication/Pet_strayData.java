package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Pet_strayData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_stray_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(more);
        ListView list = (ListView) findViewById(R.id.pet_list2);
        ArrayList petlist=new ArrayList<Pet_Item>();
        Pet_Item item1=new Pet_Item(R.drawable.pet1,"台中市(狗)");
        Pet_Item item2=new Pet_Item(R.drawable.pet2,"台中市(貓)");
        Pet_Item item3=new Pet_Item(R.drawable.pet3,"新竹縣(狗)");
        Pet_Item item4=new Pet_Item(R.drawable.pet4,"苗栗縣(鴿子)");
        Pet_Item item5=new Pet_Item(R.drawable.pet5,"宜蘭縣(狗)");
        Pet_Item item6=new Pet_Item(R.drawable.pet6,"高雄市(貓)");
        Pet_Item item7=new Pet_Item(R.drawable.pet7,"台南市(狗)");
        petlist.add(item1);
        petlist.add(item2);
        petlist.add(item3);
        petlist.add(item4);
        petlist.add(item5);
        petlist.add(item6);
        petlist.add(item7);

        Pet_adapter adapter = new Pet_adapter(this,petlist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(itemclick);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "歡迎來信回報Bug     clk91095@yahoo.com.tw", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    private View.OnClickListener more = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            Uri uri = Uri.parse("http://animal-adoption.coa.gov.tw/animal");
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        }
    };

    AdapterView.OnItemClickListener itemclick= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent();
            switch(position)
            {
                case 0:
                    intent.setClass(Pet_strayData.this,pet1.class);
                    startActivity(intent);
                    break;
                case 1:
                    intent.setClass(Pet_strayData.this,pet2.class);
                    startActivity(intent);
                    break;
                case 2:
                    intent.setClass(Pet_strayData.this,pet3.class);
                    startActivity(intent);
                    break;
                case 3:
                    intent.setClass(Pet_strayData.this,pet4.class);
                    startActivity(intent);
                    break;
                case 4:
                     intent.setClass(Pet_strayData.this,pet5.class);
                     startActivity(intent);
                     break;
                case 5:
                    intent.setClass(Pet_strayData.this,pet6.class);
                    startActivity(intent);
                    break;
                case 6:
                    intent.setClass(Pet_strayData.this,pet7.class);
                    startActivity(intent);
                    break;

            }
        }
    };
}
