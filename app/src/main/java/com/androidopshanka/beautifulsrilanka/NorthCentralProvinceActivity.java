package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class NorthCentralProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_north_central_province);
    }

    public void jaya_sri_maha_bodhi(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Jaya Sri Maha Bodhi";
        String description="Jaya Sri Maha Bodhi is a sacred fig tree in the Mahamewna Gardens, Anuradhapura, Sri Lanka. It is said to be the southern branch from the historical Sri Maha Bodhi at Buddha Gaya in India under which Lord Buddha attained Enlightenment. It was planted in 288 BC,and is the oldest living human-planted tree in the world with a known planting date.Today it is one of the most sacred relics of the Buddhists in Sri Lanka and respected by Buddhists all over the world.\n" +
                "\n" +
                "The other fig trees that surround the sacred tree protect it from storms and animals such as monkeys, bats, etc.\n" +
                "\n" +
                "In April 2014, the government banned all construction within 500 meters of the tree. Only construction that obviously will not harm the tree will be allowed";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void mihintale(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Mihintale";
        String description="Approximately 12.5 km (7.8 mi) east of Anuradhapura, close to the Anuradhapura - Trincomalee Road is situated the \"Missaka Pabbata\" which is 1,000 feet (300 m) in height and is one of the peaks of a mountainous range.\n" +
                "\n" +
                "According to Dipavamsa and Mahavamsa, Thera Mahinda came to Sri Lanka from India on the full moon day of the month of Poson (June) and met King Devanampiyatissa and the people, and preached the doctrine. The traditional spot where this meeting took place is revered by the Buddhists of Sri Lanka. Therefore, in the month of Poson, Buddhists make their pilgrimage to Anuradhapura and Mihintale.\n" +
                "\n" +
                "“Mahinda” was the son of Emperor Ashoka of India. King Ashoka embraced Buddhism after he was inspired by a very small monk named “Nigrodha.” The King who was in great misery after seeing the loss of life caused by his waging wars to expand his empire, was struck by the peaceful countenance of such a young monk. Meeting this young monk made a turning point in his life and he thereafter, renounced wars. He was determined to spread the message of peace, to neutralize the effects from the damages caused by him through his warfare. As a result, both his son and daughter were ordained as Buddha disciples, and became enlightened as Arahats. In his quest to spread the message of peace instead of war, he sent his son Mahinda, to the island of Lanka, which was also known as “Sinhalé”. This island was being ruled by his pen friend King Devanampiyatissa. Thus, “Mahinda” was the exclusive Indian name which in Sinhalé, became commonly known as “Mihindu” in the local vernacular “Sinhala”.\n" +
                "\n" +
                "In Sinhala Mihin-Thalé literally means the “plateau of Mihindu”. This plateau is the flat terrain on top of a hill from where Arahat Mihindu was supposed to have called King Devanampiyatissa, by the King's first name to stop him shooting a deer in flight. Hence, “Mihin Thalé” is a specifically Sinhala term. This is how the place has been called and still is, in the local vernacular “Sinhala”. A study of the local vernacular will give ample proof for this.\n" +
                "\n" +
                "This is said have been called Cetiyagiri or Sagiri, even though it was more popularly known as Mihintale - the cradle of Buddhism in Sri Lanka.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void ruwanwelisaya_side_view(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Ruwanwelisaya stupa";
        String description="The Ruwanwelisaya is a stupa and a hemispherical structure containing relics, in Sri Lanka, considered sacred to many Buddhists all over the world.It was built by King Dutugemunuc. 140 B.C., who became King of all Sri Lanka after a war in which the Chola King Elāra (Ellalan) was defeated. It is also known as \"Mahathupa\", \"Swarnamali Chaitya\", \"Suvarnamali Mahaceti\" (in Pali) and \"Rathnamali Dagaba\". Two quarts or one Drona of the Gothama Buddha's relics are enshrined in the stupa, which is the largest collection of his relics anywhere.\n" +
                "\n" +
                "This is one of the \"Solosmasthana\" (the 16 places of veneration) and the \"Atamasthana\" (the 8 places of veneration in the ancient sacred city of Anuradhapura). The stupa is one of the world's tallest ancient monuments, standing at 103 m (338 ft) and with a circumference of 290 m (951 ft). The original stupa had been about 55 m (180 ft) in height and was renovated by many kings.The Kaunghmudaw Pagoda in Sagaing, Myanmar is modelled after this stupa.The Mahavamsa contains a detailed account on the construction and the opening ceremony of the stupa.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void kawudullanational(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Kaudulla National Park";
        String description="Kaudulla National Park is a national park on the island of Sri Lanka located 197 kilometres (122 mi) away from the largest city, Colombo. It was designated a national park on April 1, 2002 becoming the 15th such area on the island. In the 2004–2005 season more than 10,000 people visited the National Park, generating an income of Rs.100,000 from entrance fees.Along with Minneriya and Girithale BirdLife International have identified Kaudulla as an Important Bird Area.\n" +
                "\n" +
                "Historically Kaudulla was one of the 16 irrigation tanks built by King Mahasen.Following a period of abandonment it was reconstructed in 1959. It now attracts and supports a variety of plant and animal life, including large mammals, fish and reptiles.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
