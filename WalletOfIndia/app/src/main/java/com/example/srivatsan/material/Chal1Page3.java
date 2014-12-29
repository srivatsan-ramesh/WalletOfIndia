package com.example.srivatsan.material;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;


public class Chal1Page3 extends ActionBarActivity {
    private Toolbar toolbar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chal1_page3);
        toolbar1 = (Toolbar) findViewById(R.id.math_app_bar);

        setSupportActionBar(toolbar1);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView num1 = (TextView) findViewById(R.id.num1);
        TextView num2 = (TextView) findViewById(R.id.num2);
        TextView num3 = (TextView) findViewById(R.id.num3);
        TextView num4 = (TextView) findViewById(R.id.num4);
        TextView num5 = (TextView) findViewById(R.id.num5);
        TextView num6 = (TextView) findViewById(R.id.num6);
        TextView num7 = (TextView) findViewById(R.id.num7);
        TextView num8 = (TextView) findViewById(R.id.num8);
        TextView num9 = (TextView) findViewById(R.id.num9);
        TextView num0 = (TextView) findViewById(R.id.num0);

        final TextView del = (TextView) findViewById(R.id.del);
        final String col_hover_del="#000000";
        final String col_del="#f96b6a";
        final Resources reso = getResources();
        final int api=android.os.Build.VERSION.SDK_INT;
        del.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {

                        del.setBackgroundColor(Color.parseColor(col_hover_del));
                        TextView t = (TextView) findViewById(R.id.math_res);
                        String str = t.getText().toString();
                        if(str.length()>0)
                        {
                            str = str.substring(0, str.length()-1);
                            t.setText(str);
                        }
                        else
                        {
                            str="";
                            t.setText(str);
                        }
                        return true;
                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {

                        del.setBackgroundColor(Color.parseColor(col_del));
                        return true;
                    }
                }
                return false;
            }
        });

        num1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "1");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
        num2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "2");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });

        num3.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "3");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
        num4.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "4");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
        num5.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "5");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
        num6.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "6");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
        num7.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "7");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
        num8.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "8");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
        num9.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "9");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
        num0.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                switch(arg1.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        TextView t = (TextView) findViewById(R.id.math_res);
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirkbackhover));
                        t.setText(t.getText() + "0");
                        return true;

                    }
                    case MotionEvent.ACTION_UP:
                        // TODO Auto-generated method stub
                    {
                        TextView tv = (TextView) findViewById(arg0.getId());
                        tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.cirback));
                        return true;
                    }
                }
                return false;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chal1_page3, menu);
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
