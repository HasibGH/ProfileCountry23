package com.example.faysal.profilecountry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private String[] countryname;
    private Intent intent;

    int[] flags = {R.drawable.bangladesh, R.drawable.canada, R.drawable.india, R.drawable.pakistan,
            R.drawable.afghanistan, R.drawable.australia, R.drawable.china, R.drawable.azerbaijan, R.drawable.srilanka
            , R.drawable.england
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countryname = getResources().getStringArray(R.array.CountryNamesis);

        listview = findViewById(R.id.listviewid);
        final CustomAdapter adapter = new CustomAdapter(this, countryname, flags);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "Bangladesh");
                    startActivity(intent);
                }
                if (position == 1) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "Canada");
                    startActivity(intent);
                }
                if (position == 2) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "India");
                    startActivity(intent);
                }
                if (position == 3) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "Pakistan");
                    startActivity(intent);
                }
                if (position == 4) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "Afghanistan");
                    startActivity(intent);
                }
                if (position == 5) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "Australia");
                    startActivity(intent);
                }
                if (position == 6) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "China");
                    startActivity(intent);
                }
                if (position == 7) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "Azerbaijan");
                    startActivity(intent);
                }
                if (position == 8) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "Srilanka");
                    startActivity(intent);
                }
                if (position == 9) {

                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("name", "England");
                    startActivity(intent);
                }


            }


        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menulayout, menu);
        return super.onCreateOptionsMenu(menu);

    }

}





