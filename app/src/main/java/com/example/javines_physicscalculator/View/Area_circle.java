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

public class Area_circle extends AppCompatActivity implements View.OnClickListener{
    TextView txtAnswer;
    EditText txtRadius;
    double txtInput,answer;
    Button btnCalculate,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_area_circle);
        enableFullscreen();

        txtAnswer = findViewById(R.id.txtans);
        txtRadius = findViewById(R.id.txtInputH);
        btnCalculate = findViewById(R.id.btnCal);
        btnBack = findViewById(R.id.btnBack);

        btnCalculate.setOnClickListener(this);
        btnBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnBack:startActivity(new Intent(Area_circle.this, MainActivity.class));
                break;

            case R.id.btnCal:
                txtInput = Double.parseDouble(txtRadius.getText().toString());
                answer = Math.PI * (txtInput * txtInput) ;
                txtAnswer.setText("" + answer);

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