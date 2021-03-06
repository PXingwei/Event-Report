package com.laioffer.eventreporter;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    String name;
    public BlankFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public BlankFragment(String name) {
        this.name = name;
    }
    public BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", "test");
        fragment.setArguments(bundle);
        return fragment;
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

}
