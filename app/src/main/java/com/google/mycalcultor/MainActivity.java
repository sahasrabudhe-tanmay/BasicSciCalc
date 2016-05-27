package com.google.mycalcultor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables
    public String sign = "";
    public String total = "";
    public Double temp1, temp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Buttons 0-9
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        //Buttons C,E,D,M,S,A
        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonE = (Button) findViewById(R.id.buttonE);
        Button buttonD = (Button) findViewById(R.id.buttonD);
        Button buttonM = (Button) findViewById(R.id.buttonM);
        Button buttonS = (Button) findViewById(R.id.buttonS);
        Button buttonA = (Button) findViewById(R.id.buttonA);

        //Event Handler
        assert button0 != null;
        if (button0 != null) {
            button0.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("0");
                        }
                    }
            );
        }

        assert button1 != null;
        if (button1 != null) {
            button1.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("1");
                        }
                    }
            );
        }

        assert button2 != null;
        if (button2 != null) {
            button2.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("2");
                        }
                    }
            );
        }

        assert button3 != null;
        if (button3 != null) {
            button3.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("3");
                        }
                    }
            );
        }

        assert button4 != null;
        if (button4 != null) {
            button4.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("4");
                        }
                    }
            );
        }

        assert button5 != null;
        if (button5 != null) {
            button5.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("5");
                        }
                    }
            );
        }

        assert button6 != null;
        if (button6 != null) {
            button6.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("6");
                        }
                    }
            );
        }

        assert button7 != null;
        if (button7 != null) {
            button7.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("7");
                        }
                    }
            );
        }

        assert button8 != null;
        if (button8 != null) {
            button8.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("8");
                        }
                    }
            );
        }

        assert button9 != null;
        if (button9 != null) {
            button9.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.append("9");
                        }
                    }
            );
        }

        //Button C
        assert buttonC != null;
        if (buttonC != null) {
            buttonC.setOnClickListener(

                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            output.setText("");
                        }
                    }
            );

        }

        //Buttons A,S,D,M
        assert buttonA != null;
        if(buttonA != null){
            buttonA.setOnClickListener(
                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            temp1 = Double.parseDouble(output.getText().toString());
                            output.setText("");
                            sign = "+";
                        }
                    }
            );
        }

        assert buttonS != null;
        if(buttonS != null){
            buttonS.setOnClickListener(
                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            temp1 = Double.parseDouble(output.getText().toString());
                            output.setText("");
                            sign = "-";
                        }
                    }
            );
        }

        assert buttonM != null;
        if(buttonM != null){
            buttonM.setOnClickListener(
                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            temp1 = Double.parseDouble(output.getText().toString());
                            output.setText("");
                            sign = "*";
                        }
                    }
            );
        }

        assert buttonD != null;
        if(buttonD != null){
            buttonD.setOnClickListener(
                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            temp1 = Double.parseDouble(output.getText().toString());
                            output.setText("");
                            sign = "/";
                        }
                    }
            );
        }

        assert buttonE != null;
        if(buttonE != null){
            buttonE.setOnClickListener(
                    new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            TextView output = (TextView) findViewById(R.id.Result);
                            temp2 = Double.parseDouble(output.getText().toString());

                            if(sign == "+")
                            {
                                output.setText(Double.toString(temp1 + temp2));
                            }
                            if(sign == "-")
                            {
                                output.setText(Double.toString(temp1 - temp2));
                            }
                            if(sign == "*")
                            {
                                output.setText(Double.toString(temp1 * temp2));
                            }
                            if(sign == "/")
                            {
                                if(temp2 == 0)
                                {
                                    output.setText("Cannot Divide By Zero!");
                                }
                                else
                                {
                                    output.setText(Double.toString(temp1 / temp2));
                                }
                            }
                        }
                    }
            );
        }

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
