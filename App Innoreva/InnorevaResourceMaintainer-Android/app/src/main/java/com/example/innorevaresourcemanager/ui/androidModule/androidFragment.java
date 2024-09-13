package com.example.innorevaresourcemanager.ui.androidModule;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.innorevaresourcemanager.databinding.FragmentAndroidBinding;
import com.example.innorevaresourcemanager.ui.DomainModule.ViewPagerDomainAdapter;


public class androidFragment extends Fragment {
    FragmentAndroidBinding binding;
    ViewPagerDomainAdapter adapter;

    public androidFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentAndroidBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter= new ViewPagerDomainAdapter(getChildFragmentManager());
        binding.viewPager.setAdapter(adapter);
        binding.tab.setupWithViewPager(binding.viewPager);
    }
}