package com.hobbes09.carousel;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FullScreenImageAdapter adapter;

    ArrayList<String> urls = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);

        viewPager = (ViewPager) findViewById(R.id.pager);

        urls.add("http://media.caranddriver.com/images/media/51/25-cars-worth-waiting-for-lp-ford-gt-photo-658253-s-original.jpg");
        urls.add("http://blogs-images.forbes.com/kristintablang/files/2016/03/Bugatti-Chiron-2016.jpg");
        urls.add("http://media.caranddriver.com/images/media/51/25-cars-worth-waiting-for-lp-mclaren-p14-photo-658259-s-original.jpg");
        urls.add("http://media.caranddriver.com/images/media/51/2016-10best-cars-lead-photo-664005-s-original.jpg");

        adapter = new FullScreenImageAdapter(this, urls);

        viewPager.setAdapter(adapter);


    }
}
