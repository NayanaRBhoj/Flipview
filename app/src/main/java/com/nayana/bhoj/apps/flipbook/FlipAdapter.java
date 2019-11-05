package com.nayana.bhoj.apps.flipbook;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.plattysoft.leonids.ParticleSystem;

import java.util.ArrayList;
import java.util.List;

public class FlipAdapter extends BaseAdapter { //implements OnClickListener {

    private LayoutInflater inflater;
    //private Callback callback;
    private List<RowItem> items = new ArrayList<>();
    Context mContext;

    public FlipAdapter(Context context, List<RowItem> items) {
        mContext = context;
        inflater = LayoutInflater.from(context);
        this.items = items;
    }

    /*public void setCallback(Callback callback) {
        this.callback = callback;
    }*/

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.page, parent, false);

            holder.text = (TextView) convertView.findViewById(R.id.text);
            holder.image = (ImageView) convertView.findViewById(R.id.image);
            //holder.ll_main = (CardView) convertView.findViewById(R.id.ll_main);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.text.setText("Page : " + items.get(position).getId());
        holder.image.setImageResource(items.get(position).getImage_path());

        //holder.ll_main.setOnClickListener(new OnClickListener() {
        //@Override
        //public void onClick(View view) {
                /*new ParticleSystem((FlipActivity) mContext, 80, R.drawable.ic_snow_icon_small_extra, 3000)
                        .setAcceleration(0.00013f, 90)
                        .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                        .setFadeOut(200, new AccelerateInterpolator())
                        .emitWithGravity(view, Gravity.TOP, 30);
                new ParticleSystem((FlipActivity) mContext, 40, R.drawable.ic_snow_icon_small, 3000)
                        .setAcceleration(0.00013f, 90)
                        .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                        .setFadeOut(200, new AccelerateInterpolator())
                        .emitWithGravity(view, Gravity.TOP, 30);
                new ParticleSystem((FlipActivity) mContext, 30, R.drawable.ic_snow_icon_medium, 3000)
                        .setAcceleration(0.00013f, 90)
                        .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                        .setFadeOut(200, new AccelerateInterpolator())
                        .emitWithGravity(view, Gravity.TOP, 30);
                new ParticleSystem((FlipActivity) mContext, 20, R.drawable.ic_snow_icon_large, 3000)
                        .setAcceleration(0.00013f, 90)
                        .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                        .setFadeOut(200, new AccelerateInterpolator())
                        .emitWithGravity(view, Gravity.TOP, 30);*/
        //}
        //});


        return convertView;
    }

    /*@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first_page:
                if (callback != null) {
                    callback.onPageRequested(0);
                }
                break;
            case R.id.last_page:
                if (callback != null) {
                    callback.onPageRequested(getCount() - 1);
                }
                break;
        }
    }*/

    /*public void addItems(int amount) {
        for (int i = 0; i < amount; i++) {
            items.add(new RowItem(i));
        }
        notifyDataSetChanged();
    }*/

    /*public void addItemsBefore(int amount) {
        for (int i = 0; i < amount; i++) {
            items.add(0, new RowItem(i));
        }
        notifyDataSetChanged();
    }*/

    public interface Callback {
        public void onPageRequested(int page);
    }

    static class ViewHolder {
        TextView text;
        ImageView image;
        //CardView ll_main;
    }

}
