package com.example.ne.coffee;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void order(View view) {
        if(quantity>0) {
            String priceMessage = "Total:₹" + 10 * quantity + "\nThank You!";
            displayMessage(priceMessage);
        }
        else{
            String priceMessage = "Total:₹" + 10 * quantity;
            displayMessage(priceMessage);

        }

        /* display(quantity);
        displayPrice(10*quantity);*/
    }

    private void display(int number) {
        TextView quantityTextview = (TextView) findViewById(R.id.quantity);
        quantityTextview.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    public void plus(View view){
        quantity++;
        display(quantity);
    }
    public void minus(View view){
        if(quantity>0) quantity--;
        display(quantity);
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
