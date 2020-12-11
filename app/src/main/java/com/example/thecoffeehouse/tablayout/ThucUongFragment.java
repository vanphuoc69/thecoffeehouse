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

public class ThucUongFragment extends Fragment {

    private GridView gvmon;
    private SanPhamAdapter spadt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon = r.findViewById(R.id.gv_mon_332);
        spadt = new SanPhamAdapter(ThucUongFragment.this.getActivity(), R.layout.item);
        gvmon.setAdapter(spadt);
        registerForContextMenu(gvmon);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt.add(new DoUong(R.drawable.nuoc1, "TRÀ OOLONG BƯỞI MẬT ONG", "55.000"));
        spadt.add(new DoUong(R.drawable.nuoc2, "PHÚC BỒN TỬ CAM ĐÁ XAY", "59.000"));
        spadt.add(new DoUong(R.drawable.nuoc3, "TRÀ ĐÀO CAM XẢ", "50.000"));
        spadt.add(new DoUong(R.drawable.nuoc4, "TRÀ OOLONG VẢI", "47.000"));
        spadt.add(new DoUong(R.drawable.nuoc5, "TRÀ MATCHA MACCHIATO", "45.000"));
        spadt.add(new DoUong(R.drawable.nuoc6, "TRÀ OOLONG PHÚC BỒN TỬ", "57.000"));
        spadt.add(new DoUong(R.drawable.nuoc7, "TRÀ ĐEN MACCHIATO", "50.000"));
        spadt.add(new DoUong(R.drawable.nuoc8, "TRÀ XOÀI MACCHIATO", "55.000"));
        spadt.add(new DoUong(R.drawable.nuoc9, "TRÀ OOLONG HẠT SEN", "45.000"));
        spadt.add(new DoUong(R.drawable.nuoc10, "TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "65.000"));

    }

    private void addEvents() {
        gvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(ThucUongFragment.this.getActivity());
                dialog.setContentView(R.layout.chitiet);
                dialog.show();
            }
        });
        gvmon.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(ThucUongFragment.this.getActivity());
                dialog.setContentView(R.layout.danhgia);
                dialog.show();

                return true;
            }
        });
    }
}