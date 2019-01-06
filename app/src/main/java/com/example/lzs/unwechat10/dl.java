package com.example.lzs.unwechat10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class dl extends AppCompatActivity {
    private ImageView imageView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dl);
        imageView=(ImageView) findViewById(R.id.go);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button=(Button) findViewById(R.id.wxdl);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dl.this,csol.class);
                startActivity(intent);
                Toast.makeText(dl.this, "登录成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
