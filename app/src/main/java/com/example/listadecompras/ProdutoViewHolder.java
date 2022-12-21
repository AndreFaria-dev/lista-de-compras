package com.example.listadecompras;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ProdutoViewHolder extends RecyclerView.ViewHolder{
    public TextView textViewTitle;
    public TextView textViewDescription;

    public ProdutoViewHolder(View itemView) {
        super(itemView);
        textViewTitle = itemView.findViewById(R.id.text_view_nome);
        textViewDescription = itemView.findViewById(R.id.text_view_descricao);
    }
}
