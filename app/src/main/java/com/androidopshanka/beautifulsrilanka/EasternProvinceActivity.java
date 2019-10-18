package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class EasternProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_eastern_province);
    }

    public void kumanaDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Kumana National Park";
        String description="Kumana National Park in Sri Lanka is renowned for its avifauna, particularly its large flocks of migratory waterfowl and wading birds. The park is 391 kilometres (243 mi) southeast of Colombo on Sri Lanka's southeastern coast.Kumana is contiguous with Yala National Park. Kumana was formerly known as Yala East National Park, but changed to its present name on 5th September 2006.\n" +
                "\n" +
                "The park was closed from 1985 to March 2003 because of the LTTE (Liberation Tigers of Tamil Elam) attacks. It was also affected by the Boxing Day tsunami in 2004.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void somawathiyaDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Somawathiya National Park";
        String description="Somawathiya National Park is one of the four national parks designated under the Mahaweli River development project.Somawathiya Chaitya, a stupa said to be containing a relic of the tooth of the Buddha, is situated within the park.The park was created on 2 September 1986, having been originally designated a wildlife sanctuary on 9 August 1966.The park is home to many megaherbivores.The national park is located 266 kilometres (165 mi) north-east of Colombo.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void nilaveliDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Nilaveli ";
        String description="Nilaveli (Tamil: நிலவெலி), (Sinhala: නිලාවැලි) is a coastal resort town and suburb of the Trincomalee District, Sri Lanka located 16 km northwest of the city of Trincomalee. A historically popular Tamil village and tourist destination of the district alongside the nearby Uppuveli, the numbers of visitors declined following the 2004 Indian Ocean tsunami and Sri Lankan Civil War, but have risen again since 2010. Pigeon Island National Park, one of the two marine national parks of the region is situated 1 km off the coast of Nilaveli, its many species of vegetation, coral and reef fish contributing to Nilaveli's rich biodiversity";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void trincomaleeDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Trincomalee";
        String description="Trincomalee also known as Gokanna/Gokarna,[1] is the administrative headquarters of the Trincomalee District and major resort port city of Eastern Province, Sri Lanka. Located on the east coast of the island overlooking the Trincomalee Harbour, 237 kilometres (147 mi) north-east of Colombo, 182 kilometres (113 mi) south-east of Jaffna and 111 kilometres (69 mi) miles north of Batticaloa, Trincomalee has been one of the main centres of Sri Lankan Tamil language speaking culture on the island for over two millennia. With a population of 99,135";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
