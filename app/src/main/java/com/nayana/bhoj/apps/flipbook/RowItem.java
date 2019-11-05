package com.nayana.bhoj.apps.flipbook;

/**
 * Created by supuser on 19/12/16.
 */

public class RowItem {

    static long id = 0;
    int image_path;
    long mId;

    public RowItem(long id, int image_path) {
        //mId = id++;
        mId = id;
        this.image_path = image_path;
    }

    long getId() {
        return mId;
    }


    public int getImage_path() {
        return image_path;
    }

    public void setImage_path(int image_path) {
        this.image_path = image_path;
    }
}
