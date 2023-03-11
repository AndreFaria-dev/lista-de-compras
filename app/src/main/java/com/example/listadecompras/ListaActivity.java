package com.example.listadecompras;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listadecompras.databinding.ActivityListaBinding;
import com.example.listadecompras.model.Produto;
import com.google.android.material.textfield.TextInputEditText;

public class ListaActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityListaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityListaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_lista);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        //Exibir botão de voltar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        RecyclerView recyclerView = findViewById(R.id.recyclerProdutos);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);




    }

    public void abrirFormProdutos(View view){
        Intent intent = new Intent(this, ProdutoActivity.class);
        startActivity(intent);
    }

    public void salvarListaCompra(View view){

        System.out.println("Salvar o nome da lista e os produtos adicionados no sqlite");
        EditText editText = findViewById(R.id.edit_text_nome_lista);
        String nomeLista = editText.getText().toString();


        if (!nomeLista.isEmpty()){
            System.out.println("Salvar nome da lista: " + nomeLista);
            
        }else {
            System.out.println("Nome de lista inválido" + nomeLista);
            editText.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_lista);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}