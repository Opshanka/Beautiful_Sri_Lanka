package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class SabaragamuwaProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_sabaragamuwa_province);
    }

    public void kithulgala(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Kitulgala";
        String description="Kitulgala is a small town in the west of Sri Lanka. A rain forestry area, which gets two monsoons each year, and is one of the wettest places in Sri Lanka. Nevertheless, it comes alive in the first three months of the year, especially in February, the driest month. The Academy Award-winning movie The Bridge on the River Kwai was filmed on the Kelani River near Kitulgala, although nothing remains now except the concrete foundations for the bridge Kitulgala is the base for white-water rafting in Sri Lanka.\n" +
                "\n" +
                "Large numbers of people make the excursion from Colombo at weekends to enjoy the beautiful scenery, play in the river, Jungle Walks, Adventurous water fall jumps/ slides, White Water Rafting and have an excellent rice and curry lunch at the local restaurants.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void pinnawala(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Pinnawala Elephant Orphanage";
        String description="Pinnawala Elephant Orphanage is an orphanage, nursery and captive breeding ground for wild Asian elephants located at Pinnawala village, 13 km (8.1 mi) northeast of Kegalle town in Sabaragamuwa Province of Sri Lanka. Pinnawala has the largest herd of captive elephants in the world. In 2011, there were 96 elephants, including 43 males and 68 females from 3 generations, living in Pinnawala.\n" +
                "\n" +
                "The orphanage was founded to care and protect the many orphaned unweaned wild elephants found wandering in and near the forests of Sri Lanka. It was established in 1975 by the Sri Lanka Department of Wildlife Conservation (DWC).";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void uthuwankanda(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Utuwankande";
        String description="Deekirikevage Saradiel widely famous as Utuwankande Sura Saradiel,translation:Saradiel the Hero of Mountain Utuwan (Sinhala: උතුවන්කන්දේ සුර සරදියෙල්; 25 March 1832 – 7 May 1864) is a Ceylonese gang leader and bandit who became a legendary figure in Sri Lanka known as the \"Robin Hood of Sri Lanka\". Some Sri Lankan scholars place him in the context of regional insurgencies of against British Colonial rule rather than a manifestation of local lawlessness or economic justice . Due to superstition he was believed to have the power of not being seen and that he was bullet proof. Many believe that this is because he had \"yantra\" on his arm which lent him such powers.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void bathalegala(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Bible Rock [ Bathalegala ] Hiking";
        String description="The height of the rock is stated as 797.7 m in the survey map. The breadth spans a whopping 710 m across the rock surface. The surface is mostly flat covered in mana and some woods here and there.\n" +
                "\n" +
                "If you are starting from the trailhead, the elevation gain would be around 150m. You can also start the hike from Hathgampola town. In that case, the elevation gain would be around 500m.Bathalegala is located close to Aranayake. Whether you’re coming from Colombo or Kandy, turn onto Aranayake road at Mawanella. Follow the road until Gevilipitiya, turn right at the junction and drive about 2km to Hathgampola town. From there you’ll have to turn right to a narrow road (Bathalegala road) with a signboard “to the Bathalegala road” printed in Sinhala. ";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
