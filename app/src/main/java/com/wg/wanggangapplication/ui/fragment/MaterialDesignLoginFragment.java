package com.wg.wanggangapplication.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.wg.wanggangapplication.R;
import com.wg.wanggangapplication.ui.activity.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MaterialDesignLoginFragment extends Fragment {

    @BindView(R.id.btn)
    Button btn;


    public MaterialDesignLoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_material_design_login, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.btn)
    public void onClick() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
    }
}
