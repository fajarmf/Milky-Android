package com.milky.market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.jakewharton.android.viewpagerindicator.TitleProvider;

public class ViewPagerAdapter extends PagerAdapter implements TitleProvider {
	private static String[] titles = new String[] { "Your wish", "To sell" };
	private final Context context;

	public ViewPagerAdapter(Context context) {
		this.context = context;
	}

	@Override
	public String getTitle(int position) {
		return titles[position];
	}

	@Override
	public int getCount() {
		return titles.length;
	}

	@Override
	public Object instantiateItem(View pager, int position) {
		ListView v = new ListView(context);
		String[] from = new String[] { "str" };
		int[] to = new int[] { android.R.id.text1 };
		List<Map<String, String>> items = new ArrayList<Map<String, String>>();
		if (position % 2 == 0) {
			String buyList[] = new String[] { "Taxi", "Burger", "Taxi", "iPad",
					"Gardener", "Milk", "Soap", "Burger" };
			for (String s : buyList) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("str", s);
				items.add(map);
			}
		} else {
			for (int i = 0; i < 20; i++) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("str", String.format("Item %d", i + 1));
				items.add(map);
			}
		}
		SimpleAdapter adapter = new SimpleAdapter(context, items,
				android.R.layout.simple_list_item_1, from, to);
		v.setAdapter(adapter);
		((ViewPager) pager).addView(v, 0);
		return v;
	}

	@Override
	public void destroyItem(View pager, int position, Object view) {
		((ViewPager) pager).removeView((ListView) view);
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view.equals(object);
	}

	@Override
	public void finishUpdate(View view) {
	}

	@Override
	public void restoreState(Parcelable p, ClassLoader c) {
	}

	@Override
	public Parcelable saveState() {
		return null;
	}

	@Override
	public void startUpdate(View view) {
	}
}
class MyAdapter extends FragmentPagerAdapter {

	public MyAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount() {
		return 0;
	}
	
}
class ArrayListFragment extends ListFragment {
	
}