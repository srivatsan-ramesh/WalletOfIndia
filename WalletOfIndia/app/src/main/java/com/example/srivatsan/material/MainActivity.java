package com.example.srivatsan.material;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedList;
import java.util.List;

import com.example.srivatsan.material.NavigationDrawerFragment;

public class MainActivity extends ActionBarActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        NavigationDrawerFragment drawerFragment= (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer,(DrawerLayout)findViewById(R.id.drawer_layout),toolbar);

        final int def_alpha = 0;
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageView disp_pic = (ImageView) findViewById(R.id.disp_pic);
        disp_pic.setImageBitmap(getRoundedShape(drawableToBitmap(disp_pic.getDrawable()), 120, 120));


        TextView user_name = (TextView) findViewById(R.id.user_name);
        TextView user_loc = (TextView) findViewById(R.id.user_loc);
        final Resources reso = getResources();
        user_name.setText("Srivatsan");
        user_loc.setText("Chennai");

        ImageView offer_wall = (ImageView) findViewById(R.id.offer_wall);

        ImageView refer_a_friend = (ImageView) findViewById(R.id.refer_a_friend);

        ImageView transfer = (ImageView) findViewById(R.id.transfer);

        final ImageView math_challenge = (ImageView) findViewById(R.id.math_challenge);

        final ImageView memory_challenge = (ImageView) findViewById(R.id.memory_challenge);

        final ImageView monthly_challenge = (ImageView) findViewById(R.id.monthly_challenge);

        ImageView friends = (ImageView) findViewById(R.id.friends);

        ImageView shopping = (ImageView) findViewById(R.id.shopping);

        ImageView transactions = (ImageView) findViewById(R.id.transactions);
           if(android.os.Build.VERSION.SDK_INT<=19) {
            disp_pic.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            //iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));
                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());

                            //iv.setBackground(reso.getDrawable(R.drawable.cirback));
                            return true;

                        }
                    }
                    return false;
                }

            });

            offer_wall.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));
                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.monthly_round));
                            return true;
                        }
                    }
                    return false;
                }

            });

            refer_a_friend.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));
                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.math_round));
                            return true;
                        }
                    }
                    return false;
                }

            });

            transfer.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));
                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.memory_round));
                            return true;
                        }
                    }
                    return false;
                }

            });

            math_challenge.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));


                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.math_round));

                            Intent intent = new Intent(getApplicationContext(), Chal1Page1.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                            startActivity(intent);
                            return true;
                        }
                    }
                    return false;
                }

            });

            memory_challenge.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));

                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.memory_round));


                            Intent intent = new Intent(getApplicationContext(), Chal2Page1.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                            startActivity(intent);

                            return true;
                        }
                    }
                    return false;
                }

            });

            monthly_challenge.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));
                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.monthly_round));

                            Intent intent = new Intent(getApplicationContext(), Chal3Page1.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                            startActivity(intent);

                            return true;
                        }
                    }
                    return false;
                }

            });

            friends.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));
                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.memory_round));
                            return true;
                        }
                    }
                    return false;
                }

            });

            shopping.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));
                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.monthly_round));
                            return true;
                        }
                    }
                    return false;
                }

            });


            transactions.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    // TODO Auto-generated method stub
                    switch (e.getActionMasked()) {

                        case MotionEvent.ACTION_DOWN: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.cirkbackhover));
                            return true;
                        }
                        case MotionEvent.ACTION_UP: {


                            ImageView iv = (ImageView) findViewById(v.getId());
                            iv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.math_round));
                            return true;
                        }
                    }
                    return false;
                }

            });
        }
        else{
               offer_wall.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                   }
               });
               refer_a_friend.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                   }
               });
               transfer.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                   }
               });
               math_challenge.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(getApplicationContext(), Chal1Page1.class);
                       intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                       ActivityOptions options = ActivityOptions
                               .makeSceneTransitionAnimation(MainActivity.this, (View)math_challenge, "math");
                       // start the new activity
                       startActivity(intent, options.toBundle());
                   }
               });
               memory_challenge.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(getApplicationContext(), Chal2Page1.class);
                       intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                       ActivityOptions options = ActivityOptions
                               .makeSceneTransitionAnimation(MainActivity.this, (View)memory_challenge, "memory");
                       // start the new activity
                       startActivity(intent, options.toBundle());
                   }
               });
               monthly_challenge.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                               Intent intent = new Intent(getApplicationContext(), Chal3Page1.class);
                       intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                       ActivityOptions options = ActivityOptions
                               .makeSceneTransitionAnimation(MainActivity.this, (View)monthly_challenge, "monthly");
                       // start the new activity
                       startActivity(intent, options.toBundle());

                   }
               });
               friends.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                   }
               });
               shopping.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                   }
               });
               transactions.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                   }
               });

        }


    }


    public String getUsername() {
        AccountManager manager = AccountManager.get(this);
        Account[] accounts = manager.getAccountsByType("com.google");
        List<String> possibleEmails = new LinkedList<String>();

        for (Account account : accounts) {
            // TODO: Check possibleEmail against an email regex or treat
            // account.name as an email address only for certain account.type values.
            possibleEmails.add(account.name);
        }

        if (!possibleEmails.isEmpty() && possibleEmails.get(0) != null) {
            String email = possibleEmails.get(0);
            String[] parts = email.split("@");

            if (parts.length > 1)
                return parts[0];
        }
        return null;
    }
    public static Bitmap drawableToBitmap (Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable).getBitmap();
        }

        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);

        return bitmap;
    }
    public int dpToPx(int dp)
    {
        float density = getApplicationContext().getResources().getDisplayMetrics().density;
        return Math.round((float)dp * density);
    }

    public Bitmap getRoundedShape(Bitmap scaleBitmapImage,int wdp,int hdp) {

        int targetWidth = dpToPx(wdp);
        int targetHeight = dpToPx(hdp);
        Bitmap targetBitmap = Bitmap.createBitmap(targetWidth,
                targetHeight,Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(targetBitmap);
        Path path = new Path();
        path.addCircle(((float) targetWidth - 1) / 2,
                ((float) targetHeight - 1) / 2,
                (Math.min(((float) targetWidth),
                        ((float) targetHeight)) / 2),
                Path.Direction.CCW);


        canvas.clipPath(path);
        Bitmap sourceBitmap = scaleBitmapImage;

        Paint paint=new Paint();
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(15);
        paint.setStyle(Paint.Style.STROKE);

        // 'paintWhite' colors the inner path
        Paint paintWhite = new Paint();
        paintWhite.setColor(Color.WHITE);
        paintWhite.setAntiAlias(true);
        paintWhite.setStrokeWidth(12);
        paintWhite.setStyle(Paint.Style.FILL);

        canvas.drawPath(path, paint);
        canvas.drawPath(path, paintWhite);

	    /*paint.setColor(Color.parseColor("#00ffffff"));
	    paint.setStyle(android.graphics.Paint.Style.FILL);

	    canvas.drawCircle(((float) targetWidth - 1) / 2,
	    ((float) targetHeight - 1) / 2,
	    (Math.min(((float) targetWidth-dpToPx(3)),
	            ((float) targetHeight-dpToPx(3)))) / 2,paint);*/

        // canvas.clipPath(path);
        canvas.drawBitmap(sourceBitmap,
                new Rect(0, 0, sourceBitmap.getWidth(),
                        sourceBitmap.getHeight()),
                new Rect(0, 0, targetWidth,
                        targetHeight), null);
        return targetBitmap;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //   return true;
        //}

        return super.onOptionsItemSelected(item);
    }
}
