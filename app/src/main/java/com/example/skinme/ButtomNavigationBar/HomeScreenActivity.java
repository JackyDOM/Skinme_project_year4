package com.example.skinme.ButtomNavigationBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.skinme.AboutScreen.AboutFragment;
import com.example.skinme.CartScreen.CartFragment;
import com.example.skinme.Favorite_Screen.FavboriteFragment;
import com.example.skinme.HomeScreen.HomeFragment;
import com.example.skinme.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeScreenActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FrameLayout nav_host_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        bottomNavigationView = findViewById(R.id.bottomNavView);
        nav_host_fragment = findViewById(R.id.nav_host_fragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if(itemId == R.id.navHome){
                    loadFragment(new HomeFragment(), false);
                }else if(itemId == R.id.navcart){
                    loadFragment(new CartFragment(), false);
                }else if(itemId == R.id.navContact){
                    loadFragment(new AboutFragment(), false);
                }else{
                    loadFragment(new FavboriteFragment(), false);
                }

                return true;
            }
        });

        loadFragment(new HomeFragment(), true);

    }

    private void loadFragment(Fragment fragment, boolean isAppInitialized) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (isAppInitialized) {
            fragmentTransaction.add(R.id.nav_host_fragment, fragment);
        } else {
            fragmentTransaction.replace(R.id.nav_host_fragment, fragment);
        }

        fragmentTransaction.commitAllowingStateLoss();
    }
}