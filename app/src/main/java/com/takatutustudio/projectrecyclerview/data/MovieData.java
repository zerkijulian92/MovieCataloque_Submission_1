package com.takatutustudio.projectrecyclerview.data;

import com.takatutustudio.projectrecyclerview.model.Movie;

import java.util.ArrayList;

public class MovieData {
    //Array data yang akan muncul di RecyclerView
    public static String[][] data = new String[][] {
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
            {"Judul Film", "Tanggal Rilis", "Kepopuleran", "Peringkat", "Desc Film", "Photo"},
    };
    //--

    //Data yang akan dihubungkan ke Movie model
    public static ArrayList<Movie> getListData() {
        Movie movie;
        ArrayList<Movie> list = new ArrayList<>();

        for (String[] mData : data) {
            movie = new Movie();
            movie.setJudulFilm(mData[0]);
            movie.setTglRilis(mData[1]);
            movie.setKepopuleran(mData[2]);
            movie.setRangking(mData[3]);
            movie.setDescFilm(mData[4]);
            movie.setPhoto(mData[5]);


            list.add(movie);
        }

        return list;
    }
}

