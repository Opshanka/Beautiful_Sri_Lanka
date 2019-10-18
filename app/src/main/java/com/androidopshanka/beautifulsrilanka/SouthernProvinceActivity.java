package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class SouthernProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_southern_province);
    }

    public void ambalangoda(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Ambalangoda";
        String description="Ambalangoda is served by Sri Lanka Railways' Coastal Line. Ambalangoda Railway Station is a major station on the line, and is connected to the major cities Colombo and Galle by rail. It is served by the A2 highway, which runs through the town. Kurundugahahetekma entrance of the E01 expressway is 13 kilometres (8.1 mi) from Ambalangoda and it takes about 45 minutes to travel via the Southern Expressway from Ambalangoda to Kottawa, a suburb of Colombo.The town is renowned for the manufacture of wooden masks and puppets.The traditional masks are carved from light Balsa like Kaduru wood (Nux vomica). Kaduru trees grow in the marshy lands bordering paddy fields. The wood is smoke dried for a week in preparation. The hand carved and hand painted masks in traditional dance dramas are both vibrant and colorful.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void kirinda(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Kirinda";
        String description="In second century, there was rising sea water level situation ( this may be the first Tsunami Situation recorded ins Sri Lanka) occurred in Kalaniya. People thought that it’s due to the sin committed by the king Kalanithissa, by ordering to kill a monk. So to amend that sin, he was asked to sacrifice his daughter , princes Viharamahadevi by setting her ashore.\n" +
                "\n" +
                "After her landing to the Kirinda area, king kawanthissa, who ruled Ruhunu kingdom, welcomed her and later got married. It is believed that the Lhugala Magul mahaviharaya was built on the site, where their wedding took place. They got two sons, prince Dutugamnu and prince Thissa";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void yala(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Yala";
        String description="Yala (යාල) National Park is the most visited and second largest national park in Sri Lanka, bordering the Indian Ocean. The park consists of five blocks, two of which are now open to the public, and also adjoining parks. The blocks have individual names such as, Ruhuna National Park (Block 1), and Kumana National Park or 'Yala East' for the adjoining area. It is situated in the southeast region of the country, and lies in Southern Province and Uva Province. The park covers 979 square kilometres (378 sq mi) and is located about 300 kilometres (190 mi) from Colombo. Yala was designated as a wildlife sanctuary in 1900, and, along with Wilpattu was one of the first two national parks in Sri Lanka, having been designated in 1938. The park is best known for its variety of wild animals. It is important for the conservation of Sri Lankan elephants, Sri Lankan leopards and aquatic birds.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void mirissa(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Mirissa";
        String description="Mirissa (Sinhala: මිරිස්ස) is a small town on the south coast of Sri Lanka, located in the Matara District of the Southern Province. It is approximately 150 kilometres (93 mi) south of Colombo and is situated at an elevation of 4 metres (13 ft) above sea level. Mirissa's beach and nightlife make it a popular tourist destination. It is also a fishing port and one of the island's main whale and dolphin watching locations.Mirissa is the largest fishing port on the south coast and is known for its tuna, mullet, snapper and butterfish. In 1980 the first tourist accommodation was built however it wasn't until the mid-1990s that tourism to the town started to dramatically increase";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
