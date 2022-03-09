package com.au.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        ConstraintLayout cl;
        TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl=findViewById(R.id.cl);
        tv=findViewById(R.id.tv);
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose A Color");
        menu.add(0,v.getId(),0,"Pizza");
        menu.add(0,v.getId(),0,"Burger");
        menu.add(0,v.getId(),0,"Barbeque");
        menu.add(0,v.getId(),0,"Manchurian");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getTitle()=="Pizza")
        {
            cl.setBackgroundResource(R.drawable.pizza);
        }
        else if(item.getTitle()=="Burger")
        {
            cl.setBackgroundResource(R.drawable.burger);
        }
        else if(item.getTitle()=="Barbeque")
        {
            cl.setBackgroundResource(R.drawable.barbeque);
        }
        else if(item.getTitle()=="Manchurian")
        {
            cl.setBackgroundResource(R.drawable.manchurian);
        }
        return true;
    }
}