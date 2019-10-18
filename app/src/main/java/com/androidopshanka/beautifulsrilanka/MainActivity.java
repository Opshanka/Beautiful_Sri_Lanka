package com.androidopshanka.beautifulsrilanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.androidopshanka.beautifulsrilanka.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void explore(View v) {

        Intent intent=new Intent(this, ExploreActivity.class);
        startActivity(intent);

    }


}
