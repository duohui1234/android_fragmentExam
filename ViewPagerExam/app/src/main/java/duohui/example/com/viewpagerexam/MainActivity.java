package duohui.example.com.viewpagerexam;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment[]  arrFragments  = new Fragment[3];
        arrFragments[0] = new RedFragment();
        arrFragments[1] = new GreenFragment();
        arrFragments[2] = new BlueFragment();

        ViewPager viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(),arrFragments);
        viewPager.setAdapter(adapter);

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
    }

}

