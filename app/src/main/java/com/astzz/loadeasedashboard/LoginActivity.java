package com.astzz.loadeasedashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.budiyev.android.circularprogressbar.CircularProgressBar;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {


    TextView sifn_up;

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard);
//


        CircularProgressBar progressBar = findViewById(R.id.progress_bar);
        progressBar.setProgress(30f);

//        sifn_up  =findViewById(R.id.sign_up);
//        sifn_up.setOnClickListener(view -> {
//            Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
//            startActivity(intent);
//        });

        barChart = findViewById(R.id.barChart);
        ArrayList<BarEntry> visitor= new ArrayList<>();
        visitor.add(new BarEntry(2014,120));
        visitor.add(new BarEntry(2015,220));
        visitor.add(new BarEntry(2016,380));
        visitor.add(new BarEntry(2017,400));
        visitor.add(new BarEntry(2018,520));
        visitor.add(new BarEntry(2019,620));


        BarDataSet barDataSet = new BarDataSet(visitor,"visitors") ;
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart");
        barChart.animateY(2000) ;

    }

}