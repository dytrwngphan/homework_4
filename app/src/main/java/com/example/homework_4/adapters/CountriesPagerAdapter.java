package com.example.homework_4.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework_4.fragments.UnitedKingdomFragment;
import com.example.homework_4.fragments.FranceFragment;
import com.example.homework_4.fragments.ItalyFragment;

public class CountriesPagerAdapter extends FragmentStateAdapter {

    public CountriesPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new UnitedKingdomFragment();
            case 1:
                return new FranceFragment();
            case 2:
                return new ItalyFragment();
            default:
                return new UnitedKingdomFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3; // UK, France, Italy
    }
}
