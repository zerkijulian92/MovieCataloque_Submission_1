package com.takatutustudio.projectrecyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.takatutustudio.projectrecyclerview.R;
import com.takatutustudio.projectrecyclerview.activity.DetailMovie;
import com.takatutustudio.projectrecyclerview.model.Movie;

import java.util.ArrayList;

public class ItemCardViewAdapter extends RecyclerView.Adapter<ItemCardViewAdapter.CardViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovie;

    //hasil dari generate Constructor Context context
    public ItemCardViewAdapter(Context context) {
        this.context = context;
    }
    //--

    //hasil dari generate Getter and setter listMovie
    public ArrayList<Movie> getListMovie() {
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }
    //--

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_movie, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, final int position) {
        holder.tvJudulFilm.setText(getListMovie().get(position).getJudulFilm());
        holder.tvTglRilis.setText(getListMovie().get(position).getTglRilis());
        holder.tvDesFilm.setText(getListMovie().get(position).getDescFilm());

        Glide.with(context)
                .load(getListMovie().get(position).getPhoto())
                .override(130, 170)
                .into(holder.imgPhoto);

        //Event Click ItemView
        //Berpindah halaman dengan cara mengklik itemview
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailMovie = new Intent(context, DetailMovie.class);
                detailMovie.putExtra(DetailMovie.EXTRA_MOVIE, listMovie.get(position));
                context.startActivity(detailMovie);
            }
        });
        //---

        //Event Click Button Detail
        //Berpindah dengan membawa data ke halaman DetailMovie
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailMovie = new Intent(context, DetailMovie.class);
                detailMovie.putExtra(DetailMovie.EXTRA_MOVIE, listMovie.get(position));
                context.startActivity(detailMovie);
            }
        });
        //--

        //Event Click Button Share
        //Memunculkan text Toast
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.btnShare.getContext(), "Share " +
                        listMovie.get(holder.getAdapterPosition()).getJudulFilm(), Toast.LENGTH_SHORT).show();
            }
        });
        //--
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvJudulFilm, tvTglRilis, tvDesFilm;
        Button btnShare, btnDetail;

        CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo);
            tvJudulFilm = itemView.findViewById(R.id.tv_judul_film);
            tvTglRilis = itemView.findViewById(R.id.tv_tgl_rilis);
            tvDesFilm = itemView.findViewById(R.id.tv_desc_film);
            btnShare = itemView.findViewById(R.id.btn_share);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}
