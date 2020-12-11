package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;

public class DoAnFragment extends Fragment {

    private GridView gvmon;
    private SanPhamAdapter spadt;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_do_an, container, false);

        gvmon = r.findViewById(R.id.gv_mon_332);
        spadt = new SanPhamAdapter(DoAnFragment.this.getActivity(), R.layout.item);
        gvmon.setAdapter(spadt);
        registerForContextMenu(gvmon);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt.add(new DoUong(R.drawable.hatdieu, "Điều vàng mật ong", "45.000"));
        spadt.add(new DoUong(R.drawable.cam, "Cam tươi sấy dẻo", "35.000"));
        spadt.add(new DoUong(R.drawable.banh, "Croissant Trứng muối", "30.000"));
        spadt.add(new DoUong(R.drawable.ga, "Gà Xé Lá Chanh", "20.000"));
        spadt.add(new DoUong(R.drawable.heo, "Heo Sấy Xông Khói", "25.000"));
        spadt.add(new DoUong(R.drawable.mit, "Mít sấy", "30.000"));
    }
    private void addEvents() {
        gvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.chitiet);
                dialog.show();
            }
        });
        gvmon.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.danhgia);
                dialog.show();

                return true;
            }
        });
    }
}