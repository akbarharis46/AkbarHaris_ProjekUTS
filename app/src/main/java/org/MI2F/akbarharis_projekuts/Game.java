package org.MI2F.akbarharis_projekuts;

import android.os.Parcel;
import android.os.Parcelable;

public class Game implements Parcelable {
    private String nama_game;
    private String detail_game;
    private int photo;
    private String harga;

    public Game() {

    }

    public String getNama_game() {
        return nama_game;
    }

    public void setNama_game(String nama_game) {
        this.nama_game = nama_game;
    }

    public String getDetail_game() {
        return detail_game;
    }

    public void setDetail_game(String detail_game) {
        this.detail_game = detail_game;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_game);
        parcel.writeString(detail_game);
        parcel.writeInt(photo);
        parcel.writeString(harga);
    }

    protected Game(Parcel in) {
        nama_game = in.readString();
        detail_game = in.readString();
        photo = in.readInt();
        harga = in.readString();
    }

    public static final Creator<Game> CREATOR = new Creator<Game>() {
        @Override
        public Game createFromParcel(Parcel in) {
            return new Game(in);
        }

        @Override
        public Game[] newArray(int size) {
            return new Game[size];
        }
    };
}
