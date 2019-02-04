package com.enpassio.twowaydatabinding.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.enpassio.twowaydatabinding.R;
import com.enpassio.twowaydatabinding.databinding.AddToyBinding;
import com.enpassio.twowaydatabinding.utils.InjectorUtils;
import com.enpassio.twowaydatabinding.viewmodel.MainViewModel;

public class AddToyFragment extends Fragment {

    private AddToyBinding binding;

    public AddToyFragment() {
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_add_toy, container, false);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Get the view model instance and pass it to the binding implementation
        MainViewModel viewModel = ViewModelProviders.of(getActivity(), InjectorUtils.provideMainListFactory(getActivity())).get(MainViewModel.class);
        binding.setViewModel(viewModel);

        Bundle bundle = getArguments();
        if(bundle != null && bundle.getBoolean("isEdit")){
            viewModel.setEdit(true);
        } else{
            viewModel.setEdit(false);
        }
    }
}
