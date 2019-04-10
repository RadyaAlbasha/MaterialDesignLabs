package android.materialdesign.labs.playwithlayouts.screens.colorsscreen;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.materialdesign.labs.playwithlayouts.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ColorsActivity extends AppCompatActivity {

    TextView textViewColor;
    Button buttonC1;
    Button buttonC2;
    Button buttonC3;
    Button buttonC4;
    Button buttonC5;
    Button buttonC6;
    Button buttonC7;
    Button buttonC8;
    Button buttonC9;
    Button buttonC10;
    Button buttonC11;
    Button buttonC12;
    Button buttonC13;
    Button buttonC14;
    Button buttonC15;
    Button buttonC16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        textViewColor =findViewById(R.id.textViewColor);

        buttonC1 = findViewById(R.id.buttonC1);
        buttonC2 = findViewById(R.id.buttonC2);
        buttonC3 = findViewById(R.id.buttonC3);
        buttonC4 = findViewById(R.id.buttonC4);
        buttonC5 = findViewById(R.id.buttonC5);
        buttonC6 = findViewById(R.id.buttonC6);
        buttonC7 = findViewById(R.id.buttonC7);
        buttonC8 = findViewById(R.id.buttonC8);
        buttonC9 = findViewById(R.id.buttonC9);
        buttonC10 = findViewById(R.id.buttonC10);
        buttonC11 = findViewById(R.id.buttonC11);
        buttonC12 = findViewById(R.id.buttonC12);
        buttonC13 = findViewById(R.id.buttonC13);
        buttonC14 = findViewById(R.id.buttonC14);
        buttonC15 = findViewById(R.id.buttonC15);
        buttonC16 = findViewById(R.id.buttonC16);

        buttonC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC1);
            }
        });

        buttonC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC2);
            }
        });

        buttonC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC3);
            }
        });

        buttonC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC4);
            }
        });

        buttonC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC5);
            }
        });

        buttonC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC6);
            }
        });

        buttonC7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC7);
            }
        });

        buttonC8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC8);
            }
        });

        buttonC9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC9);
            }
        });

        buttonC10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC10);
            }
        });

        buttonC11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC11);
            }
        });

        buttonC12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC12);
            }
        });

        buttonC13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC13);
            }
        });

        buttonC14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC14);
            }
        });

        buttonC15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC15);
            }
        });

        buttonC16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(buttonC16);
            }
        });
    }
    void changeColor(Button color)
    {
        int colorValue = Color.parseColor(color.getText().toString());
        textViewColor.setBackgroundColor(colorValue);
        textViewColor.setText(String.valueOf(colorValue));
    }
}
