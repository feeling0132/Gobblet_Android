package com.example.weilunwang.ooseproject;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.weilunwang.ooseproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstview);
    }
    public void mode1(View v){
        Intent intent = new Intent();

        Bundle bundle = new Bundle();
        bundle.putInt("mode", 1);
        intent.putExtras(bundle);

        intent.setClass(MainActivity.this, ChessGame.class);
        startActivity(intent);
        MainActivity.this.finish();
    }
    public void mode2(View v){
        Intent intent = new Intent();

        Bundle bundle = new Bundle();
        bundle.putInt("mode", 2);
        intent.putExtras(bundle);

        intent.setClass(MainActivity.this, ChessGame.class);
        startActivity(intent);
        MainActivity.this.finish();
    }
}

