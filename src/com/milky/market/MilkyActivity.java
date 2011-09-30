package com.milky.market;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class MilkyActivity extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, BrowseActivity.class);

		// Initialize a TabSpec for each tab and add it to the TabHost
		spec = tabHost
				.newTabSpec("browse")
				.setIndicator("Browse",
						res.getDrawable(R.drawable.ic_tab_artists))
				.setContent(intent);
		tabHost.addTab(spec);

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, WishlistActivity.class);

		// Initialize a TabSpec for each tab and add it to the TabHost
		spec = tabHost
				.newTabSpec("wishlist")
				.setIndicator("Wishlist",
						res.getDrawable(R.drawable.ic_tab_artists))
				.setContent(intent);
		tabHost.addTab(spec);

		tabHost.setCurrentTab(1);
	}
}