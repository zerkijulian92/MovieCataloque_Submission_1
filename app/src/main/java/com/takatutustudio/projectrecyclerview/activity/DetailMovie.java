package com.takatutustudio.projectrecyclerview.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.takatutustudio.projectrecyclerview.R;
import com.takatutustudio.projectrecyclerview.model.Movie;

public class DetailMovie extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);


        Toolbar titleToolbar        = findViewById(R.id.toolbar);
        ImageView imgPhotoTollbar   = findViewById(R.id.img_photo_toolbar);
        ImageView imgPhoto          = findViewById(R.id.img_photo);
        TextView tvJudulFilm        = findViewById(R.id.tv_judul_film);
        TextView tvTglRilis         = findViewById(R.id.tv_tgl_rilis);
        TextView tvRangking         = findViewById(R.id.tv_rangking);
        TextView tvKepopuleran      = findViewById(R.id.tv_kepopuleran);
        TextView tvDesFilm          = findViewById(R.id.tv_desc_film);
        final Button btnBuyTicket         = findViewById(R.id.btn_buy_ticket);
        final Button btnTopUp             = findViewById(R.id.btn_top_up);

        final Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        Glide.with(this)
                .load(movie.getPhoto())
                .override(130, 170)
                .into(imgPhoto);

        Glide.with(this)
                .load(movie.getPhoto())
                .into(imgPhotoTollbar);

        //Memunculkan Icon Back Di Halaman Detail Costum Toolbar
        //langkah 1 - Mendeklarasikan terlebih dahulu ID dari Toolbar
        //disini ID tollbar yaitu titleToolbar
        //lalu periksa AndroidManifest.xml
        //tambahkan di activity DetailMovie | android:parentActivityName=".activity.MainActivity"
        setSupportActionBar(titleToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //--

        titleToolbar.setTitle(movie.getJudulFilm());
        tvJudulFilm.setText(movie.getJudulFilm());
        tvTglRilis.setText(movie.getTglRilis());
        tvRangking.setText(movie.getRangking());
        tvKepopuleran.setText(movie.getKepopuleran());
        tvDesFilm.setText(movie.getDescFilm());

        //Event Click Btn Buy Ticket
        btnBuyTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(btnBuyTicket.getContext(), "Buy ticket Movie " +
                        movie.getJudulFilm(),Toast.LENGTH_SHORT).show();
            }
        });

        //Event Click Btn Top Up
        btnTopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(btnTopUp.getContext(), "Maaf, layanan TOP UP belum bisa digunakan! ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
