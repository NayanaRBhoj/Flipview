package com.nayana.bhoj.apps.flipbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import com.nayana.bhoj.apps.flipbook.ui.activity.MainActivity;

/**
 * Created by supuser on 19/12/16.
 */

public class MainActivityMain extends AppCompatActivity {
    CardView card_view1, card_view2, card_view3, card_view4, card_view5, card_view6, card_view7;
    boolean changed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);

        //santastory1
        card_view1 = (CardView) findViewById(R.id.card_view1);
        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMain.this, FlipActivity.class);
                // Pass data object in the bundle and populate details activity.
                intent.putExtra("from", "main1");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivityMain.this, (View) card_view1, "profile");
                startActivity(intent, options.toBundle());
                changed = true;
            }
        });
        //santastory2
        card_view2 = (CardView) findViewById(R.id.card_view2);
        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMain.this, FlipActivity.class);
                // Pass data object in the bundle and populate details activity.
                intent.putExtra("from", "main2");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivityMain.this, (View) card_view2, "profile");
                startActivity(intent, options.toBundle());
                changed = true;
            }
        });
        //coffee story
        card_view3 = (CardView) findViewById(R.id.card_view3);
        card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMain.this, FlipActivity.class);
                // Pass data object in the bundle and populate details activity.
                intent.putExtra("from", "main3");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivityMain.this, (View) card_view3, "profile");
                startActivity(intent, options.toBundle());
                changed = true;
            }
        });
        //cricket story
        card_view4 = (CardView) findViewById(R.id.card_view4);
        card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMain.this, FlipActivity.class);
                // Pass data object in the bundle and populate details activity.
                intent.putExtra("from", "main4");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivityMain.this, (View) card_view4, "profile");
                startActivity(intent, options.toBundle());
                changed = true;
            }
        });
        //cricket story2
        card_view5 = (CardView) findViewById(R.id.card_view5);
        card_view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMain.this, FlipActivity.class);
                // Pass data object in the bundle and populate details activity.
                intent.putExtra("from", "main5");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivityMain.this, (View) card_view5, "profile");
                startActivity(intent, options.toBundle());
                changed = true;
            }
        });

        //boys story
        card_view6 = (CardView) findViewById(R.id.card_view6);
        card_view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMain.this, FlipActivity.class);
                // Pass data object in the bundle and populate details activity.
                intent.putExtra("from", "main6");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivityMain.this, (View) card_view6, "profile");
                startActivity(intent, options.toBundle());
                changed = true;
            }
        });
        //cricket story3
        card_view7 = (CardView) findViewById(R.id.card_view7);
        card_view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMain.this, FlipActivity.class);
                // Pass data object in the bundle and populate details activity.
                intent.putExtra("from", "main7");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivityMain.this, (View) card_view7, "profile");
                startActivity(intent, options.toBundle());
                changed = true;
            }
        });

        Button btn_createnow = (Button) findViewById(R.id.btn_createnow);
        btn_createnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityMain.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        /*if (changed == true) {
            this.recreate();
            changed = false;
        }

        new CountDownTimer(400, 400) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {

                new ParticleSystem(MainActivityMain.this, 80, R.drawable.ic_snow_icon_small_extra, 3000)
                        .setAcceleration(0.00013f, 90)
                        .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                        .setFadeOut(200, new AccelerateInterpolator())
                        .emitWithGravity(ll_main, Gravity.TOP, 30);

            }
        }.start();*/
    }
}
