package com.akash.bmicalculator.bmis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.akash.bmicalculator.databinding.BmisFragmentBinding;

@SuppressWarnings("ALL")
public class BmisFragment extends Fragment {

    private BmisViewModel mViewModel;
    private BmisFragmentBinding binding;

    public static BmisFragment newInstance() {
        return new BmisFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = BmisFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    // no need
    // will be using androidx library to initialize viewModel
/*
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BMIsViewModel.class);
    }
*/

}