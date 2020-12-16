package com.astzz.loadeasedashboard.ui.dashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.astzz.loadeasedashboard.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        BarChart barChart;

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        barChart = root.findViewById(R.id.barChart);
        ArrayList<BarEntry> visitor= new ArrayList<>();
        visitor.add(new BarEntry(2014,420));
        visitor.add(new BarEntry(2014,420));
        visitor.add(new BarEntry(2014,420));
        visitor.add(new BarEntry(2014,420));
        visitor.add(new BarEntry(2014,420));
        visitor.add(new BarEntry(2014,420));


        BarDataSet barDataSet = new BarDataSet(visitor,"visitors") ;
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart");
        barChart.animateY(2000) ;


        return root;
    }
}