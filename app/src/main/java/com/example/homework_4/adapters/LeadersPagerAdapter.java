package com.example.homework_4.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework_4.fragments.Leader1Fragment;
import com.example.homework_4.fragments.Leader2Fragment;
import com.example.homework_4.fragments.Leader3Fragment;

public class LeadersPagerAdapter extends FragmentStateAdapter {

    public LeadersPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Leader1Fragment();
            case 1:
                return new Leader2Fragment();
            case 2:
                return new Leader3Fragment();
            default:
                return new Leader1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
