package com.renyxa.audiolatencymeasurer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    private Button buttonStartLatencyMeasurement;
    private Button buttonStopLatencyMeasurement;
    private TextView textViewLatencyMs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews ();
    }

    private void setViews() {
        textViewLatencyMs = findViewById(R.id.textViewLatencyMs);
        buttonStartLatencyMeasurement = findViewById(R.id.buttonStartLatencyMeasurement);
        buttonStopLatencyMeasurement = findViewById(R.id.buttonStopLatencyMeasurement);
        buttonStartLatencyMeasurement.setOnClickListener(this);
        buttonStopLatencyMeasurement.setOnClickListener(this);
    }

    @Override
    protected void onResume () {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonStartLatencyMeasurement:
                buttonStartLatencyMeasurement.setVisibility(View.GONE);
                buttonStopLatencyMeasurement.setVisibility(View.VISIBLE);
                break;
            case R.id.buttonStopLatencyMeasurement:
                buttonStopLatencyMeasurement.setVisibility(View.GONE);
                buttonStartLatencyMeasurement.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }
}
