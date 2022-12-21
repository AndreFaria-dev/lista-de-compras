package com.example.listadecompras;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.listadecompras.model.Produto;

import java.util.List;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoViewHolder> {

    private List<Produto> myItems;

    public ProdutoAdapter(List<Produto> myItems) {
        this.myItems = myItems;
    }

    @Override
    public ProdutoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_lista, parent, false);
        return new ProdutoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProdutoViewHolder holder, int position) {
        Produto myItem = myItems.get(position);
        holder.textViewTitle.setText(myItem.getNome());
        holder.textViewDescription.setText(myItem.getDescricao());

    }

    @Override
    public int getItemCount() {
        return myItems.size();
    }

}
