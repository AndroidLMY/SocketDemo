package com.androidlmy.socketdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText ip;
    private EditText duankou;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TcpManager.getInstance().initSocket("192.168.0.114","60000");
            }
        });
    }

    private void initView() {
        ip = findViewById(R.id.ip);
        duankou = findViewById(R.id.duankou);
        button = findViewById(R.id.button);
    }
}


