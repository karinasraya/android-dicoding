package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class KatalogDetail extends AppCompatActivity {

    ImageView viewfotokatalog;
    TextView viewnamakatalog, viewpricekatalog, viewdetailkatalog, viewlogamkatalog, viewdiamondkatalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog_detail);

        getSupportActionBar().setTitle("Detail");

        viewfotokatalog = findViewById(R.id.viewfotokatalog);
        viewnamakatalog = findViewById(R.id.viewnamakatalog);
        viewpricekatalog = findViewById(R.id.viewpricekatalog);
        viewdetailkatalog = findViewById(R.id.viewdetailkatalog);
        viewlogamkatalog = findViewById(R.id.viewlogamkatalog);
        viewdiamondkatalog = findViewById(R.id.viewdiamondkatalog);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_katalog") && getIntent().hasExtra("nama_katalog")
                && getIntent().hasExtra("harga_katalog") && getIntent().hasExtra("detail_katalog")
                && getIntent().hasExtra("logam_katalog") && getIntent().hasExtra("diamond_katalog")){

            String fotokatalog = getIntent().getStringExtra("foto_katalog");
            String namakatalog = getIntent().getStringExtra("nama_katalog");
            String hargakatalog = getIntent().getStringExtra("harga_katalog");
            String detailkatalog = getIntent().getStringExtra("detail_katalog");
            String logamkatalog = getIntent().getStringExtra("logam_katalog");
            String diamondkatalog = getIntent().getStringExtra("diamond_katalog");

            setDataActivity(fotokatalog, namakatalog, hargakatalog, detailkatalog, logamkatalog, diamondkatalog);
        }
    }

    private void setDataActivity(String fotokatalog, String namakatalog, String hargakatalog, String detailkatalog, String logamkatalog, String diamondkatalog){

        Glide.with(this).asBitmap().load(fotokatalog).into(viewfotokatalog);
        viewnamakatalog.setText(namakatalog);
        viewpricekatalog.setText(hargakatalog);
        viewdetailkatalog.setText(detailkatalog);
        viewlogamkatalog.setText(logamkatalog);
        viewdiamondkatalog.setText(diamondkatalog);
    }

}
