package com.example.jfy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Intent intent = getIntent();
        String strans=(String) intent.getExtras().get("ans");
        TextView clear=(TextView)findViewById(R.id.clr_history);
        final TextView historyresult=(TextView)findViewById(R.id.history_result);
        historyresult.append("\n");
        historyresult.append(strans);
        clear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                historyresult.setText(null);
                return false;
            }
        });



    }





}
