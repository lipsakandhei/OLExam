package com.example.Aphexams;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ActionBar;
import android.view.MenuItem;

/**
 * Created by Sandeep on 28-05-2018.
 */
public class TimeLimit extends Activity {
    EditText Timer;
    EditText Timer1;
    Button ok;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_limit);
       // Timer=(EditText) findViewById(R.id.timer);
        ActionBar ab = getActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        Timer1=(EditText)findViewById(R.id.timer1) ;
        ok=(Button)findViewById(R.id.button6);
        ok.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
              /*  String tim = Timer.getText().toString();
                int value=Integer.parseInt(tim);*/
                String tim1=Timer1.getText().toString();
                int value1=Integer.parseInt(tim1);
               /* Global.time1=value*1000;
                Global.time2=1000;*/
                Global.time3=value1*1000;
                Global.time4=1000;
                Toast.makeText(TimeLimit.this,"Time Limit is set Successfully",
                        Toast.LENGTH_SHORT).show();
            }
        });



    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent i=new Intent(TimeLimit.this,HomeAdmin.class);
                startActivity(i);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //If the Intent resolves to an Activity in the current task the Activities above it on the stack are destroyed so that it is at the top of the stack, and it is re-used.
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}


