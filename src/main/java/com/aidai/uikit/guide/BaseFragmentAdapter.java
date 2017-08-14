package com.aidai.uikit.guide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author JokerX
 * @version V1.0
 * @Package com.aidai.net.base
 * @Description: 公共的Fragment适配器，主要用于Tab指示器
 * @date 2016/3/28 9:36
 */
public class BaseFragmentAdapter extends FragmentPagerAdapter {

	/**
	 * viewpager中的fragment
	 */
	private List<Fragment> mFragments;
	/**
	 * 每个fragment的标题
	 */
	private String[] mTitles;

	public BaseFragmentAdapter(FragmentManager fm, List<Fragment> fragments, String[] titles) {
		super(fm);
		this.mFragments = fragments;
		this.mTitles = titles;
	}

	public BaseFragmentAdapter(FragmentManager fragmentManager, List<Fragment> fragmentList) {
		super(fragmentManager);
		this.mFragments = fragmentList;
	}

	@Override
	public Fragment getItem(int position) {
		return mFragments.get(position);
	}

	@Override
	public int getCount() {
		return mFragments.size();
	}


	@Override
	public CharSequence getPageTitle(int position) {
		return mTitles[position];
	}
}
