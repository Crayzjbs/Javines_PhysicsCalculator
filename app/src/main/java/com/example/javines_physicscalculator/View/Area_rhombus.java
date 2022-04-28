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

public class Area_rhombus extends AppCompatActivity implements View.OnClickListener {
    TextView txtAnswer;
    EditText txtInputQ, txtInputP;
    double txtInputQD, txtInputPD,answer;
    Button btnCalculate, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_area_rhombus);
        enableFullscreen();

        txtInputQ = findViewById(R.id.txtInputH);
        txtInputP = findViewById(R.id.txtInputB);
        txtAnswer = findViewById(R.id.txtans);
        btnBack = findViewById(R.id.btnBack);
        btnCalculate = findViewById(R.id.btnCal);

        btnCalculate.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnBack:startActivity(new Intent(Area_rhombus.this, MainActivity.class));

            case R.id.btnCal:
                txtInputQD = Double.parseDouble(txtInputQ.getText().toString());
                txtInputPD = Double.parseDouble(txtInputP.getText().toString());
                answer = (txtInputQD * txtInputQD) / 2;
                txtAnswer.setText(""+ answer);
                break;
        }
    }
    private void enableFullscreen() {
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

}