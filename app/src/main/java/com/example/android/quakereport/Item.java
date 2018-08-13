package com.example.android.quakereport;


public class Item{
    private String mMag;
    private String mPlace;
    private String mDate;
    private String mTime;

    public Item(String mag, String place, String date, String time) {
        mMag = mag;
        mPlace = place;
        mDate = date;
        mTime = time;
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

    public String getmTime() {
        return mTime;
    }
}
