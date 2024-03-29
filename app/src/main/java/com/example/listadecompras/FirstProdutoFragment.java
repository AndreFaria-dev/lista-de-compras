package com.example.listadecompras;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.listadecompras.databinding.FragmentProdutoBinding;

public class FirstProdutoFragment extends Fragment {

    private FragmentProdutoBinding binding;
    //private Spinner spinnerComprarPor;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentProdutoBinding.inflate(inflater, container, false);

        String lsComprarPor[] = getResources().getStringArray(R.array.comprar_por);
        View view = inflater.inflate(R.layout.fragment_produto, container, false);



        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}