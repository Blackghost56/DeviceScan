package com.scan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.scan.fragment.ScanMultipleFragment;

public class ScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ScanMultipleFragment.newInstance())
                    .commitNow();
        }
    }
}