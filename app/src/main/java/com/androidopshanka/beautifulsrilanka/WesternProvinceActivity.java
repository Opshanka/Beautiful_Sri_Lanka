package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class WesternProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_western_province);
    }

    public void gangaramayaDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Gangaramaya";
        String description="Gangaramaya is one of the oldest Buddhist temples in Colombo, started by the famous scholar monk Hikkaduwe Sri Sumangala Nayaka Thera in the late 19th Century.\n" +
                "\n" +
                "After the Venerable Sri Sumangala, his chief pupil Devundera Sri Jinaratana Nayake Thera took on the administration of the temple. It was he who laid the foundation to convert the little temple to an institute of international reckoning.\n" +
                "\n" +
                "The next chief incumbent was the Ven. Devundara Keerthi Sri Sumangala Jinaratana Vacissara Thera, the teacher of the Ven. Galboda Gnanissara, who worked to make the Gangaramaya what it is today: much more than a temple in the conventional term, but a place of worship, a seat of learning and a cultural centre.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void gallefaceDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Galle Face Green";
        String description="Galle Face Green originally extended over a much larger area than exists today. Records indicate that it was bounded to the north by Beira Lake, the ramparts of Colombo Fort and the city’s cemetery, to the west by the Indian Ocean, whilst to the south by the Galle Face Hotel (established in 1864, although the original building on the site was a Dutch villa) and to the east by St Peter's Church (consecrated in 1821). The Galle Face Green was initially laid out by the Dutch as a means to enable their cannons a strategic line of fire against the Portuguese. One version of how the name Galle Face is derived, is that it is from the original Dutch name for the fortifications, in that the gateway which gave access to the Colombo Fort was called the Gal Gate, as it faced southwards to Galle and faas means front, so it literally means in front of the fortification that faced toward Galle. Another version is it is a corruption of the original name for the area's rocky shoreline, Gal Bokka, Gal being the Sinhalese for rock and that Gal Gate actually meant rock gate.\n" +
                "\n" +
                "In 1856 the then Governor of British Ceylon, Sir Henry George Ward (1797–1860) authorised the construction of a 1 mile (1.6 km) promenade along the oceanside of the Galle Face Green, for ladies and children to saunter and ‘take in the air’. The promenade was subsequently completed in 1859.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void kalutharabodiya(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Kalutara Bodhiya";
        String description="Kalutara Bodhiya is a Bodhi tree (sacred fig) located in Kalutara, Western Province of Sri Lanka. Situated on the Galle Colombo main road, by the side of Kalu River just south to the Kalutara city, it is believed to be one of the 32 saplings of the Jaya Sri Maha Bodhi in Anuradhapura, Sri Lanka.A Buddhist temple Kalutara Viharaya and a modern Stupa, Kalutara Chaitya are located in close proximity to this sacred fig.One of the most venerated religious place in Sri Lanka, hundreds of Buddhists visit this religious place daily";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void negambolagoontour(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Negombo Lagoon";
        String description="Negombo Lagoon is a large estuarine lagoon in Negombo, south-west Sri Lanka.\n" +
                "\n" +
                "The lagoon is fed by a number of small rivers and a canal. It is linked to the sea by a narrow channel to the north, near Negombo city. It is surrounded by a densely populated region containing rice paddies, coconut plantations and grassland. The land is used for fishing and agriculture. The lagoon has extensive mangrove swamps and attracts a wide variety of water birds including cormorants, herons, egrets, gulls, terns and other waders. Negombo, Katunayake, Seeduwa are some nearby towns. Lagoon fishing is popular among the fishing community in Negombo. Lagoon crabs and lagoon prawns are in high taste and demand.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
