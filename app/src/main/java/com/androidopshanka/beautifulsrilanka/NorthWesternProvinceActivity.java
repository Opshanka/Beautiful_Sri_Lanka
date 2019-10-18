package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class NorthWesternProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_north_western_province_province);
    }

    public void anawilundawa(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="The Anawilundawa Bird Sanctuary";
        String description="The Anawilundawa Bird Sanctuary is situated in the Puttalam district in the North Western province of the country; between Chilaw and Puttlam – to be more specific - it is situated between the coast and the Chilaw-Puttlam railway line.\n" +
                "\n" +
                "The uniqueness of Anawilundawa is its immediate proximity to three vastly different ecosystems; the coast, the mangroves and the fresh water tanks making it one of the six RAMSAR Wetlands in Sri Lanka. This unique ecological setting has made it a favourable nesting and breeding ground for hundreds of species of birds.\n" +
                "\n" +
                "It is set out on 1,397 hectares of forest land and comprises of nine tanks; six giant manmade cascading tanks namely Pinkattiya, Maradansola, Anawilundawa, Mayyawa, Surawila and Vellawali and three secondary tanks, each one connected with the other and working as one unit. These tanks store water for irrigation and cultivation and acts as a natural habitat and refuge for 150 species of water birds in addition to a few species of threatened Fish, Amphibians, Mammals, and Reptiles.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void yapahuwa(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Yapahuwa Rock Fortress";
        String description="As our tour bus rolled up to the Yapahuwa Rock Fortress, I don’t think any of us were quite prepared for the steep adventure that we’d soon be on.  The sun was shining bright, it was ridiculously humid (standard for Sri Lanka), and almost all of our tour group were wearing flip-flops…which we all soon discovered was not ideal for the day’s activity!\n" +
                "\n" +
                "After two different month-long trips to Sri Lanka in previous years, I still somehow had never heard of this fascinating & beautiful destination in Sri Lanka!  The Yapahuwa Rock Fortress may not be one of the most iconic or well-known places to visit, but it’s certainly up there when it comes to Sri Lanka’s best hidden-gems!";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void ridiviharaya(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Silver Temple";
        String description="Meaning “Silver Temple”, the Sinhala name of this temple comes from the fact that a silver ore was discovered at the site. King Dutugemunu built the Viharaya in the 2nd Century BC. The temple has two stupas with the original temple believed to have been located around the “Sarasum Gala” stupa. Interesting elements of the Viharaya include the gold plated Buddha statue donated by King Dutugemunu and the Old Dutch floor tiles laid by the reclining Buddha statue. The tiles are reputedly a gift by a Dutch envoy.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void kalpitiya(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Kalpitiya Beach Sri Lanka";
        String description="The Sinhalese chronicle Mahavamsa states that prince Vijaya landed in a place not too far from the present day Kalpitiya. A sandy headland which keeps the Kalpitiya lagoon sheltered from the Indian Ocean, the blue water with a calm surface beacons the kite surfers to try the breeze coming across the peninsular towards the land and enjoy a trouble free ride without the hassle of a sudden guest, which as every kite surfer knows can be a trifle more than tricky to handle on a board.\n" +
                "\n" +
                "Kalpitiya is also the best place to see Dolphins and during the season you can witness Dolphin pods up to 1000 to 1500 members at most given times. We can arrange accommodation in a basic holiday cottage or a nice beach villa in Kalpitiya area or get a boat ride organised from Negombo and proceed to Kalpitya by sea, known hotspot for reef sharks, manta rays and occasionally turtles, in our opinion a week’s holiday here of snorkelling and diving will barely scratch the surface of what’s on offer";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
