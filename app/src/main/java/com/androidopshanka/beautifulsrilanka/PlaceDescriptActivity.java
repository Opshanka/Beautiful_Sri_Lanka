package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class PlaceDescriptActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        String topics=intent.getStringExtra("place");
        String descriptions=intent.getStringExtra("description");

        setContentView(R.layout.activity_description);
        TextView topic=(TextView)findViewById(R.id.topicMainDes);
        TextView description=(TextView)findViewById(R.id.description);
        topic.setText(topics);
        description.setText(descriptions);
    }



}
