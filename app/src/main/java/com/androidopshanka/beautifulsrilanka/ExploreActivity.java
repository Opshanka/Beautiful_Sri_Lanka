package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class ExploreActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_sri_lanka);
    }

    public void centralProvince(View view){
        Intent intentCentral=new Intent(this, CentralProvinceActivity.class);
        startActivity(intentCentral);
    }

    public void westernProvince(View view){
        Intent intentWestern=new Intent(this, WesternProvinceActivity.class);
        startActivity(intentWestern);
    }


    public void northcentralProvince(View view) {
        Intent intentWestern=new Intent(this, NorthCentralProvinceActivity.class);
        startActivity(intentWestern);
    }

    public void northwesternProvince(View view) {
        Intent intentWestern=new Intent(this, NorthWesternProvinceActivity.class);
        startActivity(intentWestern);
    }

    public void sabaragamuwaProvince(View view) {
        Intent intentWestern=new Intent(this, SabaragamuwaProvinceActivity.class);
        startActivity(intentWestern);
    }

    public void southern_province(View view) {
        Intent intentWestern=new Intent(this,SouthernProvinceActivity.class);
        startActivity(intentWestern);
    }

    public void nothernProvince(View view) {
        Intent intentWestern=new Intent(this,NorthernProvinceActivity.class);
        startActivity(intentWestern);

    }

    public void easternProvince(View view) {
        Intent intentWestern=new Intent(this,EasternProvinceActivity.class);
        startActivity(intentWestern);
    }

    public void uvaProvince(View view) {
        Intent intentWestern=new Intent(this,UvaProvinceActivity.class);
        startActivity(intentWestern);
    }
}
