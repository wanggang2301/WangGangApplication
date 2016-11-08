package com.wg.wanggangapplication.ui.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.wg.wanggangapplication.R;
import com.wg.wanggangapplication.ui.fragment.AlbumFragment;
import com.wg.wanggangapplication.ui.fragment.ChartFragment;
import com.wg.wanggangapplication.ui.fragment.FloatingViewFragment;
import com.wg.wanggangapplication.ui.fragment.FrameWorkAndMethodFragment;
import com.wg.wanggangapplication.ui.fragment.MaterialDesignLoginFragment;
import com.wg.wanggangapplication.ui.fragment.NewsFragment;
import com.wg.wanggangapplication.ui.fragment.PhotosFragment;
import com.wg.wanggangapplication.ui.fragment.VideoFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private Fragment fragment;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("拍照");

        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragment = new PhotosFragment();
        replaceFragment();
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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_camera) {

            toolbar.setTitle("拍照");

            fragment = new PhotosFragment();
            replaceFragment();
        } else if (id == R.id.nav_gallery) {
            toolbar.setTitle("新闻");

            fragment = new NewsFragment();
            replaceFragment();
        } else if (id == R.id.nav_slideshow) {
            toolbar.setTitle("视屏");

            fragment = new VideoFragment();
            replaceFragment();

        } else if (id == R.id.nav_manage) {
            toolbar.setTitle("工具");

        } else if (id == R.id.nav_chart) {
            toolbar.setTitle("图表");

            fragment = new ChartFragment();
            replaceFragment();


        } else if (id == R.id.nav_request) {
            toolbar.setTitle("框架及方法");
            fragment = new FrameWorkAndMethodFragment();
            replaceFragment();

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send2) {
            toolbar.setTitle("MD登录风格");
            fragment = new MaterialDesignLoginFragment();
            replaceFragment();
        } else if (id == R.id.nav_send3) {
            toolbar.setTitle("轻量开源相册Album");
            fragment = new AlbumFragment();
            replaceFragment();
        } else if (id == R.id.nav_send4) { //floating view
            toolbar.setTitle("Floating View");
            fragment = new FloatingViewFragment();
            replaceFragment();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void replaceFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (fragment.isAdded()) {
            ft.show(fragment);
        } else {
            ft.replace(R.id.main_content, fragment);
        }
        ft.commitAllowingStateLoss();
    }
}
