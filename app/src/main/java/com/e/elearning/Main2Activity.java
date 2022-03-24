package com.e.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    String q1, q2, q3;
    RadioGroup q6, q5, q40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        Bundle bundle=getIntent().getExtras();
        q1=bundle.getString("q1");
        q2=bundle.getString("q2");
        q3=bundle.getString("q3");



        q5= findViewById (R.id.q5);
        q6 = findViewById (R.id.students);
        q40= findViewById (R.id.q40);

       Button next = findViewById (R.id.next);
        Button back = findViewById (R.id.back);

        back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent in = new Intent (getApplicationContext (), MainActivity.class);
                startActivity (in);
            }
        });

        next.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                int n = q5.getCheckedRadioButtonId ();
                int p = q6.getCheckedRadioButtonId ();
                int pp = q40.getCheckedRadioButtonId ();

                if ((n == -1) || (p == -1)|| (pp == -1)) {
                    Toast.makeText (getApplicationContext (), "Answer all the questions", Toast.LENGTH_SHORT).show ();
                } else {
                    RadioButton radioButon = findViewById (n);
                    RadioButton radioButon2 = findViewById (p);
                    RadioButton radioButon3 = findViewById (pp);

                   String g  = radioButon.getText ().toString ();
                    String x = radioButon2.getText ().toString ();
                    String y = radioButon3.getText ().toString ();


                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    i.putExtra("qz1", q1);
                    i.putExtra("qz2", q2);
                    i.putExtra("qz3", q3);
                    i.putExtra("qz4", g);
                    i.putExtra("qz5", x);
                    i.putExtra("qz6", y);
                    startActivity(i);


                }

            }
        });



    }
}
