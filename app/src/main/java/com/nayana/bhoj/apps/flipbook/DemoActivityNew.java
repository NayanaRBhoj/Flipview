package com.nayana.bhoj.apps.flipbook;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.igalata.bubblepicker.BubblePickerListener;
import com.igalata.bubblepicker.adapter.BubblePickerAdapter;
import com.igalata.bubblepicker.model.BubbleGradient;
import com.igalata.bubblepicker.model.PickerItem;
import com.igalata.bubblepicker.rendering.BubblePicker;
import com.nayana.bhoj.apps.flipbook.ui.activity.MainActivity;

/**
 * Created by webwerks on 30/5/17.
 */

public class DemoActivityNew extends AppCompatActivity {
    BubblePicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_new);

        picker = (BubblePicker) findViewById(R.id.picker);

        final String[] titles = getResources().getStringArray(R.array.countries);
        final TypedArray colors = getResources().obtainTypedArray(R.array.colors);
        final TypedArray images = getResources().obtainTypedArray(R.array.images);

        picker.setAdapter(new BubblePickerAdapter() {
            @Override
            public int getTotalCount() {
                return titles.length;
            }

            @Override
            public PickerItem getItem(int position) {
                PickerItem item = new PickerItem();
                item.setTitle(titles[position]);
                item.setGradient(new BubbleGradient(colors.getColor((position * 2) % 8, 0),
                        colors.getColor((position * 2) % 8 + 1, 0), BubbleGradient.VERTICAL));
                //item.setTypeface(mediumTypeface);
                item.setTextColor(ContextCompat.getColor(DemoActivityNew.this, android.R.color.transparent));
                item.setBackgroundImage(ContextCompat.getDrawable(DemoActivityNew.this, images.getResourceId(position, 0)));
                item.setSelected(true);
                return item;
            }
        });

        picker.setListener(new BubblePickerListener() {
            @Override
            public void onBubbleSelected(PickerItem item) {

            }

            @Override
            public void onBubbleDeselected(PickerItem item) {

                //Toast.makeText(DemoActivityNew.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DemoActivityNew.this, FlipActivity.class);
                if (item.getTitle().equalsIgnoreCase("1")) {
                    intent.putExtra("from", "main1");
                } else if (item.getTitle().equalsIgnoreCase("2")) {
                    intent.putExtra("from", "main2");
                } else if (item.getTitle().equalsIgnoreCase("3")) {
                    intent.putExtra("from", "main3");
                } else if (item.getTitle().equalsIgnoreCase("4")) {
                    intent.putExtra("from", "main6");
                } else if (item.getTitle().equalsIgnoreCase("5")) {
                    intent.putExtra("from", "main7");
                } else if (item.getTitle().equalsIgnoreCase("6")) {
                    intent.putExtra("from", "main4");
                } else if (item.getTitle().equalsIgnoreCase("7")) {
                    intent.putExtra("from", "main5");
                }


                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(DemoActivityNew.this, (View) picker, "profile");
                startActivity(intent, options.toBundle());


            }
        });

        picker.setBubbleSize(1);
        //picker.setMaxSelectedCount(1);
        picker.setCenterImmediately(true);
        //picker.getAdapter().getItem(0).setSelected(true);

        Button btn_createnow = (Button) findViewById(R.id.btn_createnow);
        btn_createnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DemoActivityNew.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        picker.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        picker.onPause();
    }
}
