package com.jikexueyuan.news.welcome;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.jikexueyuan.news.R;

public class WelcomePage extends FragmentActivity {
	ViewPager pager;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcome_list_layout);
		pager = (ViewPager) findViewById(R.id.vp_welcome_list);
		initpager();
	}
	public void initpager(){
		List<Fragment> list = new ArrayList<Fragment>();
		list.add(new WelcomeItemPage(R.layout.welcome_list_first_page_layout));
		list.add(new WelcomeItemPage(R.layout.welcome_list_scond_page_layout));
		list.add(new WelcomeItemPage(R.layout.welcome_list_third_page_layout));
		MyAdapter adpater = new MyAdapter(getSupportFragmentManager(), list);
		pager.setAdapter(adpater);
	}

}

class MyAdapter extends FragmentPagerAdapter {


	private List<Fragment> list;

	public MyAdapter(FragmentManager fm, List<Fragment> list) {
		super(fm);
		this.list = list;
	}

	@Override
	public Fragment getItem(int arg0) {
		return list.get(arg0);
	}

	@Override
	public int getCount() {
		return list.size();
	}
	

}
