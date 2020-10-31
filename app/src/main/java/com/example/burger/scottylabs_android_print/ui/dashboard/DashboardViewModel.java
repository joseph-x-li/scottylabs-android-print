package com.example.burger.scottylabs_android_print.ui.dashboard;

import android.view.View;
import android.widget.TextView;

import com.example.burger.scottylabs_android_print.R;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class DashboardViewModel extends ViewModel {
    private boolean isJoseph = true;
    private MutableLiveData<String> mText;

    public DashboardViewModel() {
            mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void buttPress(){
        if (isJoseph) {
            mText.setValue("Adam Wang");
        } else {
            mText.setValue("Joseph Li");
        }
        isJoseph = !isJoseph;
    }

}