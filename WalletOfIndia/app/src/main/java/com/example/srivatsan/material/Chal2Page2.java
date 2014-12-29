package com.example.srivatsan.material;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Chal2Page2 extends ActionBarActivity {
    private Toolbar toolbar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chal2_page2);
        toolbar1 = (Toolbar) findViewById(R.id.memory_app_bar);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                TextView ti = (TextView) findViewById(R.id.secleft);
                ti.setText("" + (int) (millisUntilFinished / 1000));
            }

            public void onFinish() {
                //text.setText("done!");
                Intent intent = new Intent(getApplicationContext(), Chal2Page3.class);
        startActivity(intent);

            }
        }.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chal2_page2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id==R.id.home){
            NavUtils.navigateUpFromSameTask(this);

        }
        return super.onOptionsItemSelected(item);
    }
}
