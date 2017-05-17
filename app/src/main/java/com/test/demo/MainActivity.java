package com.test.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String URL_IMAGE = "http://pic32.nipic.com/20130827/12906030_123121414000_2.png";
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
