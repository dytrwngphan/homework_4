package com.example.homework_4.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework_4.fragments.Wonder1Fragment;
import com.example.homework_4.fragments.Wonder2Fragment;
import com.example.homework_4.fragments.Wonder3Fragment;

public class WondersPagerAdapter extends FragmentStateAdapter {

    public WondersPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Wonder1Fragment();
            case 1:
                return new Wonder2Fragment();
            case 2:
                return new Wonder3Fragment();
            default:
                return new Wonder1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
