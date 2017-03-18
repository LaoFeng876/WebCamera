package com.example.fengzc.webcamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReceiveImageInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_image_info);
        final Button btn_ReceiveConnectServer = (Button) findViewById(R.id.btn_ReceiveConnectServer);

        btn_ReceiveConnectServer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), ReceiveActivity.class);
                startActivity(intent);

            }
        });

    }
}
