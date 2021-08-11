package com.example.listview_dts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] namanegara = new String[]{
            "Indonesia", "Australia", "Jerman", "Italia",
            "Inggris", "Belanda", "Brasil"};
    private String[] ibukota = new String[]{"Jakarta", "Canberra", "Berlin", "Roma", "London", "Amsterdam", "Brasilia"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (MainActivity.this, R.layout.activity_negara_main, R.id.txtNegara, namanegara);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>
                (MainActivity.this, R.layout.activity_negara_main, ibukota);


        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                Toast.makeText(MainActivity.this, "Negara yang dipilih" + namanegara[position] + "  dan  ibukotanya adalah" + ibukota[position], Toast.LENGTH_LONG).show();

            }

        });
    }



}