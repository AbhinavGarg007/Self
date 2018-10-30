package com.example.emp354.myapplication2;

import android.os.Handler;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TabLayout tabLayout=findViewById(R.id.tab_layout);


        ViewPager viewPager = findViewById(R.id.viewpager);
        LinearLayout linearLayout = findViewById(R.id.layout_name);
        NestedScrollView nestedScrollView = findViewById(R.id.nested_scroll_view);
        ViewPagerAdapter view_pager_adapter = new ViewPagerAdapter(getApplicationContext());
        viewPager.setAdapter(view_pager_adapter);
        tabLayout.setupWithViewPager(viewPager);


        int maxHeight = getWindowManager().getDefaultDisplay().getHeight();
        int maxWidth =getWindowManager().getDefaultDisplay().getWidth();


        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        NestedScrollView.LayoutParams layoutParams1=new NestedScrollView.LayoutParams(NestedScrollView.LayoutParams.WRAP_CONTENT,NestedScrollView.LayoutParams.WRAP_CONTENT);

        int req_height=(int)(0.571*maxHeight);
        layoutParams1.width=maxWidth;
        layoutParams1.height=req_height;
       /* viewPager.setLayoutParams(layoutParams);*/

        linearLayout.setLayoutParams(layoutParams1);
        linearLayout.setTop(req_height);

       /* viewPager.setLayoutParams(new ViewPager.LayoutParams(this ,maxheight));
        linearLayout.setTop(height * 3 / 8);*/



       /* viewPager.setBottom(req_height);*/
        /*linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,req_height));
        int he=req_height;*/

        /*NestedScrollView nestedScrollView = findViewById(R.id.nested_scroll_view);
        nestedScrollView.setSmoothScrollingEnabled(true);
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                Log.d("scroll", "onScrollChange: " + v + "scrollX:" + scrollX + " scrollY:" + scrollY + " oldScrollX:" + oldScrollX + " oldScrollY:" + oldScrollY);
            }
        });*/
//        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.col_toolbar_layout);
//        toolbarLayout.setLayoutAnimationListener();
        /*AppBarLayout appBarLayout = findViewById(R.id.appbar_layout);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                Log.d("scroll", "onOffsetChanged: " + verticalOffset);
            }
        });*/
    }


}
