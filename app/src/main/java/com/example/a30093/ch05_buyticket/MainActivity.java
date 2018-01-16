package com.example.a30093.ch05_buyticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.txv);
        rg = (RadioGroup) findViewById(R.id.ticketType);
    }

    public void show(View v){
        switch (rg.getCheckedRadioButtonId()){
            case R.id.adult:
                tv.setText("请您买全票");
                break;
            case R.id.child:
                tv.setText("请您买半票");
                break;
            case R.id.senior:
                tv.setText("请您买敬老票");
                break;
        }
    }
}
