package com.e.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    String qz1,qz2,qz3,qz4,qz5,qz6,qz7,qz8,qz9,q10;
    Button back, next;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main5);
        back=findViewById (R.id.back);
        next=findViewById (R.id.next);

        Bundle gaga=getIntent ().getExtras ();

        qz1=gaga.getString ("qz1");
              qz2=gaga.getString("qz2");
              qz3=gaga.getString("qz3");
              qz4=gaga.getString("qz4");
              qz5=gaga.getString("qz5");
              qz6=gaga.getString("qz6");
        qz7=gaga.getString("qz7");
        qz8=gaga.getString("qz8");
        qz9=gaga.getString("qz9");
        q10=gaga.getString("qz10");

     next.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if(qz1=="University of Eastern Africa, Baraton"){

             }
         }
     });


    }
}
