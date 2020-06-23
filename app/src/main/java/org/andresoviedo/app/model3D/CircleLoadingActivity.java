package org.andresoviedo.app.model3D;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tengchong.android.CircleLoadingView;

import org.andresoviedo.dddmodel2.R;

public class CircleLoadingActivity extends Activity {

    private CircleLoadingView mCircleLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_loading);

        mCircleLoadingView =  findViewById(R.id.circleView);

        mCircleLoadingView.setPercent(50);
    }
}