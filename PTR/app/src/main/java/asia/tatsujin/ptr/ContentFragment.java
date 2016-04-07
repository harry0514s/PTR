package asia.tatsujin.ptr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ContentFragment extends Fragment {

    View view;
    @Override
    public void onSaveInstanceState(Bundle bundle) {
        // do not call super.onSaveInstanceState()
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_favroite, container, false);
        return view;
    }


}
