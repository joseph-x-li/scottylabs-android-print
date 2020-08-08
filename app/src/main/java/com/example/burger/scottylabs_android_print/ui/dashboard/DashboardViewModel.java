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

    private MutableLiveData<String> mText;
    private boolean isJoseph = true;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public void onPress(View v){
        TextView view = (TextView) findViewById(R.id.retardName);
        if(isJoseph){
            view.setText("Adam Wang");
        } else {
            view.setText("Joseph Li");
        }
        isJoseph = !isJoseph;
    }

    public LiveData<String> getText() {
        return mText;
    }
}