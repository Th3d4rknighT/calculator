package com.thedarknight.wrkshpex;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {
    String s1="";
    double a1;
    double a2;
    TextView txtfld;
    String opr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtfld=(TextView)findViewById(R.id.textfield);
        Typeface tf=Typeface.createFromAsset(getApplicationContext().getAssets(),"Font/digital.ttf");
        txtfld.setTypeface(tf);
    }
    public void click_9(View v)
    {
        s1=s1+"9";
        txtfld.setText(s1);
    }
    public void click_8(View v)
    {

        s1=s1+"8";
        txtfld.setText(s1);
    }
    public void click_7(View v)
    {

        s1=s1+"7";
        txtfld.setText(s1);
    }
    public void click_6(View v)
    {

        s1=s1+"6";
        txtfld.setText(s1);
    }public void click_5(View v)
    {

        s1=s1+"5";
        txtfld.setText(s1);
    }public void click_4(View v)
    {

        s1=s1+"4";
        txtfld.setText(s1);
    }
    public void click_3(View v)
    {

        s1=s1+"3";
        txtfld.setText(s1);
    }
    public void click_2(View v)
    {
        s1=s1+"2";
        txtfld.setText(s1);

    }public void click_1(View v)
    {

        s1=s1+"1";
        txtfld.setText(s1);
    }
    public void click_mul(View v)
    {
        a1=Double.parseDouble(s1);
        s1="";
        txtfld.setText("");
        opr="*";
    }
    public void click_add(View v)
    {

        a1=Double.parseDouble(s1);
        s1="";
        txtfld.setText("");
        opr="+";
    }
    public void click_min(View v)
    {

        a1=Double.parseDouble(s1);
        s1="";
        txtfld.setText("");
        opr="-";
    }
    public void click_div(View v)
    {

        a1=Double.parseDouble(s1);
        s1="";
        txtfld.setText("");
        opr="/";
    }
    public void click_ans(View v)
    {
        a2=Double.parseDouble(s1);
        s1="";
        calculate();
    }
    public void click_0(View v)
    {

        s1=s1+"0";
        txtfld.setText(s1);
    }
    public void calculate()
    {
        if(opr.equals("+"))
        {
            txtfld.setText(Double.toString(a1+a2));
        }
        if(opr.equals("*"))
        {
            txtfld.setText(Double.toString(a1*a2));
        }
        if(opr.equals("/"))
        {
            txtfld.setText(Double.toString(a1/a2));
        }
        if(opr.equals("-"))
        {
            txtfld.setText(Double.toString(a1-a2));
        }

    }
    public void reset(View v)
    {
        s1="";
        a1=0;
        a2=0;
        txtfld.setText("");

        Toast.makeText(this, "cleared", Toast.LENGTH_SHORT).show();
    }
}
