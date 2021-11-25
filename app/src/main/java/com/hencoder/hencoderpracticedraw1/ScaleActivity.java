package com.hencoder.hencoderpracticedraw1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author luyao
 * @date 2021/11/18
 */
public class ScaleActivity extends Activity {
    View parent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scale_activity);
        parent = findViewById(R.id.viewgroup);
        parent.setTranslationX(100);
        parent.setScaleX(0.5f);
        parent.setScaleY(0.5f);
        findViewById(R.id.imageview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "点击了图片", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "点击了文字", Toast.LENGTH_SHORT).show();
            }
        });

        final TextView content = findViewById(R.id.content);
        content.postDelayed(new Runnable() {
            @Override
            public void run() {
                content.setText("父容器高度:" + parent.getHeight() + ", 宽度:" + parent.getWidth());
            }
        }, 2000);
    }

}
