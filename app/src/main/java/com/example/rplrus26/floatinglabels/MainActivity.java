package com.example.rplrus26.floatinglabels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rplrus26.floatinglabels.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Button Hitung;
    EditText angka1;
    EditText angka2;
    TextView hasil;
    MaterialBetterSpinner aaa;
    Button Bersih;
    Menu menu;

    String[] SPINNERLIST = {"Tambah", "Kali", "Kurang", "Bagi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hitung = (Button) findViewById(R.id.hitung);
        angka1 = (EditText) findViewById(R.id.angka1);
        aaa = (MaterialBetterSpinner) findViewById(R.id.spinner);
        angka2 = (EditText) findViewById(R.id.angka2);
        hasil = (TextView) findViewById(R.id.Hasil);
        Bersih = (Button) findViewById(R.id.bersih);
        menu    =(Menu) findViewById(R.id.Exit);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        aaa.setAdapter(arrayAdapter);


        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int result = 0;


                    //ambil angka1 + angka 2 ditampilkan di Textview
                if (aaa.getText().toString().equals("Tambah")) {
                    //ambil angka1 + angka 2 ditampilkan di Textview
                    result = Integer.parseInt(angka1.getText().toString()) + Integer.parseInt(angka2.getText().toString());
                    hasil.setText(Integer.toString(result));

                } else if (aaa.getText().toString().equals("Kali")) {
                    //ambil angka1 * angka 2 ditampilkan di Textview
                    result = Integer.parseInt(angka1.getText().toString()) * Integer.parseInt(angka2.getText().toString());
                    hasil.setText(Integer.toString(result));

                } else if (aaa.getText().toString().equals("Kurang")) {
                    //ambil angka1 - angka 2 ditampilkan di Textview
                    result = Integer.parseInt(angka1.getText().toString()) - Integer.parseInt(angka2.getText().toString());
                    hasil.setText(Integer.toString(result));


                } else if (aaa.getText().toString().equals("Bagi")) {
                    //ambil angka1 / angka 2 ditampilkan di Textview
                    result = Integer.parseInt(angka1.getText().toString()) / Integer.parseInt(angka2.getText().toString());
                    hasil.setText(Integer.toString(result));

                }

                Bersih.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        hasil.setText("0");
                    }
                });
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.Exit: moveTaskToBack(true);

                default:
                    return super.onOptionsItemSelected(item);
        }
    }
}


