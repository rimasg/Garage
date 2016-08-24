package com.fortislabs.garage;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Button btnOpenGarage = (Button) view.findViewById(R.id.action_open_garage);
        btnOpenGarage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.action_open_garage:
                callToOpenGarage();
                break;
        }
    }

    private void callToOpenGarage() {
//        Toast.makeText(getActivity(), "Make call to open garage", Toast.LENGTH_SHORT).show();
        // TODO: 2016.08.22 Implement checkSelfPermission()
        String phoneNo = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(getString(R.string.pref_key_phone_no), "+000");
        Toast.makeText(getActivity(), "Phone no. from Prefs: " + phoneNo, Toast.LENGTH_SHORT).show();
/*
        final Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"));
        startActivity(intent);
*/
    }
}
