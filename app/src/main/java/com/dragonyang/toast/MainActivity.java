package com.dragonyang.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 三种常见Toast
 * 文字型
 * 图片型
 * 混合型
 */
public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"文字提示",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView view = new ImageView(MainActivity.this);
                view.setImageResource(R.drawable.i1);
                Toast toast = new Toast(MainActivity.this);
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView view = new ImageView(MainActivity.this);
                TextView textView = new TextView(MainActivity.this);
                view.setImageResource(R.drawable.i1);
                textView.setText("文字提示");

                LinearLayout linearLayout = new LinearLayout(MainActivity.this);
                linearLayout.setOrientation(LinearLayout.VERTICAL);
                linearLayout.addView(view);
                linearLayout.addView(textView);

                Toast toast = new Toast(MainActivity.this);
                toast.setView(linearLayout);
                toast.show();
            }
        });
    }
}
