package com.example.btechproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView l;
    String[] workshops={"Workshop 1","Workshop 2","Workshop 3","Workshop 4","Workshop 5","Workshop 6","Workshop 7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l=findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,workshops);
        l.setAdapter(adapter);

        l.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==0){
            Intent intent=new Intent(MainActivity.this, workshop1.class);
            startActivity(intent);
        }
        else if(i==1){
            Intent intent=new Intent(MainActivity.this, workshop2.class);
            startActivity(intent);
        }
        else if(i==2){
            Intent intent=new Intent(MainActivity.this, workshop3.class);
            startActivity(intent);
        }
        else if(i==3){
            Intent intent=new Intent(MainActivity.this, workshop4.class);
            startActivity(intent);
        }
        else if(i==4){
            Intent intent=new Intent(MainActivity.this, workshop5.class);
            startActivity(intent);
        }
        else if(i==5){
            Intent intent=new Intent(MainActivity.this, workshop6.class);
            startActivity(intent);
        }
        else if(i==6){
            Intent intent=new Intent(MainActivity.this, workshop7.class);
            startActivity(intent);
        }
    }
}
