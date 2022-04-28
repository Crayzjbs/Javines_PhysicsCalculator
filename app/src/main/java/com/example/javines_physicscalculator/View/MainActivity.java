package com.example.javines_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.javines_physicscalculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCirle,btnRectangle,btnRhombus,btnTriangle;
    Button btnCone,btnSphere, btnCylinder, btnCube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
    //Area
        btnCirle = findViewById(R.id.btnCir);
        btnRectangle = findViewById(R.id.btnRec);
        btnRhombus = findViewById(R.id.btnRhom);
        btnTriangle = findViewById(R.id.btnTria);
     //Formula
        btnCone = findViewById(R.id.btnCone);
        btnSphere = findViewById(R.id.btnSph);
        btnCylinder = findViewById(R.id.btnCyc);
        btnCube = findViewById(R.id.btnCub);

        btnCirle.setOnClickListener(this);
        btnRectangle.setOnClickListener(this);
        btnRhombus.setOnClickListener(this);
        btnTriangle.setOnClickListener(this);

        btnCone.setOnClickListener(this);
        btnSphere.setOnClickListener(this);
        btnCylinder.setOnClickListener(this);
        btnCube.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCir:
                startActivity(new Intent(MainActivity.this, Area_circle.class));
                break;


            case R.id.btnRec:
                startActivity(new Intent(MainActivity.this, Area_Rectangle.class));
                break;


            case R.id.btnRhom:
                startActivity(new Intent(MainActivity.this, Area_rhombus.class));


            case R.id.btnTria:
                startActivity(new Intent(MainActivity.this, area_triangle.class));


            case R.id.btnCone:
                startActivity(new Intent(MainActivity.this, For_Cone.class));
                break;


            case R.id.btnSph:
                startActivity(new Intent(MainActivity.this, For_Sphere.class));
                break;


            case R.id.btnCyc:
                startActivity(new Intent(MainActivity.this, For_Cylinder.class));
                break;


            case R.id.btnCub:
                startActivity(new Intent(MainActivity.this, For_Cube.class));
                break;
        }


    }

}