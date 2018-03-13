package com.example.imac.listviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lsTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void Anhxa();
    {
    lsTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
    arrayTraiCay = new ArrayList<>();
    arrayTraiCay.add(new TraiCay("Dau tay","Dau tay da lat",R.drawable.download));
    


    }

}
