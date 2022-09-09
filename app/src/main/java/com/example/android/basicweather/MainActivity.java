package com.example.android.basicweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //weather data
        ArrayList<String> weather = new ArrayList<>();
        weather.add("Jan 01     40F/50F     AM Showers         90% precipitation");
        weather.add("Jan 02     38F/43F     Partly Cloudy           54% precipitation");
        weather.add("Jan 03     56F/60F     AM/PM Showers      83% precipitation");
        weather.add("Jan 04     33F/45F     Sunny                     21% precipitation");
        weather.add("Jan 05     41F/55F     AM/PM Showers  92% precipitation");
        weather.add("Jan 06     13F/30F     Snowstorm          55% precipitation");
        weather.add("Jan 07     11F/20F     Blizzard                100% precipitation");
        weather.add("Jan 08     18F/32F     AM/PM Fog          23% precipitation");
        weather.add("Jan 09     22F/30F     Snow Showers       79% precipitation");
        weather.add("Jan 10     33F/55F     AM Showers         62% precipitation");
        weather.add("Jan 11     40F/43F     Partly Cloudy           59% precipitation");
        weather.add("Jan 12     30F/34F     AM Showers         62% precipitation");
        weather.add("Jan 13     44F/57F     AM Showers         49% precipitation");
        weather.add("Jan 14     33F/46F     Snow Showers       73% precipitation");
        weather.add("Jan 15     29F/35F     AM Sunny                36% precipitation");

        //set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerview1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, weather);
        adapter.setClickListener(this::onItemClick);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    //everytime user clicks recycler view post diffrent sayings
    //array starts with 0
    public void onItemClick(View view, int position) {
        if(position == 0){
            Toast.makeText(this, "There will be AM-Showers in the morning with a low of 40F and high of 50F.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 1){
            Toast.makeText(this, "Today will be Partly cloudy with a low of 38F and a high of 43F.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 2){
            Toast.makeText(this, "There will be AM/PM Showers with a low of 56F and a high of 60F. Be careful the weather is cooling.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 3){
            Toast.makeText(this, "Today will be sunny, with a low of 33F and a high of 45F, it is suggested that you wear a jacket.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 4){
            Toast.makeText(this, "There will be AM/PM Showers make sure to bring an umbrella.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 5){
            Toast.makeText(this, "Light snow fall in the morning, Stay inside after 1PM there will be a snowstorm.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 6){
            Toast.makeText(this, "There will be a blizzard starting at 3AM, stay inside, there will be low visibility.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 7){
            Toast.makeText(this, "Low Visabity all day, stay inside. Conditions are very icy.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 8){
            Toast.makeText(this, "More snow showers, will harden into ice midday.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 9){
            Toast.makeText(this, "There will be AM Showers, with a low of 33F and a high of 55F.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 10){
            Toast.makeText(this, "Cloudy in the morning, the clouds will ease up in the afternoon. The temperature Low 40F, High 43F.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 11){
            Toast.makeText(this, "AM Showers Low 30F with High 34F. Make sure to bring an umbrella.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 12){
            Toast.makeText(this, "AM Showers with Low of 44F and High of 57F.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 13){
            Toast.makeText(this, "Small snow showers, starting at 1AM endign aroudn 9PM. Temps with Low of 33F and High of 46F.", Toast.LENGTH_SHORT).show();
        }
        else if(position == 14){
            Toast.makeText(this, "Sunny all morning and afternoon. Low of 29F with High of 35F.", Toast.LENGTH_SHORT).show();
        }
    }
}