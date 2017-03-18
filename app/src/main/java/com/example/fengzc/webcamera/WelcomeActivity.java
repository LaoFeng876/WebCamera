package com.example.fengzc.webcamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final Button btn_SendImage = (Button) findViewById(R.id.btn_SendImage);
        final Button btn_ReceiveImg = (Button) findViewById(R.id.btn_ReceiveImage);
        btn_SendImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(getBaseContext(), SendImageInfoActivity.class);
                    startActivity(intent);

            }
        });

        btn_ReceiveImg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), ReceiveImageInfoActivity.class);
                startActivity(intent);

            }
        });
    }

}
