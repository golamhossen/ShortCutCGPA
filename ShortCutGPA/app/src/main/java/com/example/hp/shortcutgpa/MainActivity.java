package com.example.hp.shortcutgpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Nosubject,credit,gpa;
    TextView cgpa,index;
    Button submit,clear;
double total=0,num1,num2,result=0,subjectnum;
int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nosubject=(EditText)findViewById(R.id.Nosubject);
        credit =(EditText)findViewById(R.id.credit);
        gpa =(EditText)findViewById(R.id.gpa);
        cgpa =(TextView)findViewById(R.id.cgpa);
        submit=(Button)findViewById(R.id.submit);
        clear=(Button)findViewById(R.id.clear);
        index=(TextView)findViewById(R.id.index);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Double.parseDouble(credit.getText().toString());
                num2=Double.parseDouble(gpa.getText().toString());
                result+=num1;
                total+=num1*num2;
                cgpa.setText(""+total/result);
                i=i+1;
                index.setText(""+i);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                credit.setText("");
                credit.setHint("Enter credit");
                gpa.setText("");
                gpa.setHint("Enter GPA");
                Nosubject.setText("");
                Nosubject.setHint("total subject");
                total=0;
                result=0;
                num1=0;
                i=1;
                num2=0;
                cgpa.setText("your CGPA will here...........");
            }
        });

    }
}
