package com.example.animationonviews;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    Button buttonY, buttonX, zoomIn, zoomOut, buttonZr, buttonZy,
            moveLeft, moveRight, moveUp, moveDown, fadeIn, fadeOut,
            reset;
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonY = findViewById(R.id.button1);
        buttonX = findViewById(R.id.button2);
        buttonZr = findViewById(R.id.button5);
        buttonZy = findViewById(R.id.button6);
        zoomIn = findViewById(R.id.button3);
        zoomOut = findViewById(R.id.button4);
        moveLeft = findViewById(R.id.button7);
        moveRight = findViewById(R.id.button8);
        moveUp = findViewById(R.id.button9);
        moveDown = findViewById(R.id.button10);
        fadeIn = findViewById(R.id.button12);
        fadeOut = findViewById(R.id.button13);
        image1 = findViewById(R.id.image);

        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().rotationYBy(360f);
            }
        });
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().rotationXBy(360f);
            }
        });
        buttonZr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().rotationBy(360f);
            }
        });
        buttonZy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().rotationBy(-360f);
            }
        });
        zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().scaleXBy(1f);
                image1.animate().scaleYBy(1f);
            }
        });
        zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().scaleYBy(-0.8f);
                image1.animate().scaleXBy(-0.8f);
            }
        });
        moveLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().translationXBy(-100f);
            }
        });
        moveRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().translationXBy(100f);
            }
        });
        moveUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().translationYBy(-100f);
            }
        });
        moveDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().translationYBy(100f);
            }
        });
        fadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().alphaBy(1f);
            }
        });
        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.animate().alphaBy(-1f);
            }
        });
    }
}