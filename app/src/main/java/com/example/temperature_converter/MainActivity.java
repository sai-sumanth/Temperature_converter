package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ToggleButton tb;
    EditText et;
    Double a;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.et);
        btn=(Button)findViewById(R.id.btn);
        tb=(ToggleButton)findViewById(R.id.tb);
        textResult=(TextView) findViewById(R.id.textResult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et.getText().toString().isEmpty())
                {
                    //Toast.makeText(MainActivity.this,"Please enter the temperature",Toast.LENGTH_SHORT).show();
                    textResult.setText("Please enter the temperature");
                    System.out.println(textResult);
                }
                else if(tb.isChecked())
                {
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    Double b=a*9/5+32;
                    String r=String.valueOf(b);
                  //  Toast.makeText(MainActivity.this,r+"°F",Toast.LENGTH_SHORT).show();
                    textResult.setText(r+"°F");
                }

                else
                {
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    Double b=a-32;
                    Double c=b*5/9;
                    String r=String.valueOf(c);
                   // Toast.makeText(MainActivity.this,r+"°C",Toast.LENGTH_SHORT).show();
                    textResult.setText(r+"°C");
                }
            }
        });
    }
}