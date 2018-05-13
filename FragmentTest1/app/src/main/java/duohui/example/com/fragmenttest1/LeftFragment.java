package duohui.example.com.fragmenttest1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment implements View.OnClickListener {

    OnColorButtonListener onColorButtonListener;

    public LeftFragment() {
        // Required empty public constructor
    }


    //fragment가 Activity에 붙을 때 호출
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onColorButtonListener = (OnColorButtonListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_left, container, false);
        view.findViewById(R.id.purple_menu).setOnClickListener(this);
        view.findViewById(R.id.blue_menu).setOnClickListener(this);
        view.findViewById(R.id.orange_menu).setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.purple_menu :
                onColorButtonListener.onColorClick(0);
                break;

            case R.id.blue_menu :
                onColorButtonListener.onColorClick(1);
                break;

            case R.id.orange_menu :
                onColorButtonListener.onColorClick(2);
                break;

        }

    }
}
