package com.example.TabHost;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MyActivity extends TabActivity{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TabHost tabHost=getTabHost();
        TabHost.TabSpec tab1=tabHost.newTabSpec("tab1")
                .setIndicator("已接电话")
                .setContent(R.id.tab01);
        tabHost.addTab(tab1);
        TabHost.TabSpec tab2=tabHost.newTabSpec("tab2")
                .setIndicator("呼出电话",getResources()
                .getDrawable(R.drawable.ic_launcher))
                .setContent(R.id.tab02);
        tabHost.addTab(tab2);
        TabHost.TabSpec tab3=tabHost.newTabSpec("tab3")
                .setIndicator("未接电话")
                .setContent(R.id.tab03);
        tabHost.addTab(tab3);
    }
}
