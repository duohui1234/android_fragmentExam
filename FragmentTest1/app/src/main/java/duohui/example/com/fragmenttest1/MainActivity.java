package duohui.example.com.fragmenttest1;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnColorButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PurpleFragment purpleFragment = new PurpleFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.frame_right,purpleFragment).commit();


    }



    // color 0 => purple
    // color 1 => blue
    // color 2 => orange
    @Override
    public void onColorClick(int color) {

        Fragment fragment = null;

        switch (color){

            case 0:
                fragment = new PurpleFragment();
                break;

            case 1:
                fragment = new BlueFragment();
                break;

            case 2:
                fragment = new OrangeFragment();
                break;

        }

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_right,fragment).commit();


    }

}
