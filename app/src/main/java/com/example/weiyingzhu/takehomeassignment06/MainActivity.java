package com.example.weiyingzhu.takehomeassignment06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private int amounts;
    private int tip;
    private int tax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void submit(View view){

        Intent mrIntent = new Intent(this, YourReceipt.class);

        double a = Double.parseDouble(((EditText) findViewById(R.id.amount)).getText().toString());
        double tax = Double.parseDouble(((EditText) findViewById(R.id.tax)).getText().toString());
        double tip =Double.parseDouble(((EditText) findViewById(R.id.tip)).getText().toString());

        Money total=new Money(a,tip,tax);

        mrIntent.putExtra(Keys.MONEY, total);

        startActivity(mrIntent);

    }
}
