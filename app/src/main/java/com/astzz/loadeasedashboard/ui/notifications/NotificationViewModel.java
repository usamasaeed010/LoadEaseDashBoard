package com.astzz.loadeasedashboard.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationViewModel  {
    private int PicImage;
    private int USerId;
    private int PicRide;
    private int PicDocument;


    public NotificationViewModel(int picImage, int USerId, int picRide, int picDocument) {
        PicImage = picImage;
        this.USerId = USerId;
        PicRide = picRide;
        PicDocument = picDocument;

    }


    public int getPicImage() {
        return PicImage;
    }

    public void setPicImage(int picImage) {
        PicImage = picImage;
    }

    public int getUSerId() {
        return USerId;
    }

    public void setUSerId(int USerId) {
        this.USerId = USerId;
    }

    public int getPicRide() {
        return PicRide;
    }

    public void setPicRide(int picRide) {
        PicRide = picRide;
    }

    public int getPicDocument() {
        return PicDocument;
    }

    public void setPicDocument(int picDocument) {
        PicDocument = picDocument;
    }


}