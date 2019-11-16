package com.googles.hariketiga;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {


    // membuat variabel dari class makanan
    int id;
    String nama;
    int photo;
    String detail;

    // constructor class makanan
    public Makanan(int id, String nama, int photo, String detail) {
        this.id = id;
        this.nama = nama;
        this.photo = photo;
        this.detail = detail;
    }

    protected Makanan(Parcel in) {
        id = in.readInt();
        nama = in.readString();
        photo = in.readInt();
        detail = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt( id );
        dest.writeString( nama );
        dest.writeInt( photo );
        dest.writeString( detail );
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan( in );
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
