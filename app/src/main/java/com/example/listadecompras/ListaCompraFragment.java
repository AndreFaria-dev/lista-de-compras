package com.example.listadecompras;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listadecompras.databinding.FragmentListaCompraBinding;
import com.example.listadecompras.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListaCompraFragment<FragmentListaCompraBinding> extends Fragment {

    private FragmentListaCompraBinding binding;
    private RecyclerView recyclerView;
    private ProdutoAdapter produtoAdapter;
    private List<Produto> produtoList;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        View view = inflater.inflate(R.layout.fragment_lista_compra, container, false);

        recyclerView = view.findViewById(R.id.recycler_view_lista);
        produtoList = new ArrayList<>();
        produtoAdapter = new ProdutoAdapter(produtoList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(produtoAdapter);

        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        System.out.println("TESTE LISTA DE COMPRA INICIALIZADA");
        //produtoList.add(new Produto("Teste", "Produto abstrato para teste", 0.00));

        super.onViewCreated(view, savedInstanceState);

        //produtoList.add(new Produto("Teste", "Descrição de produto abstrato", 10.00));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}