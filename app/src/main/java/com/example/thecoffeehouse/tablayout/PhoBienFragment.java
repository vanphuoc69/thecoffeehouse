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

public class PhoBienFragment extends Fragment {

    private GridView gvmon;
    private SanPhamAdapter spadt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon = r.findViewById(R.id.gv_mon_332);
        spadt = new SanPhamAdapter(PhoBienFragment.this.getActivity(), R.layout.item);
        gvmon.setAdapter(spadt);
        registerForContextMenu(gvmon);
        fakeData();
        addEvents();
        return r;
    }

    private void fakeData() {
        spadt.add(new DoUong(R.drawable.pb1, "CÀ PHÊ ARABICA", "100.000"));
        spadt.add(new DoUong(R.drawable.pb2, "CÀ PHÊ PHIN", "109.000"));
        spadt.add(new DoUong(R.drawable.pb3, "CÀ PHÊ PHIN ĐẮK NÔNG x CẦU ĐẤT", "150.000"));
        spadt.add(new DoUong(R.drawable.pb4, "Bình Giữ Nhiệt Inox The Coffee House", "370.000"));
        spadt.add(new DoUong(R.drawable.pb5, "Túi Canvas Đà Nẵng", "155.000"));
        spadt.add(new DoUong(R.drawable.pb6, "Bộ Ống Hút Inox", "99.000"));
        spadt.add(new DoUong(R.drawable.pb7, "Ly Nhựa 2 Lớp Quả Dứa", "180.000"));
        spadt.add(new DoUong(R.drawable.pb8, "Cốc Sứ The Coffee House Gợn Sóng", "200.000"));


    }

    private void addEvents() {
        gvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.chitiet);
                dialog.show();
            }
        });
        gvmon.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.danhgia);
                dialog.show();

                return true;
            }
        });
    }
}