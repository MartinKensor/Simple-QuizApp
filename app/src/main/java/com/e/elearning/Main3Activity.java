package com.e.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    String qz1, qz2, qz3, qz4, qz5, qz6;
    RadioGroup q7, q8, q9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main3);

        Bundle bundle=getIntent().getExtras();
        qz1=bundle.getString("qz1");
        qz2=bundle.getString("qz2");
        qz3=bundle.getString("qz3");
        qz4=bundle.getString("qz4");
        qz5=bundle.getString("qz5");
        qz6=bundle.getString("qz6");



        q7= findViewById (R.id.q71);
        q8 = findViewById (R.id.q8);
        q9= findViewById (R.id.ap);

        Button next = findViewById (R.id.next);
        Button back = findViewById (R.id.back);

        back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent in = new Intent (getApplicationContext (), Main2Activity.class);
                startActivity (in);
            }
        });

        next.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                int n1 = q7.getCheckedRadioButtonId ();
                int p = q8.getCheckedRadioButtonId ();
                int pp = q9.getCheckedRadioButtonId ();

                if ((n1 == -1) || (p == -1)|| (pp == -1)) {
                    Toast.makeText (getApplicationContext (), "Answer all the questions", Toast.LENGTH_SHORT).show ();
                } else {
                    RadioButton radioButon = findViewById (n1);
                    RadioButton radioButon2 = findViewById (p);
                    RadioButton radioButon3 = findViewById (pp);

                    String g  = radioButon.getText ().toString ();
                    String x = radioButon2.getText ().toString ();
                    String y = radioButon3.getText ().toString ();

                    Intent i = new Intent(getApplicationContext(), Main4Activity.class);
                    i.putExtra("qz1", qz1);
                    i.putExtra("qz2", qz2);
                    i.putExtra("qz3", qz3);
                    i.putExtra("qz3", qz3);
                    i.putExtra("qz4", qz4);
                    i.putExtra("qz5", qz5);
                    i.putExtra("qz6", qz6);
                    i.putExtra("qz7", g);
                    i.putExtra("qz8", x);
                    i.putExtra("qz9", y);

                    startActivity(i);


                }

            }
        });



    }
}
