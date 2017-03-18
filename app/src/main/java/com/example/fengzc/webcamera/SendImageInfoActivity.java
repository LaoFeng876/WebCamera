package com.example.fengzc.webcamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SendImageInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_image_info);
        final Button btn_SendConnectServer = (Button) findViewById(R.id.btn_SendConnectServer);

        btn_SendConnectServer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), SendImageActivity.class);
                startActivity(intent);

            }
        });
    }

}
