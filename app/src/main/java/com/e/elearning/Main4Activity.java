package com.e.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
String qz1,qz2,qz3,qz4,qz5,qz6,qz7,qz8,qz9;
RadioGroup q11;
Button ded,ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main4);
        Bundle re=getIntent().getExtras();
        qz1=re.getString("qz1");
        qz2=re.getString("qz2");
        qz3=re.getString("qz3");
        qz4=re.getString("qz4");
        qz5=re.getString("qz5");
        qz6=re.getString("qz6");
        qz7=re.getString("qz7");
        qz8=re.getString("qz8");
        qz9=re.getString("qz9");

        q11=findViewById (R.id.q11);
        ded=findViewById (R.id.next);
        ver=findViewById (R.id.back);

        ver.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent ta=new Intent (getApplicationContext (),Main3Activity.class);
                startActivity (ta);

            }
        });

        ded.setOnClickListener (new View.OnClickListener (){

            @Override
            public void onClick(View v) {
                int rew=q11.getCheckedRadioButtonId ();
                if(rew==-1){
                    Toast.makeText (getApplicationContext (),"Select answer you fool",Toast.LENGTH_SHORT).show ();
                }else{
                    RadioButton radio= findViewById (rew);
                    String r= radio.getText ().toString ();

                    Intent i = new Intent(getApplicationContext(), Main5Activity.class);
                    i.putExtra("qz1", qz1);
                    i.putExtra("qz2", qz2);
                    i.putExtra("qz3", qz3);
                    i.putExtra("qz3", qz3);
                    i.putExtra("qz4", qz4);
                    i.putExtra("qz5", qz5);
                    i.putExtra("qz6", qz6);
                    i.putExtra("qz7", qz7);
                    i.putExtra("qz8", qz8);
                    i.putExtra("qz9", qz9);
                    i.putExtra("qz10", r);

                    startActivity(i);

                }
            }
        });

    }
}
