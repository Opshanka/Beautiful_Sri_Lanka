package com.androidopshanka.beautifulsrilanka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.androidopshanka.beautifulsrilanka.R;

public class NorthernProvinceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_nothern_province);
    }

    public void nagadeepayaDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Nagadeepa Purana Temple";
        String description="Nagadeepa Purana Vihara (Sinhala: නාගදීප පුරාණ විහාරය, Tamil: நயினாதீவு நாக விகாரை) is an ancient Buddhist temple situated in Jaffna district of Northern Province, Sri Lanka. It is among the country's sixteen holiest Buddhist shrines (Solosmasthana).According to contemporary history, the Gautama Buddha visited the site after five years of attaining Enlightenment to settle the dispute between two warring Naga kings, Chulodara and Mahodara.\n" +
                "\n" +
                "Ancient history according to the Mahavamsa chronicles and the Tamil Buddhist epic Manimekalai mentions a gem-studded throne and a stone with the Buddha’s footprint at the island Nainativu, (also known as Nagadeepa) which pilgrims from India visited.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void maduchurchDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Shrine of Our Lady of Madhu";
        String description="The Shrine of Our Lady of Madhu is a Roman Catholic Marian shrine in Mannar district of Sri Lanka. With a history of over 400 years, this shrine acts as a center for pilgrimage and worship for Sri Lankan Catholics.The site is considered as the holiest Catholic shrine in the island and is a well known place of devotion for both Tamil and Sinhalese Catholics. The church has been a symbol of unity not just between Tamils and Sinhalese, but also between people of different religions, including Buddhists, Hindus and Protestants.\n" +
                "\n" +
                "Pope Pius XI granted the image of Our Lady of Madhu a Canonical coronation on 2 July 1924. Attendance for the August festival at times touched close to a million people before the outbreak of the Sri Lankan Civil War.Situated in the heart of the conflict zone, pilgrimage to this shrine was dramatically affected by the Civil War with the presence of refugee camps around the shrine complex.It was shelled a number of times.";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void delfDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Delft Island Fort";
        String description="Delft Island Fort (Tamil: நெடுந்தீவுக் கோட்டை, romanized: Neṭuntīvuk Kōṭṭai; Sinhala: ඩෙල්ෆ් බලකොටුව, romanized: Delf Balakotuwa, locally known as Neduntheevu fort and Meekaman fort) are ruins of a fort located on the island of Neduntheevu in the Palk Strait in northern Sri Lanka.\n" +
                "\n" +
                "Traditionally attributed to the Karaiyar king Meekaman, the fort was probably built by the Portuguese.Later, it was taken over by Dutch, who built a barrack nearby. The island was known to the Portuguese as Ilha das Vacas (\"Island of the Cows\"), was renamed by the Dutch as Delft Island.\n" +
                "\n" +
                "The fort was constructed out of limestone and coral. Though now in ruins, Ralph Henry Bassett describes the fort as a \"very strongly fortified fort\" in his book Romantic Ceylon: Its History, Legend, and Story";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public void nalluurDescription(View view) {
        Intent intent=new Intent(this, PlaceDescriptActivity.class);
        String topic="Nallur Kandaswamy Kovil";
        String description="Nallur Kandaswamy Kovil (Tamil: நல்லூர் கந்தசுவாமி கோவில் Sinhala: නල්ලුරුව ස්කන්ධ කුමාර කෝවිල) is a significant Hindu temple, located in Nallur, Northern Province, Sri Lanka.The presiding deity is Lord Murugan or Katharagama Deviyo in the form of the holy 'Vel' in the Sanctum, the primary shrine, and in other forms, namely, Shanmugar, Muthukumaraswami, Valli Kaanthar with consorts Valli and Deivayanai, and Thendayuthapani, sans consorts in secondary shrines in the temple.The original, Kandaswamy Temple was founded in 948 ad. According to the Yalpana Vaipava Malai, the temple was developed at the site in the 13th century by Buwanika Bahu, a minister to the King of Kotte. Sapumal Kumaraya (also known as Chempaha Perumal in Tamil), who ruled the Jaffna kingdom on behalf of the Kotte kingdom is credited with building the third Nallur Kandaswamy temple";
        intent.putExtra("place", topic);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
