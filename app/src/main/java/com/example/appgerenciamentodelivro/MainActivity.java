package com.example.appgerenciamentodelivro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appgerenciamentodelivro.adapter.LivroAdapter;
import com.example.appgerenciamentodelivro.dominio.Livro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView listar_livros = findViewById(R.id.listalivro);

        listar_livros.setLayoutManager(new LinearLayoutManager(this));

        List<Livro> listarlivros = new ArrayList<>();

       // Livro l1 = new Livro(1,"Android para Iniciantes", "Phillipe Silva", "Editora Phill",false);
        listarlivros.add(new Livro(1L,"Android para Leigos","Michael Burton","Alta books",false));
        listarlivros.add(new Livro(2L,"Android para Programadores","Paul J, Deitel","Bookman",true));
        listarlivros.add(new Livro(3L,"Desenvolvimento para Android","Griffiths, David","Alta books",false));
        listarlivros.add(new Livro(4L,"Android Base de Dados","Queirós, Ricardo","FCA Editora",true));
        listarlivros.add(new Livro(5L,"Android em Ação","King, Chris","Elsevier - Campus",false));
        listarlivros.add(new Livro(6L,"Jogos em Android","Queirós, Ricardo","FCA - Editora",true));
        listarlivros.add(new Livro(7L,"Android Essencial com Kotlin","Ricardo R.","NOVATEC",false));


     //   listarlivros.add(l1);
        LivroAdapter livroadapter = new LivroAdapter(listarlivros,this);
        listar_livros.setAdapter(livroadapter);

    }
}