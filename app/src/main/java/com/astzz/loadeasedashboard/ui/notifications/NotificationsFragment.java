package com.astzz.loadeasedashboard.ui.notifications;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.astzz.loadeasedashboard.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {


    private RecyclerView mRecyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        mRecyclerView = view.findViewById(R.id.driver_rcy);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        List<NotificationViewModel> carditemModelList = new ArrayList<>();

        carditemModelList.add(new NotificationViewModel(R.drawable.ic_dashboard_black_24dp,122222,R.drawable.ic_baseline_person_24,R.drawable.ic_home_black_24dp));
        carditemModelList.add(new NotificationViewModel(R.drawable.ic_dashboard_black_24dp,122222,R.drawable.ic_baseline_person_24,R.drawable.ic_home_black_24dp));
        carditemModelList.add(new NotificationViewModel(R.drawable.ic_dashboard_black_24dp,122222,R.drawable.ic_baseline_person_24,R.drawable.ic_home_black_24dp));
        carditemModelList.add(new NotificationViewModel(R.drawable.ic_dashboard_black_24dp,122222,R.drawable.ic_baseline_person_24,R.drawable.ic_home_black_24dp));


        NotificationAdopter cartAdopter = new NotificationAdopter(carditemModelList);
        mRecyclerView.setAdapter(cartAdopter);
        cartAdopter.notifyDataSetChanged();

        return view;

    }
}