package com.example.displayinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Rahul,Male,20");
        friends.add("Kapil,Male,21");
        friends.add("Akshay,Male 22");
        friends.add("Yash,Male,20");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friends);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String text = "Item" + position+ " " + ((TextView) view).getText().toString();
                Toast.makeText(MainActivity.this,text , Toast.LENGTH_SHORT).show();

            }
        });




    }
}