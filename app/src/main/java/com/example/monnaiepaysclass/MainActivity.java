package com.example.monnaiepaysclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pays> list;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         lv = findViewById(R.id.affichage);

        list=new ArrayList<>();
        list.add(new Pays(R.drawable.morroco,"Dirhame","DH"));
        list.add(new Pays(R.drawable.korea,"won","KRW"));
        list.add(new Pays(R.drawable.arabiesaoudite," Riyal saoudien","SAR"));
        list.add(new Pays(R.drawable.japan," yen","JPN"));
        list.add(new Pays(R.drawable.emirates,"Dirhame","AED"));
        MyAdapterPays my = new MyAdapterPays(this,list);
        lv.setAdapter(my);
    }
}