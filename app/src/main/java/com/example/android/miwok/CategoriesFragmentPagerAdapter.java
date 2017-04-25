package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Bassam on 2/21/2017.
 */

public class CategoriesFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private Context context;

    public CategoriesFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case MainActivity.NUMBERS_ACTIVITY_POSITION:
                return new NumbersFragment();
            case MainActivity.FAMILY_ACTIVITY_POSITION:
                return new FamilyFragment();
            case MainActivity.COLORS_ACTIVITY_POSITION:
                return new ColorsFragment();
            case MainActivity.PHRASES_ACTIVITY_POSITION:
                return new PhrasesFragment();
            default:
                return null;
        }
    }

    @Override

    public int getCount() {
        return MainActivity.NUMBER_OF_CATEGORIES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case MainActivity.NUMBERS_ACTIVITY_POSITION:
                return context.getResources().getString(R.string.category_numbers);
            case MainActivity.FAMILY_ACTIVITY_POSITION:
                return context.getResources().getString(R.string.category_family);
            case MainActivity.COLORS_ACTIVITY_POSITION:
                return context.getResources().getString(R.string.category_colors);
            case MainActivity.PHRASES_ACTIVITY_POSITION:
                return context.getResources().getString(R.string.category_phrases);
            default:
                return null;
        }
    }
}
