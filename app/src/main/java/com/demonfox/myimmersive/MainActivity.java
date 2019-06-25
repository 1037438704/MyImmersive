package com.demonfox.myimmersive;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.button1:
                intent.setAction(Intent.ACTION_VIEW);
                Uri url = Uri.parse("https://www.imooc.com/course/list?c=android&is_easy=1");
                intent.setData(url);
                startActivity(intent);
                break;
            case R.id.button2:
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivity(intent);
                break;
            case R.id.button3:
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "my name is ZhaoDongLiang");
                startActivity(intent);
                break;
            case R.id.button4:
                intent.setAction(Intent.ACTION_DIAL);
                Uri uri = Uri.parse("tel:123456");
                intent.setData(uri);
                startActivity(intent);
                break;
        }
    }
}