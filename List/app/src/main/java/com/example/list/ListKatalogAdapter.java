package com.example.list;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.text.CollationElementIterator;
import java.util.ArrayList;

public class ListKatalogAdapter extends RecyclerView.Adapter<ListKatalogAdapter.ListViewHolder> {
    private ArrayList<katalog> listKatalog;
    public ListKatalogAdapter(ArrayList<katalog> list) {

        this.listKatalog = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_katalog, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final katalog katalog = listKatalog.get(position);
        Glide.with(holder.itemView.getContext())
                .load(katalog.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(katalog.getName());
        holder.tvDetail.setText(katalog.getDetail());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listKatalog.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(holder.itemView.getContext(), KatalogDetail.class);

                intent.putExtra("foto_katalog", katalog.getHeader());
                intent.putExtra("nama_katalog", katalog.getName());
                intent.putExtra("harga_katalog", katalog.getPrice());
                intent.putExtra("detail_katalog", katalog.getDetail());
                intent.putExtra("logam_katalog", katalog.getLogam());
                intent.putExtra("diamond_katalog", katalog.getDiamond());

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listKatalog.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public CollationElementIterator tvPrice;
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvPricetag, tvLogam, tvDiamond;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
