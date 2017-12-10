package com.be_happy.nasrallah.steam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout dl;

    ActionBarDrawerToggle ad;
    NavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dl = (DrawerLayout) findViewById(R.id.activity_main);
        nav = (NavigationView) findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(this);
        nav.setItemIconTintList(null);
       ad=new ActionBarDrawerToggle(
               this,
               dl,
               R.drawable.w,
               R.string.open,
               R.string.close
       ) {

           @Override
           public void onDrawerOpened(View drawerView) {
               Toast.makeText(MainActivity.this, "Drawer Opened",
                       Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onDrawerClosed(View drawerView) {
               Toast.makeText(MainActivity.this, "Drawer Closed",
                       Toast.LENGTH_SHORT).show();
           }
       };

        dl.addDrawerListener(ad);
        ad.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (ad.onOptionsItemSelected(item)){
return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.mid) {
            Intent i = new Intent(MainActivity.this, tow.class);
            startActivity(i);
        }
        return false;
    }
}
