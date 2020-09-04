package com.floydd.aboutme.controller;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.floydd.aboutme.view.AboutFragment;
import com.floydd.aboutme.view.ContactFragment;
import com.floydd.aboutme.view.SkillsFragment;
import com.floydd.aboutme.view.WorkFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new AboutFragment();
            case 1:
                return new ContactFragment();
            case 2:
                return new SkillsFragment();
            case 3:
                return new WorkFragment();


        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
