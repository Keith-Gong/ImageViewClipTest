package com.study.keith.imageviewcliptest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoachMarkView mImageView = (CoachMarkView) this.findViewById(R.id.imageView);
        mImageView.setImageResource(R.drawable.back);
        System.out.println("Set");
        final float arr[] = {100, 100, getActionBar().getHeight()};
        mImageView.setHollowCallback(new CoachMarkView.ISetHollow() {
            @Override
            public float[] createHollow() {
                return arr;
            }
        });



        /*ImageView mImageView = (ImageView) this.findViewById(R.id.imageView);

        Paint mPaint = new Paint();
        Path mPath = new Path();
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(6);
        mPaint.setTextAlign(Paint.Align.RIGHT);
        mPath = new Path();


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.back);
        Canvas canvas = new Canvas(bitmap.isMutable() ? bitmap
                    : bitmap.copy(Bitmap.Config.ARGB_8888, true));

        canvas.clipRect(0, 0, 200, 200);
        canvas.drawColor(Color.BLACK);

        mImageView.draw(canvas);*/




    }
}


