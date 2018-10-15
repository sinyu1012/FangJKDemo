package com.sinyu.fangjkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.sinyu.fangjkdemo.view.Like;
import com.sinyu.fangjkdemo.view.ThumbsUpView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout llLike;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llLike = (LinearLayout) findViewById(R.id.ll_Like);
        llLike.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_Like:

                int childCount = llLike.getChildCount();
                Log.d(TAG, "onClick: "+childCount);
                for (int i = 0; i < childCount; i++) {
                    if (llLike.getChildAt(i) instanceof Like) {
                        Log.d(TAG, "onClick: "+2);
                        ((Like) llLike.getChildAt(i)).changeLike();
                    }
                }
                break;
        }
    }

}
