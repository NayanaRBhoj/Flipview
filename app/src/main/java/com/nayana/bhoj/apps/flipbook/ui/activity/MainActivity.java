package com.nayana.bhoj.apps.flipbook.ui.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.nayana.bhoj.apps.flipbook.R;
import com.nayana.bhoj.apps.flipbook.manager.FileManager;
import com.nayana.bhoj.apps.flipbook.manager.PermissionManager;
import com.nayana.bhoj.apps.flipbook.ui.component.DrawingView;
import com.nayana.bhoj.apps.flipbook.ui.dialog.StrokeSelectorDialog;

import org.xdty.preference.colorpicker.ColorPickerDialog;
import org.xdty.preference.colorpicker.ColorPickerSwatch;

public class MainActivity extends AppCompatActivity {
    DrawingView mDrawingView;
    ImageView mFillBackgroundImageView;
    ImageView mColorImageView;
    ImageView mStrokeImageView;
    ImageView mUndoImageView;
    ImageView mRedoImageView;

    private int mCurrentBackgroundColor;
    private int mCurrentColor;
    private int mCurrentStroke;
    private static final int MAX_STROKE_WIDTH = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ButterKnife.bind(this);
        mDrawingView = (DrawingView) findViewById(R.id.main_drawing_view);
        mFillBackgroundImageView = (ImageView) findViewById(R.id.main_fill_iv);
        mColorImageView = (ImageView) findViewById(R.id.main_color_iv);
        mStrokeImageView = (ImageView) findViewById(R.id.main_stroke_iv);
        mUndoImageView = (ImageView) findViewById(R.id.main_undo_iv);
        mRedoImageView = (ImageView) findViewById(R.id.main_redo_iv);

        initDrawingView();
        mFillBackgroundImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFillBackgroundDialog();
            }
        });
        mColorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startColorPickerDialog();
            }
        });

        mStrokeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startStrokeSelectorDialog();
            }
        });

        mUndoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawingView.undo();
            }
        });
        mRedoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawingView.redo();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_share:
                requestPermissionsAndSaveBitmap();
                break;
            case R.id.action_clear:
                mDrawingView.clearCanvas();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initDrawingView() {
        mCurrentBackgroundColor = ContextCompat.getColor(this, android.R.color.white);
        mCurrentColor = ContextCompat.getColor(this, android.R.color.black);
        mCurrentStroke = 10;

        mDrawingView.setBackgroundColor(mCurrentBackgroundColor);
        mDrawingView.setPaintColor(mCurrentColor);
        mDrawingView.setPaintStrokeWidth(mCurrentStroke);
    }

    private void startFillBackgroundDialog() {
        int[] colors = getResources().getIntArray(R.array.palette);

        ColorPickerDialog dialog = ColorPickerDialog.newInstance(R.string.color_picker_default_title,
                colors,
                mCurrentBackgroundColor,
                5,
                ColorPickerDialog.SIZE_SMALL);

        dialog.setOnColorSelectedListener(new ColorPickerSwatch.OnColorSelectedListener() {

            @Override
            public void onColorSelected(int color) {
                mCurrentBackgroundColor = color;
                mDrawingView.setBackgroundColor(mCurrentBackgroundColor);
            }

        });

        dialog.show(getFragmentManager(), "ColorPickerDialog");
    }

    private void startColorPickerDialog() {
        int[] colors = getResources().getIntArray(R.array.palette);

        ColorPickerDialog dialog = ColorPickerDialog.newInstance(R.string.color_picker_default_title,
                colors,
                mCurrentColor,
                5,
                ColorPickerDialog.SIZE_SMALL);

        dialog.setOnColorSelectedListener(new ColorPickerSwatch.OnColorSelectedListener() {

            @Override
            public void onColorSelected(int color) {
                mCurrentColor = color;
                mDrawingView.setPaintColor(mCurrentColor);
            }

        });

        dialog.show(getFragmentManager(), "ColorPickerDialog");
    }

    private void startStrokeSelectorDialog() {
        StrokeSelectorDialog dialog = StrokeSelectorDialog.newInstance(mCurrentStroke, MAX_STROKE_WIDTH);

        dialog.setOnStrokeSelectedListener(new StrokeSelectorDialog.OnStrokeSelectedListener() {
            @Override
            public void onStrokeSelected(int stroke) {
                mCurrentStroke = stroke;
                mDrawingView.setPaintStrokeWidth(mCurrentStroke);
            }
        });

        dialog.show(getSupportFragmentManager(), "StrokeSelectorDialog");
    }

    private void startShareDialog(Uri uri) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("image/*");

        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "");
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(intent, "Share Image"));
    }

    private void requestPermissionsAndSaveBitmap() {
        if (PermissionManager.checkWriteStoragePermissions(this)) {
            Uri uri = FileManager.saveBitmap(mDrawingView.getBitmap());
            startShareDialog(uri);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PermissionManager.REQUEST_WRITE_STORAGE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Uri uri = FileManager.saveBitmap(mDrawingView.getBitmap());
                    startShareDialog(uri);
                } else {
                    Toast.makeText(this, "The app was not allowed to write to your storage. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show();
                }
            }
        }
    }


}
