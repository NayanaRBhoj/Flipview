package com.nayana.bhoj.apps.flipbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.nayana.bhoj.apps.flipbook.FlipAdapter.Callback;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.flipview.FlipView;
import se.emilsjolander.flipview.FlipView.OnFlipListener;
import se.emilsjolander.flipview.FlipView.OnOverFlipListener;
import se.emilsjolander.flipview.OverFlipMode;

public class FlipActivity extends AppCompatActivity implements Callback, OnFlipListener, OnOverFlipListener {

    private FlipView mFlipView1;
    private FlipAdapter mAdapter1;
    private RelativeLayout rl_main;
    String from = "";
    RelativeLayout rl_snowView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip);
        rl_main = (RelativeLayout) findViewById(R.id.rl_main);
        rl_snowView = (RelativeLayout) findViewById(R.id.rl_snowView);
        rl_snowView.setVisibility(View.GONE);
        from = getIntent().getStringExtra("from");
        final List<RowItem> items1 = new ArrayList<>();
        if (from.equalsIgnoreCase("main1")) {
            items1.add(new RowItem(0, R.drawable.santastory_1_0));
            items1.add(new RowItem(0, R.drawable.santastory_1_1));
            items1.add(new RowItem(0, R.drawable.santastory_1_2));
            items1.add(new RowItem(0, R.drawable.santastory_1_3));
            items1.add(new RowItem(0, R.drawable.santastory_1_4));
            items1.add(new RowItem(0, R.drawable.santastory_1_5));
            items1.add(new RowItem(0, R.drawable.santastory_1_6));
            items1.add(new RowItem(0, R.drawable.santastory_1_7));
        } else if (from.equalsIgnoreCase("main2")) {
            items1.add(new RowItem(0, R.drawable.santastory_2_0));
            items1.add(new RowItem(0, R.drawable.santastory_2_1));
            items1.add(new RowItem(0, R.drawable.santastory_2_2));
            items1.add(new RowItem(0, R.drawable.santastory_2_3));
            items1.add(new RowItem(0, R.drawable.santastory_2_4));
            items1.add(new RowItem(0, R.drawable.santastory_2_5));
            items1.add(new RowItem(0, R.drawable.santastory_2_6));
            items1.add(new RowItem(0, R.drawable.santastory_2_7));
        } else if (from.equalsIgnoreCase("main4")) {
            items1.add(new RowItem(0, R.drawable.cricket_0));
            items1.add(new RowItem(0, R.drawable.cricket_1));
            items1.add(new RowItem(0, R.drawable.cricket_2));
            items1.add(new RowItem(0, R.drawable.cricket_3));
            items1.add(new RowItem(0, R.drawable.cricket_4));
        } else if (from.equalsIgnoreCase("main5")) {
            items1.add(new RowItem(0, R.drawable.cricketstory_2_0));
            items1.add(new RowItem(0, R.drawable.cricketstory_2_1));
            items1.add(new RowItem(0, R.drawable.cricketstory_2_2));
            items1.add(new RowItem(0, R.drawable.cricketstory_2_3));

        } else if (from.equalsIgnoreCase("main3")) {

            items1.add(new RowItem(0, R.drawable.coffeestory_0));
            items1.add(new RowItem(0, R.drawable.coffeestory_1));
            items1.add(new RowItem(0, R.drawable.coffeestory_2));
            items1.add(new RowItem(0, R.drawable.coffeestory_3));
            items1.add(new RowItem(0, R.drawable.coffeestory_4));
            items1.add(new RowItem(0, R.drawable.coffeestory_5));
            items1.add(new RowItem(0, R.drawable.coffeestory_6));
            items1.add(new RowItem(0, R.drawable.coffeestory_7));
            items1.add(new RowItem(0, R.drawable.coffeestory_8));
            items1.add(new RowItem(0, R.drawable.coffeestory_9));
            items1.add(new RowItem(0, R.drawable.coffeestory_10));
            items1.add(new RowItem(0, R.drawable.coffeestory_11));
            items1.add(new RowItem(0, R.drawable.coffeestory_12));
            items1.add(new RowItem(0, R.drawable.coffeestory_13));
            items1.add(new RowItem(0, R.drawable.coffeestory_14));
            items1.add(new RowItem(0, R.drawable.coffeestory_15));
            items1.add(new RowItem(0, R.drawable.coffeestory_16));
            items1.add(new RowItem(0, R.drawable.coffeestory_17));
            items1.add(new RowItem(0, R.drawable.coffeestory_18));
            items1.add(new RowItem(0, R.drawable.coffeestory_19));
            items1.add(new RowItem(0, R.drawable.coffeestory_20));
            items1.add(new RowItem(0, R.drawable.coffeestory_21));
            items1.add(new RowItem(0, R.drawable.coffeestory_22));
            items1.add(new RowItem(0, R.drawable.coffeestory_23));
            items1.add(new RowItem(0, R.drawable.coffeestory_24));
            items1.add(new RowItem(0, R.drawable.coffeestory_25));
            items1.add(new RowItem(0, R.drawable.coffeestory_26));
            items1.add(new RowItem(0, R.drawable.coffeestory_27));
            items1.add(new RowItem(0, R.drawable.coffeestory_28));
            items1.add(new RowItem(0, R.drawable.coffeestory_29));
            items1.add(new RowItem(0, R.drawable.coffeestory_30));
            items1.add(new RowItem(0, R.drawable.coffeestory_31));
            items1.add(new RowItem(0, R.drawable.coffeestory_32));
            items1.add(new RowItem(0, R.drawable.coffeestory_33));
            items1.add(new RowItem(0, R.drawable.coffeestory_34));
            items1.add(new RowItem(0, R.drawable.coffeestory_35));
            items1.add(new RowItem(0, R.drawable.coffeestory_36));
            items1.add(new RowItem(0, R.drawable.coffeestory_37));
            items1.add(new RowItem(0, R.drawable.coffeestory_38));
            items1.add(new RowItem(0, R.drawable.coffeestory_39));
            items1.add(new RowItem(0, R.drawable.coffeestory_40));
            items1.add(new RowItem(0, R.drawable.coffeestory_41));
            items1.add(new RowItem(0, R.drawable.coffeestory_42));
            items1.add(new RowItem(0, R.drawable.coffeestory_43));
            items1.add(new RowItem(0, R.drawable.coffeestory_44));
            items1.add(new RowItem(0, R.drawable.coffeestory_45));
            items1.add(new RowItem(0, R.drawable.coffeestory_46));
            items1.add(new RowItem(0, R.drawable.coffeestory_47));
            items1.add(new RowItem(0, R.drawable.coffeestory_48));
            items1.add(new RowItem(0, R.drawable.coffeestory_49));
            items1.add(new RowItem(0, R.drawable.coffeestory_50));
            items1.add(new RowItem(0, R.drawable.coffeestory_51));
            items1.add(new RowItem(0, R.drawable.coffeestory_52));
            items1.add(new RowItem(0, R.drawable.coffeestory_53));
            items1.add(new RowItem(0, R.drawable.coffeestory_54));
            items1.add(new RowItem(0, R.drawable.coffeestory_55));
            items1.add(new RowItem(0, R.drawable.coffeestory_56));
            items1.add(new RowItem(0, R.drawable.coffeestory_57));
            items1.add(new RowItem(0, R.drawable.coffeestory_58));
            items1.add(new RowItem(0, R.drawable.coffeestory_59));
            items1.add(new RowItem(0, R.drawable.coffeestory_60));
            items1.add(new RowItem(0, R.drawable.coffeestory_61));
            items1.add(new RowItem(0, R.drawable.coffeestory_62));
            items1.add(new RowItem(0, R.drawable.coffeestory_63));
            items1.add(new RowItem(0, R.drawable.coffeestory_64));
            items1.add(new RowItem(0, R.drawable.coffeestory_65));
            items1.add(new RowItem(0, R.drawable.coffeestory_66));
            items1.add(new RowItem(0, R.drawable.coffeestory_67));
            items1.add(new RowItem(0, R.drawable.coffeestory_68));
            items1.add(new RowItem(0, R.drawable.coffeestory_69));
            items1.add(new RowItem(0, R.drawable.coffeestory_70));
            items1.add(new RowItem(0, R.drawable.coffeestory_71));
            items1.add(new RowItem(0, R.drawable.coffeestory_72));
            items1.add(new RowItem(0, R.drawable.coffeestory_73));
            items1.add(new RowItem(0, R.drawable.coffeestory_74));
            items1.add(new RowItem(0, R.drawable.coffeestory_75));
            items1.add(new RowItem(0, R.drawable.coffeestory_76));
            items1.add(new RowItem(0, R.drawable.coffeestory_77));
            items1.add(new RowItem(0, R.drawable.coffeestory_78));
            items1.add(new RowItem(0, R.drawable.coffeestory_79));
            items1.add(new RowItem(0, R.drawable.coffeestory_80));
            items1.add(new RowItem(0, R.drawable.coffeestory_81));
            items1.add(new RowItem(0, R.drawable.coffeestory_82));
            items1.add(new RowItem(0, R.drawable.coffeestory_83));
            items1.add(new RowItem(0, R.drawable.coffeestory_84));
            items1.add(new RowItem(0, R.drawable.coffeestory_85));
            items1.add(new RowItem(0, R.drawable.coffeestory_86));
            items1.add(new RowItem(0, R.drawable.coffeestory_87));
            items1.add(new RowItem(0, R.drawable.coffeestory_88));
            items1.add(new RowItem(0, R.drawable.coffeestory_89));
            items1.add(new RowItem(0, R.drawable.coffeestory_90));
            items1.add(new RowItem(0, R.drawable.coffeestory_91));
            items1.add(new RowItem(0, R.drawable.coffeestory_92));
            items1.add(new RowItem(0, R.drawable.coffeestory_93));
            items1.add(new RowItem(0, R.drawable.coffeestory_94));
            items1.add(new RowItem(0, R.drawable.coffeestory_95));
            items1.add(new RowItem(0, R.drawable.coffeestory_96));
            items1.add(new RowItem(0, R.drawable.coffeestory_97));
            items1.add(new RowItem(0, R.drawable.coffeestory_98));
            items1.add(new RowItem(0, R.drawable.coffeestory_99));
            items1.add(new RowItem(0, R.drawable.coffeestory_100));
            items1.add(new RowItem(0, R.drawable.coffeestory_101));
            items1.add(new RowItem(0, R.drawable.coffeestory_102));
            items1.add(new RowItem(0, R.drawable.coffeestory_103));
            items1.add(new RowItem(0, R.drawable.coffeestory_104));
            items1.add(new RowItem(0, R.drawable.coffeestory_105));
            items1.add(new RowItem(0, R.drawable.coffeestory_106));
            items1.add(new RowItem(0, R.drawable.coffeestory_107));
            items1.add(new RowItem(0, R.drawable.coffeestory_108));
            items1.add(new RowItem(0, R.drawable.coffeestory_109));
            items1.add(new RowItem(0, R.drawable.coffeestory_110));
            items1.add(new RowItem(0, R.drawable.coffeestory_111));
            items1.add(new RowItem(0, R.drawable.coffeestory_112));
            items1.add(new RowItem(0, R.drawable.coffeestory_113));
            items1.add(new RowItem(0, R.drawable.coffeestory_114));
            items1.add(new RowItem(0, R.drawable.coffeestory_115));
            items1.add(new RowItem(0, R.drawable.coffeestory_116));
            items1.add(new RowItem(0, R.drawable.coffeestory_117));
            items1.add(new RowItem(0, R.drawable.coffeestory_118));
            items1.add(new RowItem(0, R.drawable.coffeestory_119));
            items1.add(new RowItem(0, R.drawable.coffeestory_120));
            items1.add(new RowItem(0, R.drawable.coffeestory_121));
            items1.add(new RowItem(0, R.drawable.coffeestory_122));
            items1.add(new RowItem(0, R.drawable.coffeestory_123));
            items1.add(new RowItem(0, R.drawable.coffeestory_124));
            items1.add(new RowItem(0, R.drawable.coffeestory_125));
            items1.add(new RowItem(0, R.drawable.coffeestory_126));
            items1.add(new RowItem(0, R.drawable.coffeestory_127));
            items1.add(new RowItem(0, R.drawable.coffeestory_128));
            items1.add(new RowItem(0, R.drawable.coffeestory_129));
            items1.add(new RowItem(0, R.drawable.coffeestory_130));
            items1.add(new RowItem(0, R.drawable.coffeestory_131));
            items1.add(new RowItem(0, R.drawable.coffeestory_132));
            items1.add(new RowItem(0, R.drawable.coffeestory_133));
            items1.add(new RowItem(0, R.drawable.coffeestory_134));
            items1.add(new RowItem(0, R.drawable.coffeestory_135));
            items1.add(new RowItem(0, R.drawable.coffeestory_136));
            items1.add(new RowItem(0, R.drawable.coffeestory_137));
            items1.add(new RowItem(0, R.drawable.coffeestory_138));
            items1.add(new RowItem(0, R.drawable.coffeestory_139));
            items1.add(new RowItem(0, R.drawable.coffeestory_140));
            items1.add(new RowItem(0, R.drawable.coffeestory_141));
            items1.add(new RowItem(0, R.drawable.coffeestory_142));
            items1.add(new RowItem(0, R.drawable.coffeestory_143));
            items1.add(new RowItem(0, R.drawable.coffeestory_144));
            items1.add(new RowItem(0, R.drawable.coffeestory_145));
            items1.add(new RowItem(0, R.drawable.coffeestory_146));
            items1.add(new RowItem(0, R.drawable.coffeestory_147));
            items1.add(new RowItem(0, R.drawable.coffeestory_148));
            items1.add(new RowItem(0, R.drawable.coffeestory_149));
            items1.add(new RowItem(0, R.drawable.coffeestory_150));
            items1.add(new RowItem(0, R.drawable.coffeestory_151));
            items1.add(new RowItem(0, R.drawable.coffeestory_152));
            items1.add(new RowItem(0, R.drawable.coffeestory_153));
            items1.add(new RowItem(0, R.drawable.coffeestory_154));
            items1.add(new RowItem(0, R.drawable.coffeestory_155));
            items1.add(new RowItem(0, R.drawable.coffeestory_156));
            items1.add(new RowItem(0, R.drawable.coffeestory_157));
            items1.add(new RowItem(0, R.drawable.coffeestory_158));
            items1.add(new RowItem(0, R.drawable.coffeestory_159));
            items1.add(new RowItem(0, R.drawable.coffeestory_160));
            items1.add(new RowItem(0, R.drawable.coffeestory_161));
            items1.add(new RowItem(0, R.drawable.coffeestory_162));
            items1.add(new RowItem(0, R.drawable.coffeestory_163));
            items1.add(new RowItem(0, R.drawable.coffeestory_164));
            items1.add(new RowItem(0, R.drawable.coffeestory_165));
            items1.add(new RowItem(0, R.drawable.coffeestory_166));
            items1.add(new RowItem(0, R.drawable.coffeestory_167));
            items1.add(new RowItem(0, R.drawable.coffeestory_168));
            items1.add(new RowItem(0, R.drawable.coffeestory_169));
            items1.add(new RowItem(0, R.drawable.coffeestory_170));
            items1.add(new RowItem(0, R.drawable.coffeestory_171));
            items1.add(new RowItem(0, R.drawable.coffeestory_172));
            items1.add(new RowItem(0, R.drawable.coffeestory_173));
            items1.add(new RowItem(0, R.drawable.coffeestory_174));
            items1.add(new RowItem(0, R.drawable.coffeestory_175));
            items1.add(new RowItem(0, R.drawable.coffeestory_176));
            items1.add(new RowItem(0, R.drawable.coffeestory_177));
            items1.add(new RowItem(0, R.drawable.coffeestory_178));
            items1.add(new RowItem(0, R.drawable.coffeestory_179));
            items1.add(new RowItem(0, R.drawable.coffeestory_180));
            items1.add(new RowItem(0, R.drawable.coffeestory_181));
            items1.add(new RowItem(0, R.drawable.coffeestory_182));
            items1.add(new RowItem(0, R.drawable.coffeestory_183));
            items1.add(new RowItem(0, R.drawable.coffeestory_184));
            items1.add(new RowItem(0, R.drawable.coffeestory_185));

        } else if (from.equalsIgnoreCase("main6")) {

            items1.add(new RowItem(0, R.drawable.boys_0));
            items1.add(new RowItem(0, R.drawable.boys_1));
            items1.add(new RowItem(0, R.drawable.boys_2));
            items1.add(new RowItem(0, R.drawable.boys_3));
            items1.add(new RowItem(0, R.drawable.boys_4));
            items1.add(new RowItem(0, R.drawable.boys_5));
            items1.add(new RowItem(0, R.drawable.boys_6));
            items1.add(new RowItem(0, R.drawable.boys_7));
            items1.add(new RowItem(0, R.drawable.boys_8));
            items1.add(new RowItem(0, R.drawable.boys_9));
            items1.add(new RowItem(0, R.drawable.boys_10));
            items1.add(new RowItem(0, R.drawable.boys_11));
            items1.add(new RowItem(0, R.drawable.boys_12));
            items1.add(new RowItem(0, R.drawable.boys_13));
            items1.add(new RowItem(0, R.drawable.boys_14));
            items1.add(new RowItem(0, R.drawable.boys_15));
            items1.add(new RowItem(0, R.drawable.boys_16));
            items1.add(new RowItem(0, R.drawable.boys_17));
            items1.add(new RowItem(0, R.drawable.boys_18));
            items1.add(new RowItem(0, R.drawable.boys_19));
            items1.add(new RowItem(0, R.drawable.boys_20));
            items1.add(new RowItem(0, R.drawable.boys_21));
            items1.add(new RowItem(0, R.drawable.boys_22));
            items1.add(new RowItem(0, R.drawable.boys_23));
            items1.add(new RowItem(0, R.drawable.boys_24));
            items1.add(new RowItem(0, R.drawable.boys_25));
            items1.add(new RowItem(0, R.drawable.boys_26));
            items1.add(new RowItem(0, R.drawable.boys_27));
            items1.add(new RowItem(0, R.drawable.boys_28));
            items1.add(new RowItem(0, R.drawable.boys_29));
            items1.add(new RowItem(0, R.drawable.boys_30));
            items1.add(new RowItem(0, R.drawable.boys_31));
            items1.add(new RowItem(0, R.drawable.boys_32));
            items1.add(new RowItem(0, R.drawable.boys_33));
            items1.add(new RowItem(0, R.drawable.boys_34));

        } else if (from.equalsIgnoreCase("main7")) {

            items1.add(new RowItem(0, R.drawable.cricketstory_3_0));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_1));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_2));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_3));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_4));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_5));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_6));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_7));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_8));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_9));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_10));

            items1.add(new RowItem(0, R.drawable.cricketstory_3_11));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_12));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_13));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_14));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_15));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_16));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_17));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_18));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_19));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_20));

            items1.add(new RowItem(0, R.drawable.cricketstory_3_21));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_22));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_23));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_24));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_25));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_26));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_27));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_28));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_29));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_30));

            items1.add(new RowItem(0, R.drawable.cricketstory_3_31));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_32));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_33));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_33));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_34));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_35));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_36));
            items1.add(new RowItem(0, R.drawable.cricketstory_3_37));

        }

        mFlipView1 = (FlipView) findViewById(R.id.flip_view1);
        mAdapter1 = new FlipAdapter(this, items1);
        //mAdapter1.setCallback(this);
        mFlipView1.setAdapter(mAdapter1);
        mFlipView1.setOnFlipListener(this);
        mFlipView1.peakNext(true);
        mFlipView1.setOverFlipMode(OverFlipMode.RUBBER_BAND);
        //mFlipView1.setEmptyView(findViewById(R.id.empty_view));
        mFlipView1.setOnOverFlipListener(this);

        LinearLayout first_page = (LinearLayout) findViewById(R.id.first_page);
        first_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPageRequested(0);
            }
        });
        LinearLayout last_page = (LinearLayout) findViewById(R.id.last_page);
        last_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPageRequested(items1.size() - 1);
            }
        });
    }


    @Override
    public void onPageRequested(int page) {
        mFlipView1.smoothFlipTo(page);
        /*Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
			public void run() {
				// Actions to do after 1 second
				mFlipView.smoothFlipTo(page);
			}
		}, 1000);*/
    }

    @Override
    public void onFlippedToPage(FlipView v, int position, long id) {

        //Log.i("pageflip", "Page: "+position);
        /*if(position > mFlipView.getPageCount()-3 && mFlipView.getPageCount()<8){
            mAdapter.addItems(1);
		}*/
    }

    @Override
    public void onOverFlip(FlipView v, OverFlipMode mode,
                           boolean overFlippingPrevious, float overFlipDistance,
                           float flipDistancePerPage) {
        //Log.i("overflip", "overFlipDistance = "+overFlipDistance);
    }

    @Override
    protected void onResume() {
        super.onResume();
        /*if (from.equalsIgnoreCase("main1") ||
                from.equalsIgnoreCase("main2") ||
                from.equalsIgnoreCase("main3") ||
                from.equalsIgnoreCase("main7") ||
                from.equalsIgnoreCase("main8")) {
            new CountDownTimer(200, 200) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {

                    new ParticleSystem(FlipActivity.this, 100, R.drawable.ic_snow_icon_small_extra, 3000)
                            .setAcceleration(0.00015f, 90)
                            .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                            .setFadeOut(200, new AccelerateInterpolator())
                            .emitWithGravity(rl_main, Gravity.TOP, 30);

                    new ParticleSystem(FlipActivity.this, 40, R.drawable.ic_snow_icon_small, 3000)
                            .setAcceleration(0.00013f, 90)
                            .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                            .setFadeOut(200, new AccelerateInterpolator())
                            .emitWithGravity(rl_main, Gravity.TOP, 30);

                    //new ParticleSystem(FlipActivity.this, 20, R.drawable.ic_snow_icon_medium, 3000)
                            //.setAcceleration(0.00010f, 90)
                            //.setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                            //.setFadeOut(200, new AccelerateInterpolator())
                            //.emitWithGravity(rl_main, Gravity.TOP, 30);

                }
            }.start();
        }*/
        if (from.equalsIgnoreCase("main1") || from.equalsIgnoreCase("main2")) {
            rl_snowView.setVisibility(View.VISIBLE);
        } else {
            rl_snowView.setVisibility(View.GONE);
        }

    }

}
