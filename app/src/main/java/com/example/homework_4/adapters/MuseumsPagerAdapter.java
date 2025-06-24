package com.example.homework_4.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework_4.fragments.Museum1Fragment;
import com.example.homework_4.fragments.Museum2Fragment;
import com.example.homework_4.fragments.Museum3Fragment;

public class MuseumsPagerAdapter extends FragmentStateAdapter {

    public MuseumsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Museum1Fragment();
            case 1:
                return new Museum2Fragment();
            case 2:
                return new Museum3Fragment();
            default:
                return new Museum1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
