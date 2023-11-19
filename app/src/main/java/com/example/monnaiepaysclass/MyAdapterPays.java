package com.example.monnaiepaysclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapterPays extends BaseAdapter {
    private List<Pays>pays;
    private LayoutInflater inflater;
    MyAdapterPays(Context context, ArrayList<Pays> p){
        inflater=LayoutInflater.from(context);
        pays=p;
    }
    @Override
    public int getCount() {
        return pays.size();
    }

    @Override
    public Object getItem(int i) {
        return pays.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup parent) {
        View v = convertview;
        if(v==null){
            v=inflater.inflate(R.layout.design,null);
            ImageView name=v.findViewById(R.id.imagePays);
            TextView txt = v.findViewById(R.id.MonnaiePays);
            TextView txt2= v.findViewById(R.id.codeISO);
            Pays p =pays.get(i);
            txt.setText(p.getMonnaie());
            txt2.setText(p.getCodeISO());
            name.setImageResource(p.getImagePays());
        }
        return v;
    }
}
