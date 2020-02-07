package com.example.list;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.aboutme:
                break;
        }
    }
}
