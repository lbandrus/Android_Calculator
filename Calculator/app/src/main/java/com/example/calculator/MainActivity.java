package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView answer;
    Button button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9,
            button_0, button_minus, button_plus, button_divide, button_times, button_clear,
            button_del, button_negative, button_equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_0 = findViewById(R.id.button_0);
        button_minus = findViewById(R.id.button_minus);
        button_plus = findViewById(R.id.button_plus);
        button_divide = findViewById(R.id.button_divide);
        button_times = findViewById(R.id.button_times);
        button_clear = findViewById(R.id.button_clear);
        button_del = findViewById(R.id.button_delete);
        button_negative = findViewById(R.id.button_negative);
        button_equal = findViewById(R.id.button_equal);
        answer = findViewById(R.id.textView);


        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_times.setOnClickListener(this);
        button_clear.setOnClickListener(this);
        button_del.setOnClickListener(this);
        button_negative.setOnClickListener(this);
        button_equal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_0:
                answer.append(button_0.getText().toString());
                break;

        }
    }
}