package com.example.android.quakereport;


public class Item{
    private double mMag;
    private String mPlace;
    private String mDate;
    private String mTime;
    private String mSpeed;
    private String mUrl;

    public Item(double mag, String speed, String place, String date, String time, String url) {
        mMag = mag;
        mPlace = place;
        mDate = date;
        mSpeed = speed;
        mTime = time;
        mUrl = url;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmSpeed() {
        return mSpeed;
    }

    public double getmMag() {
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
