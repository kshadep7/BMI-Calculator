package com.akash.bmicalculator.addnewbmi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.akash.bmicalculator.databinding.AddNewBmiFragmentBinding;

@SuppressWarnings("ALL")
public class AddNewBmiFragment extends Fragment {

    private AddNewBmiViewModel mViewModel;
    private AddNewBmiFragmentBinding binding;

    public static AddNewBmiFragment newInstance() {
        return new AddNewBmiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // using data binding
        binding = AddNewBmiFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

/*
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AddNewBmiViewModel.class);
    }
*/

}