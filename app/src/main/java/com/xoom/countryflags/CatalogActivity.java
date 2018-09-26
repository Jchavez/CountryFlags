package com.xoom.countryflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xoom.countryflags.catalog.ui.CatalogFragment;

public class CatalogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalog_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, CatalogFragment.newInstance())
                .commitNow();
        }
    }
}
