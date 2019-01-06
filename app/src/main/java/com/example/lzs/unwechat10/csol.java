package com.example.lzs.unwechat10;

import android.app.backup.BackupHelper;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class csol extends AppCompatActivity {
    private TextView a,b,c,d;
    private TextView csol;
    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//      if(keyCode==KeyEvent.KEYCODE_BACK){
//         Intent intent = new Intent(this, MainActivity.class);
//         intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//          startActivity(intent);
//          finish();
//      }
//      return true;
//}

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(true);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csol);
        a=(TextView) findViewById(R.id.txt_home);
        b=(TextView) findViewById(R.id.txt_service);
        c=(TextView) findViewById(R.id.txt_discover);
        d=(TextView) findViewById(R.id.txt_my);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(csol.this, "Hello World!", Toast.LENGTH_SHORT).show();
        }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(csol.this, "Hello World!", Toast.LENGTH_SHORT).show();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(csol.this, "Hello World!", Toast.LENGTH_SHORT).show();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(csol.this, "Hello World!", Toast.LENGTH_SHORT).show();
            }
        });
        csol=(TextView) findViewById(R.id.back);
        csol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(csol.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                Toast.makeText(csol.this, "注销成功 ", Toast.LENGTH_SHORT).show();
            }
        });
    }



    }

