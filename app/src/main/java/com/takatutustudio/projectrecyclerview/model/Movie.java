package com.takatutustudio.projectrecyclerview.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    //Create implementation Parcelable to this class
    private String judulFilm;
    private String tglRilis;
    private String kepopuleran;
    private String rangking;
    private String descFilm;
    private String photo;
    //--

    //Memanggil class dari MovieData
    public Movie() {
    }
    //--

    protected Movie(Parcel in) {
        judulFilm = in.readString();
        tglRilis = in.readString();
        kepopuleran = in.readString();
        rangking = in.readString();
        descFilm = in.readString();
        photo = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getTglRilis() {
        return tglRilis;
    }

    public void setTglRilis(String tglRilis) {
        this.tglRilis = tglRilis;
    }

    public String getKepopuleran() {
        return kepopuleran;
    }

    public void setKepopuleran(String kepopuleran) {
        this.kepopuleran = kepopuleran;
    }

    public String getRangking() {
        return rangking;
    }

    public void setRangking(String rangking) {
        this.rangking = rangking;
    }

    public String getDescFilm() {
        return descFilm;
    }

    public void setDescFilm(String descFilm) {
        this.descFilm = descFilm;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(judulFilm);
        parcel.writeString(tglRilis);
        parcel.writeString(kepopuleran);
        parcel.writeString(rangking);
        parcel.writeString(descFilm);
        parcel.writeString(photo);
    }
}
