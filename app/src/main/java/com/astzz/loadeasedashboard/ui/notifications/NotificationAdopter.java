package com.astzz.loadeasedashboard.ui.notifications;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.astzz.loadeasedashboard.R;

import java.util.List;

public class NotificationAdopter extends RecyclerView.Adapter {


    private List<NotificationViewModel> cartitemModelList;

    public NotificationAdopter(List<NotificationViewModel> cartitemModelList) {
        this.cartitemModelList = cartitemModelList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View carditemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_detail_rider,parent,false);
        return new NoticationitemVIewHolder(carditemview);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int resource = cartitemModelList.get(position).getPicImage();
        int userId = cartitemModelList.get(position).getUSerId();
        int RidePic = cartitemModelList.get(position).getPicRide();
        int DocumentPic = cartitemModelList.get(position).getPicDocument();

    }

    @Override
    public int getItemCount() {
        return cartitemModelList.size();
    }

    static class NoticationitemVIewHolder extends RecyclerView.ViewHolder {


        private ImageView DriverPic;
        private TextView  UserID;
        private ImageView RideLineces;
        private ImageView Documentspic;
        private Button    buttonApproved;



        public NoticationitemVIewHolder(@NonNull View itemView) {
            super(itemView);

            DriverPic = itemView.findViewById(R.id.pic_img);
            UserID = itemView.findViewById(R.id.user_id);
            RideLineces = itemView.findViewById(R.id.ride_licence);
            Documentspic = itemView.findViewById(R.id.doc_car);
            buttonApproved = itemView.findViewById(R.id.approved);
        }

        public void setTextAmmount(int Driverp,int userId , int RideLinec , int Documentp ){
            DriverPic.setImageResource(Driverp);
             UserID.setText(userId);
            RideLineces.setImageResource(RideLinec);
            Documentspic.setImageResource(Documentp);

        }
    }
}
