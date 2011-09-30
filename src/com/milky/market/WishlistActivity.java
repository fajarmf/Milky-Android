package com.milky.market;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.jakewharton.android.viewpagerindicator.TitlePageIndicator;

public class WishlistActivity extends FragmentActivity {
	
	private ViewPager mPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.wishlist);

		ViewPagerAdapter adapter = new ViewPagerAdapter(this);
		mPager = (ViewPager) findViewById(R.id.viewpager);
		TitlePageIndicator indicator = (TitlePageIndicator) findViewById(R.id.indicator);
		mPager.setAdapter(adapter);
		indicator.setViewPager(mPager);
		// TextView textview = new TextView(this);
		// textview.setText("This is the Wishlist tab");
		// setContentView(textview);
	}
}
