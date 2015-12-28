package com.example.dongwan.quiz1;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView01, scrollView02;
    ImageView imageView01, imageView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView01 = (ScrollView) findViewById(R.id.scrollView01);
        scrollView02 = (ScrollView) findViewById(R.id.scrollView02);
        imageView01 = (ImageView) findViewById(R.id.imageView01);
        imageView02 = (ImageView) findViewById(R.id.imageView02);
        Button upBtn = (Button) findViewById(R.id.upBtn);
        Button downBtn = (Button) findViewById(R.id.downBtn);

        scrollView01.setHorizontalScrollBarEnabled(true);
        scrollView02.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        BitmapDrawable bitmap = (BitmapDrawable) res.getDrawable(R.drawable.kennen_render);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmap);
        imageView01.getLayoutParams().width = bitmapWidth;
        imageView01.getLayoutParams().height = bitmapHeight;

        upBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                upImage();
            }
        });
        downBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                downImage();
            }
        });
    }

    private void downImage() {
    imageView01.setVisibility(View.INVISIBLE);
    imageView02.setVisibility(View.VISIBLE);
    Resources res = getResources();
    BitmapDrawable bitmap = (BitmapDrawable) res.getDrawable(R.drawable.teemo_render);
    int bitmapWidth = bitmap.getIntrinsicWidth();
    int bitmapHeight = bitmap.getIntrinsicHeight();

    imageView02.setImageDrawable(bitmap);
    imageView02.getLayoutParams().width = bitmapWidth;
    imageView02.getLayoutParams().height = bitmapHeight;
}
    private void upImage() {
        imageView01.setVisibility(View.VISIBLE);
        imageView02.setVisibility(View.INVISIBLE);
        Resources res = getResources();
        BitmapDrawable bitmap = (BitmapDrawable) res.getDrawable(R.drawable.kennen_render);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmap);
        imageView01.getLayoutParams().width = bitmapWidth;
        imageView01.getLayoutParams().height = bitmapHeight;
    }

}
