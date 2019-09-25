package com.takatutustudio.projectrecyclerview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.takatutustudio.projectrecyclerview.R;
import com.takatutustudio.projectrecyclerview.adapter.ItemCardViewAdapter;
import com.takatutustudio.projectrecyclerview.data.MovieData;
import com.takatutustudio.projectrecyclerview.model.Movie;

import java.util.ArrayList;

//Note:
//Untuk mengubah font di Action bar silahkan cek di styles.xml
//Cek AppTheme
//Ubah Font di Android:fontfamily
//---

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMovie;
    private ArrayList<Movie> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menganti Judul Halaman secara langsung
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Movie Catalogue");
        }
        //--

        rvMovie = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(MovieData.getListData());

        //Memanggil RecyclerView berupa list di halaman utama
        showRecyclerViewList();
        //--
    }

    private void showRecyclerViewList() {
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        ItemCardViewAdapter cardAdapter = new ItemCardViewAdapter(this);
        cardAdapter.setListMovie(list);
        rvMovie.setAdapter(cardAdapter);
    }

    //Memunculkan Menu Action Bar
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

    private void setMode(int itemId) {
        switch (itemId) {
            case R.id.about:
                Intent gotoabout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(gotoabout);
                break;
        }
    }
    //--
}
