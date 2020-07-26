package com.akash.bmicalculator.splash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.akash.bmicalculator.databinding.FragmentSplashBinding;

import org.jetbrains.annotations.NotNull;

public class SplashFragment extends Fragment {

    private FragmentSplashBinding binding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment using data binding
        binding = FragmentSplashBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}