package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.Information;
import com.example.thecoffeehouse.Notify;
import com.example.thecoffeehouse.R;

public class trangchu extends Fragment implements View.OnClickListener {

    ImageView img1, img2;
    RelativeLayout rl1, rl2, rl3,rl4;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_navigation_trangchu, container, false);


        img1 = root.findViewById(R.id.imageNotify);
        img1.setOnClickListener(this);
        img2 = root.findViewById(R.id.imageAdd_332);
        img2.setOnClickListener(this);


        rl1 = root.findViewById(R.id.relativeTichdiem);
        rl2 = root.findViewById(R.id.relativeDathang);
        rl3 = root.findViewById(R.id.relativeCoupon);
        rl4 = root.findViewById(R.id.relativeReward);

        rl1.setOnClickListener(this);
        rl2.setOnClickListener(this);
        rl3.setOnClickListener(this);
        rl4.setOnClickListener(this);



        return root;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify) {
            Intent dsp = new Intent(trangchu.this.getActivity(), Notify.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageAdd_332) {
            Intent dsp = new Intent(trangchu.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.relativeTichdiem) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeDathang) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeCoupon) {
            Toast.makeText(this.getActivity(), "Coupon", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeReward) {
            Toast.makeText(this.getActivity(), "Rewards", Toast.LENGTH_SHORT).show();
        }
    }


}