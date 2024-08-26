package com.tuanfadbg.samplecropviewnothinginside;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.isseiaoki.simplecropview.CropImageView;
import com.tuanfadbg.samplecropviewnothinginside.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        CropImageView cropImageView = new CropImageView(this);
    }
}