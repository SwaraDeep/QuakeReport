package com.example.android.quakereport;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.content.AsyncTaskLoader;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;

    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        return QueryUtils.fetchEarthquakeData(mUrl);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
}
