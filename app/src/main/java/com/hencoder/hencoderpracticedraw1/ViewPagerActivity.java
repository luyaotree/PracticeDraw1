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

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author luyao
 * @date 2021/11/18
 */
public class ViewPagerActivity extends Activity {
    ViewPager mViewPager;
    List<View> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);
        list.add(LayoutInflater.from(this).inflate(R.layout.viewpager_item, null));
        list.add(LayoutInflater.from(this).inflate(R.layout.viewpager_item2, null));


        mViewPager = findViewById(R.id.viewpager);
        mViewPager.setAdapter(new SimpleViewPagerAdapter(list));
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                Log.e("luy", "i=" + i + ",v=" + i + ",i1===  " + i1);
                if (i == 0 && i1 > 200) {
                    View view = list.get(i + 1);
                    Button btn = view.findViewById(R.id.btn);
                    btn.setVisibility(View.GONE);
                }
                if (i == 0 && i1 == 0) {
                    View view = list.get(i + 1);
                    Button btn = view.findViewById(R.id.btn);
                    btn.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageSelected(int i) {
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }

        });
    }

    public class SimpleViewPagerAdapter extends PagerAdapter {
        List<View> list = new ArrayList<>();

        public SimpleViewPagerAdapter(List<View> list) {
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return view == o;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(list.get(position));
            return list.get(position);
//            TextView tv = new TextView(container.getContext());
//            tv.setGravity(Gravity.CENTER);
//            tv.setTextSize(20);
//            tv.setText("第" + position + "页");
//            // 添加到ViewPager容器
//            container.addView(tv);
//            // 返回填充的View对象
//            return tv;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
