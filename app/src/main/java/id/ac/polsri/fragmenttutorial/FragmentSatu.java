package id.ac.polsri.fragmenttutorial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentSatu extends Fragment {

    public static FragmentSatu newInstance(){
        return new FragmentSatu();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_satu, container, false);

        return view;
    }

    public interface OnFragmentInteractionListener{

    }
}