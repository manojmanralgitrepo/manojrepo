package com.example.trafficsignalapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
   Button Redbtn,Greenbtn,Yellowbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Redbtn=findViewById(R.id.Redbutton);
        Yellowbtn=findViewById(R.id.Yellowbutton);
        Greenbtn=findViewById(R.id.Greenbutton);

         Redbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
          Redbtn.setBackgroundColor(Color.RED);
             }
         });
         Yellowbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Yellowbtn.setBackgroundColor(Color.YELLOW);
             }
         });
Greenbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Greenbtn.setBackgroundColor(Color.GREEN);
    }
});
        }
    }
