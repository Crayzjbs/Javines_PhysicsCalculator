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

public class area_triangle extends AppCompatActivity implements View.OnClickListener {

    TextView txtAnswer;
    EditText txtBase, txtHeight;
    double txtBS, txtHgt, answer;
    Button btnCalculate, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_area_triangle);
        enableFullscreen();

        txtAnswer = findViewById(R.id.txtans);
        txtBase = findViewById(R.id.txtInputB);
        txtHeight = findViewById(R.id.txtInputH);
        btnBack = findViewById(R.id.btnBack);
        btnCalculate = findViewById(R.id.btnCal);

        btnBack.setOnClickListener(this);
        btnCalculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnBack:startActivity(new Intent(area_triangle.this,MainActivity.class));

            case R.id.btnCal:
                txtBS = Double.parseDouble(txtBase.getText().toString());
                txtHgt = Double.parseDouble(txtHeight.getText().toString());
                answer = (txtHgt * txtBS) / 2;
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