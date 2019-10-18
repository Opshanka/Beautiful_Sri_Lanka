package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class UvaProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_uva_province);
    }

    public void ninearchDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="The Nine Arch Bridge";
        String description="The Nine Arch Bridge (Sinhala: ආරුක්කු නමයේ පාලම,) also called the Bridge in the Sky,is a viaduct bridge in Sri Lanka. It is one of the best examples of colonial-era railway construction in the country.The construction of the bridge is generally attributed to a local Ceylonese builder, P. K. Appuhami, in consultation with British engineers. The chief designer and project manager of the 'upcountry railway line of Ceylon' project was D. J. Wimalasurendra, a distinguished Ceylonese engineer and inventor. The designer of the viaduct was Harold Cuthbert Marwood of Railway Construction Department of Ceylon Government Railway. The 1923 report titled \"Construction of a Concrete Railway Viaduct in Ceylon\" published by the Engineering Association of Ceylon has details of all the records including the plans and drawings.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void diyalumaDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Diyaluma Falls";
        String description="Diyaluma Falls is 220 m (720 ft) high and the second highest waterfall in Sri Lanka and 361st highest waterfall in the world.It is situated 6 km (3.7 mi) away from Koslanda in Badulla District on Colombo-Badulla highway. The Falls are formed by Punagala Oya, a tributary of Kuda Oya which in turn, is a tributary of Kirindi Oya.In Sinhalese, Diyaluma or Diya Haluma means \"rapid flow of water\" or may be translated as \"liquid light\". According to Sri Lankan historian, Dr. R. L. Brohier, Diyaluma is the setting of the folklore about a tragedy involving a young chieftain who had been banished to the highlands and the attempt by his betrothed to join. As all the passes were guarded the young man let down a rope of twisted creepers over the escarpment, as she was hauled up she was dashed against the rocks and died. The Gods, moved to pity by the harrowing spectacle, caused a stream of water to gush from the mountain and veil all evidence of the tragedy in a watery light, hence the term Diyaluma.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void ellarockDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Ella";
        String description="Ella is a small laid back town that is now frequented by the backpackers from around the world. Much of the rise in recent tourist boom can be associated to the popularity of ella and surrounding area. While nuwera eliaya has been a popular destintation for a long time, the less amount of activities made the younger and adventure seeking backpacking crowd to look for alternative destinations.\n" +
                "\n" +
                "One of the pillarsone in ella is ella rock. This mountain projection has a great view of the surrounding and in the dry months of March and April, with less mist and cloud cover one could see a fair bit of distance from the top of it.There is a good hike also";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void liptonseatDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="The Lipton’s Seat";
        String description="The Lipton’s Seat lookout is one of Sri Lanka's most impressive viewpoints (unless it's misty and cloudy of course, which is why early morning is the best time to visit). The Scottish tea baron Sir Thomas Lipton used to survey his burgeoning empire from here, and today it's said you can see across emerald hills and tea estates to no fewer than seven different provinces.To hike to the lookout, take the signed narrow paved road from the Dambatenne Tea Factory and climb about 8km through lush tea plantations. It's also possible to drive up – tuk-tuks charge around Rs 2500 return from Haputale. Look forward to the company of Tamil tea pickers going off to work as you walk uphill";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
