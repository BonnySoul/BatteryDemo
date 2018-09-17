package com.woosiyuan.batterydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.woosiyuan.batterylibrary.ui.BatteryView;
import com.woosiyuan.batterylibrary.util.Constants;

public class MainActivity extends AppCompatActivity {

    BatteryView mBatteryView,mBatteryView2,mBatteryView3,mBatteryView4;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBatteryView=findViewById(R.id.battery);
        mBatteryView2=findViewById(R.id.battery2);
        mBatteryView3=findViewById(R.id.battery3);
        mBatteryView4=findViewById(R.id.battery4);
        mBatteryView.setBatterySize(3);
        mBatteryView.setElectricity(25, Constants.BATTERYCHARGING);

        mBatteryView2.setBatterySize(2);
        mBatteryView2.setElectricity(86, Constants.BATTERYNORMAL);

        mBatteryView3.setBatterySize(1);
        mBatteryView3.setElectricity(18, Constants.BATTERYNORMAL);

        mBatteryView4.setBatterySize(3);
        mBatteryView4.setElectricity(100, Constants.BATTERYCHARGING);


    }
}
