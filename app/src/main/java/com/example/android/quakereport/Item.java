package com.example.android.quakereport;


import java.util.ArrayList;

public class Item{
    private String mMag;
    private String mPlace;
    private String mDate;

    public Item(String mag, String place, String date){
        mMag = mag;
        mPlace = place;
        mDate = date;
    }

    public String getmMag() {
        return mMag;
    }

    public String getmPlace() {
        return mPlace;
    }

    public String getmDate() {
        return mDate;
    }
}
