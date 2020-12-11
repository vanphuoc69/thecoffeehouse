package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.thecoffeehouse.Information;
import com.example.thecoffeehouse.Login.SignIn_Activity;
import com.example.thecoffeehouse.Notify;
import com.example.thecoffeehouse.R;


public class Taikhoan extends Fragment implements View.OnClickListener {

    ImageView img;
    Button bt1, bt2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_navigation_taikhoan, container, false);

        img = r.findViewById(R.id.imageView_332);
        img.setOnClickListener(this);

        bt1 = r.findViewById(R.id.button2_332);
        bt1.setOnClickListener(this);

        bt2 = r.findViewById(R.id.button_DangXuat_332);
        bt2.setOnClickListener(this);
        return r;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView_332) {
            Intent dsp = new Intent(Taikhoan.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button2_332) {
            Intent dsp = new Intent(Taikhoan.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button_DangXuat_332) {
            Intent dsp = new Intent(Taikhoan.this.getActivity(), SignIn_Activity.class);
            startActivity(dsp);
        }
    }
}