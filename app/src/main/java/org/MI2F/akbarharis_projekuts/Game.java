package org.MI2F.akbarharis_projekuts;

import android.os.Parcel;
import android.os.Parcelable;

public class Game implements Parcelable {
    private String nama_game;
    private String detail_game;
    private String photo;
    private String harga;

    public Game() {

    }

    protected Game(Parcel in) {
        nama_game = in.readString();
        detail_game = in.readString();
        photo = in.readString();
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
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
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama_game);
        dest.writeString(detail_game);
        dest.writeString(photo);
        dest.writeString(harga);
    }
}
