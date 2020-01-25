package com.example.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKatalog;
    private ArrayList<katalog> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Katalog");

        rvKatalog = findViewById(R.id.rv_katalog);
        rvKatalog.setHasFixedSize(true);

        list.addAll(KatalogData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvKatalog.setLayoutManager(new LinearLayoutManager(this));
        ListKatalogAdapter listKatalogAdapter = new ListKatalogAdapter(list);
        rvKatalog.setAdapter(listKatalogAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.aboutme){
            startActivity(new Intent(this, AboutActivity.class));
        }
        return true;
    }
}
