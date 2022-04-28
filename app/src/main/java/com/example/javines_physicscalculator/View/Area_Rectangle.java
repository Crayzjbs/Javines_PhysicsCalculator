package com.example.javines_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.javines_physicscalculator.R;

public class Area_Rectangle extends AppCompatActivity implements View.OnClickListener {
    TextView txtAnswer;
    EditText txtLth,txtWdt;
    double txtInputW, txtInputL,answer;
    Button btnCalculate,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_area_rectangle);
        enableFullscreen();

        txtAnswer = findViewById(R.id.txtans);
        txtLth = findViewById(R.id.txtInputB);
        txtWdt = findViewById(R.id.txtInputH);
        btnCalculate = findViewById(R.id.btnCal);
        btnBack = findViewById(R.id.btnBack);

        btnCalculate.setOnClickListener(this);
        btnBack.setOnClickListener(this);

    }
    private void enableFullscreen(){
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        );
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnBack:startActivity(new Intent(Area_Rectangle.this, MainActivity.class));
                break;

            case R.id.btnCal:
                txtInputW = Double.parseDouble(txtWdt.getText().toString());
                txtInputL = Double.parseDouble(txtLth.getText().toString());
                answer = txtInputL * txtInputW;
                txtAnswer.setText(""+ answer);

       }
    }
}