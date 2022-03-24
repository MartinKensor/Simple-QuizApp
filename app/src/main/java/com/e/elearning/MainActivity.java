package com.e.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg,dpt,ct;
    Button next,back;
    String g=null;
    String dept=null;
    String ctc=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        rg = findViewById (R.id.radioGroup);
        dpt = findViewById (R.id.dpt);
        ct = findViewById (R.id.ct);
        next = findViewById (R.id.next);
        back = findViewById (R.id.back);



        next.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {


                int selected = rg.getCheckedRadioButtonId ();
                int dptm = dpt.getCheckedRadioButtonId ();
                int c = ct.getCheckedRadioButtonId ();

                if ((selected == -1) || (dptm == -1) || (c== -1)) {
                    Toast.makeText (getApplicationContext (), "Answer all the questions", Toast.LENGTH_SHORT).show ();
                } else {
                    RadioButton radioButon = findViewById (selected);
                    RadioButton radioButon2 = findViewById (dptm);
                    RadioButton radioButon3= findViewById (c);
                    g = radioButon.getText ().toString ();
                    dept = radioButon2.getText ().toString ();
                    ctc=radioButon3.getText ().toString ();

                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    i.putExtra("q1", g);
                    i.putExtra("q2", ctc);
                    i.putExtra("q3", dept);
                    startActivity(i);
                }
            }
        });

        back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i=new Intent (MainActivity.this, MainActivity.class);
                startActivity (i);
            }
        });
    }
}