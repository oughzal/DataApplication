package com.omarcomputer.datapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

import kotlin.Pair;

public class MainActivity2 extends AppCompatActivity implements Fragment1.SendMessages {
    ViewPager2 viewPager;
    TabLayout tabLayout;
    TextView txtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        txtMessage = findViewById(R.id.txtCible);
        ArrayList<String> tabNames = new ArrayList<>();
        ArrayList<Integer> tabNamesIcons = new ArrayList<>();
        tabNames.add("Chat");
        tabNames.add("Status");
        tabNames.add("Call");
        tabNames.add("Groupe");
        tabNamesIcons.add(R.drawable.message);
        tabNamesIcons.add(R.drawable.status);
        tabNamesIcons.add(R.drawable.call);
        tabNamesIcons.add(R.drawable.group);
        viewPager.setAdapter(new ViewPagerAdapterJava(this));
        new TabLayoutMediator(tabLayout,viewPager,(tab,pos)->{
            tab.setText(tabNames.get(pos));
            tab.setIcon(tabNamesIcons.get(pos));
        }).attach();
    }


    @Override
    public void sendMessage(String msg) {
    //txtMessage.setText(msg);
    Fragment2 fr2 =(Fragment2)getSupportFragmentManager().getFragments().get(1);
    fr2.getMessage(msg);
    }
}