package com.aslanbolurov.fibonacci.convertermilestokilometers;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnBtnClick(View v) {
        EditText text_from_user = (EditText)findViewById(R.id.editText);
        TextView result = (TextView)findViewById(R.id.result_field);

        String text = text_from_user.getText().toString();
        try {
            double checkValue= Double.parseDouble(text);
            if (!text.matches("")) {
                double num = Double.parseDouble(text);
                num *= 1.61;
                result.setText(Double.toString(num));
                text_from_user.setText(null);
            }
        }catch(NumberFormatException e){
            text_from_user.setText(null);
            Toast.makeText(this, "Введите число!", Toast.LENGTH_SHORT).show();
        }
    }

}









