package com.AM.whatsbug.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.AM.whatsbug.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView img1 = (ImageView) findViewById(R.id.btlist);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i1 = new Intent(MainActivity.this, List_bacteria.class);
//                startActivity(i1);
                Toast.makeText(getApplicationContext(), "Bacteria Searching", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.btproceduretest);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, SearchProcedureActivity.class);
                startActivity(i2);
                Toast.makeText(getApplicationContext(), "Bacteria Searching", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView img3 = (ImageView) findViewById(R.id.bttestbctri);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(MainActivity.this, List_bacteria.class);
                startActivity(i3);
                Toast.makeText(getApplicationContext(), "Bacteria Searching", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView img4 = (ImageView) findViewById(R.id.btsearch);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(i4);
                Toast.makeText(getApplicationContext(), "Bacteria Searching", Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.bar){
            Intent i = new Intent(MainActivity.this, UsersListActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
