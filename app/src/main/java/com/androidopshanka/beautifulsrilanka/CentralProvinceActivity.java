package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class CentralProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_central_province);

    }


    public void rambodaDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Ramboda Waterfalls";
        String description="Height : 109 m\n" +
                "Ranking in Sri Lanka : 11th Tallest\n" +
                "Ranking in World : 729th Tallest\n" +
                "Location : A5 Highway, Ramboda Pass, Pussellawa area, Nuwara Eliya\n" +
                "Height from Sea Level : 945m\n" +
                "Water Volume : During normal periods of the year Dunsinane Falls which falls on the right receives more volume of water than Ramboda falls. However during periods of drought the role is reversed as Dunsinane Falls, whose tributary passes through farming lands before falling, has less water coming through compared to Ramboda Falls whose tributary passes through a forest reserve. In this case, instead of Ramboda Falls having more water it is more due to Dunsinane receiving less water while Ramboda remains the same.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);

    }

    public void temple(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="The Temple of the Sacred Tooth Relic";
        String description="Sri Dalada Maligawa or the Temple of the Sacred Tooth Relic is a Buddhist temple in the city of Kandy, Sri Lanka. It is located in the royal palace complex of the former Kingdom of Kandy, which houses the relic of the tooth of the Buddha. Since ancient times, the relic has played an important role in local politics because it is believed that whoever holds the relic holds the governance of the country. Kandy was the last capital of the Sri Lankan kings and is a World Heritage Site mainly due to the temple.\n" +
                "\n" +
                "Bhikkhus of the two chapters of Malwatte and Asgiriya conduct daily worship in the inner chamber of the temple. Rituals are performed three times daily: at dawn, at noon and in the evenings. On Wednesdays, there is a symbolic bathing of the relic with an herbal preparation made from scented water and fragrant flowers called Nanumura Mangallaya. This holy water is believed to contain healing powers and is distributed among those present.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void templeDabulla(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Dambulla cave temple";
        String description="Dambulla cave temple (Sinhalese: Dam̆būlū Len Vihāraya, Tamil Tampuḷḷai Poṟkōvil) also known as the Golden Temple of Dambulla is a World Heritage Site (1991) in Sri Lanka, situated in the central part of the country.[1] This site is situated 148 kilometres (92 mi) east of Colombo , 72 kilometres (45 mi) north of Kandy and 43 km (27 mi) north of Matale\n" +
                "\n" +
                "Dambulla is the largest and best-preserved cave temple complex in Sri Lanka. The rock towers 160 m over the surrounding plains.There are more than 80 documented caves in the surrounding area. Major attractions are spread over five caves, which contain statues and paintings. These paintings and statues are related to Gautama Buddha and his life. There are a total of 153 Buddha statues, three statues of Sri Lankan kings and four statues of gods and goddesses. The latter include Vishnu and the Ganesha. The murals cover an area of 2,100 square metres (23,000 sq ft). Depictions on the walls of the caves include the temptation by the demon Mara, and Buddha's first sermon.\n" +
                "\n" +
                "Prehistoric Sri Lankans would have lived in these cave complexes before the arrival of Buddhism in Sri Lanka as there are burial sites with human skeletons about 2700 years old in this area, at Ibbankatuwa near the Dambulla cave complexes.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void sigiriya(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Sigiriya";
        String description="Sigiriya or Sinhagiri (Lion Rock Sinhala: සීගිරිය, Tamil: சிகிரியா, pronounced see-gi-ri-yə) is an ancient rock fortress located in the northern Matale District near the town of Dambulla in the Central Province, Sri Lanka. The name refers to a site of historical and archaeological significance that is dominated by a massive column of rock nearly 200 metres (660 ft) high.[citation needed]\n" +
                "\n" +
                "According to the ancient Sri Lankan chronicle the Culavamsa, this site was selected by King Kashyapa (477 – 495 CE) for his new capital. He built his palace on the top of this rock and decorated its sides with colourful frescoes. On a small plateau about halfway up the side of this rock he built a gateway in the form of an enormous lion. The name of this place is derived from this structure — Sīnhāgiri, the Lion Rock (an etymology similar to Sinhapura, the Sanskrit name of Singapore, the Lion City).";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
