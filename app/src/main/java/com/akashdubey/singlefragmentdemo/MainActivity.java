package com.akashdubey.singlefragmentdemo;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView output;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input=(EditText)findViewById(R.id.inputET);
        output=(TextView)findViewById(R.id.outputTV);
        submit=(Button)findViewById(R.id.submitBtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(input.getText());


            }
        });
    }
}
