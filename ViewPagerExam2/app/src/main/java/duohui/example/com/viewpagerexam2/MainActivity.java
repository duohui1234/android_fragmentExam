package duohui.example.com.viewpagerexam2;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tl_tabs);
        ViewPager viewPager = findViewById(R.id.viewPager);

        Fragment[]  arrFragments  = new Fragment[3];
        arrFragments[0] = new RedFragment();
        arrFragments[1] = new GreenFragment();
        arrFragments[2] = new BlueFragment();

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(),arrFragments);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }


    private class MyPagerAdapter extends FragmentPagerAdapter{

        private Fragment[] arrFragments;

        public MyPagerAdapter(FragmentManager fm, Fragment[] arrFragments) {
            super(fm);
            this.arrFragments = arrFragments;
        }

        @Override
        public Fragment getItem(int position) {
            return arrFragments[position];
        }

        @Override
        public int getCount() {
            return arrFragments.length;
        }


        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){

                case 0:
                    return "Red";

                case 1:
                    return "Green";

                case 2:
                    return "Blue";

                default:
                    return "";
            }

        }
    }

}

