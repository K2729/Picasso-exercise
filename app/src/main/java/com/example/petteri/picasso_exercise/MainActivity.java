package com.example.petteri.picasso_exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this)
                .load("http://student.labranet.jamk.fi/~K2729/ttms0500/h2/t4/auto1.jpg")
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .resize(350, 350)
                .into(imageView);

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        Picasso.with(this)
                .load("http://student.labranet.jamk.fi/~K2729/ttms0500/h2/t4/auto2.jpg")
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .resize(350, 350)
                .into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

        Picasso.with(this)
                .load("http://student.labranet.jamk.fi/~K2729/ttms0500/h2/t4/ERROR.jpg")
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .resize(350, 350)
                .into(imageView3);

    }

}
