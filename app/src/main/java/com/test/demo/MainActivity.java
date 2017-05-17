package com.test.demo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String URL_IMAGE = "http://pic.qiantucdn.com/58pic/13/85/85/73T58PIC9aj_1024.jpg!" +
            "/watermark/url/L3dhdGVybWFyay12MS4zLnBuZw==/align/center";
    private ImageView iv_imageview;
    private Button bt_halfround;
    private Button bt_rectangle;
    private Button bt_round;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
        initData();

    }

    private void initView() {

        bt_halfround = (Button) findViewById(R.id.bt_halfround);
        bt_rectangle = (Button) findViewById(R.id.bt_rectangle);
        bt_round = (Button) findViewById(R.id.bt_round);
        iv_imageview = (ImageView) findViewById(R.id.iv_imageview);

    }


    private void initListener() {
        bt_halfround.setOnClickListener(this);
        bt_rectangle.setOnClickListener(this);
        bt_round.setOnClickListener(this);
    }

    private void initData() {

        ImageUtils.disRectangleImage(URL_IMAGE, iv_imageview);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bt_halfround:
                ImageUtils.displayFilletImage(URL_IMAGE, iv_imageview);
                break;
            case R.id.bt_rectangle:
                ImageUtils.disRectangleImage(URL_IMAGE, iv_imageview);
                break;
            case R.id.bt_round:
                ImageUtils.displayRoundImage(URL_IMAGE, iv_imageview);
                break;
        }

    }
}
