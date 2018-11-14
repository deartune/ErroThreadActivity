package com.example.edu.errothreadactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ErrorThreadActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_thread);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final String TAG="ErrorThreadAcrivityTag";
        long endTime=System.currentTimeMillis()+20*5000;
        Log.i(TAG,"Thread running!");
        TextView threadValue=(TextView)findViewById(R.id.threadValue);

        while(System.currentTimeMillis()<endTime){
            synchronized(this){
                Log.i(TAG,"Thead running!");
                threadValue.setText((String.valueOf(System.currentTimeMillis())));
            }
        }

    }
}
