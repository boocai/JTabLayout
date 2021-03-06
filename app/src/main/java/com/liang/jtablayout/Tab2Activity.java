package com.liang.jtablayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liang.widget.JTabLayout;

import java.util.Arrays;

public class Tab2Activity extends AppCompatActivity {

    JTabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    private String[] titles = {"首页", "新闻", "影视歌曲", "民生"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);
        tabLayout = findViewById(R.id.jTabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.tab_icon_hall_normal, R.mipmap.tab_icon_hall_press).setTitle("娱乐"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.tab_icon_record_normal, R.mipmap.tab_icon_record_press).setTitle("排名"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.tab_icon_chat_normal, R.mipmap.tab_icon_chat_press).setTitle("消息"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.tab_icon_user_normal, R.mipmap.tab_icon_user_press).setTitle("我的"));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.tab_icon_hall_normal, R.mipmap.tab_icon_hall_press).setTitle("娱乐"));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.tab_icon_record_normal, R.mipmap.tab_icon_record_press).setTitle("排名"));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.tab_icon_chat_normal, R.mipmap.tab_icon_chat_press).setTitle("消息"));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.tab_icon_user_normal, R.mipmap.tab_icon_user_press).setTitle("我的"));

        adapter = new ViewPagerAdapter(this, Arrays.asList(titles));
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.selectTab(2);
    }
}
