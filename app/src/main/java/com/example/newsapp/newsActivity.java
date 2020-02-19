package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.os.Bundle;

import java.util.List;

public class newsActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<news>> {

    private String USGS_REQUEST_URL="https://content.guardianapis.com/search?api-key=32949965-c83e-4ac0-9f44-88de07c09e61";

    @NonNull
    @Override
    public Loader<List<news>> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<news>> loader, List<news> data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<news>> loader) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
