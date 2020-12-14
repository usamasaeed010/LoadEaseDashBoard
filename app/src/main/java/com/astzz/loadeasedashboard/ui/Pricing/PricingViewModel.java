package com.astzz.loadeasedashboard.ui.Pricing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PricingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PricingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Pricing fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }
}