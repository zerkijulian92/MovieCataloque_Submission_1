package com.takatutustudio.projectrecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.takatutustudio.projectrecyclerview.R;
import com.takatutustudio.projectrecyclerview.adapter.ItemCardViewAdapter;
import com.takatutustudio.projectrecyclerview.data.MovieData;
import com.takatutustudio.projectrecyclerview.model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMovie;
    private ArrayList<Movie> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovie     = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(MovieData.getListData());

        //Memanggil RecyclerView berupa list di halaman utama
        showRecyclerViewList();
    }

    private void showRecyclerViewList() {
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        ItemCardViewAdapter cardAdapter = new ItemCardViewAdapter(this);
        cardAdapter.setListMovie(list);
        rvMovie.setAdapter(cardAdapter);
    }
}
