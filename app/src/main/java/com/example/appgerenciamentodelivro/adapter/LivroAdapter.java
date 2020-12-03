package com.example.appgerenciamentodelivro.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.appgerenciamentodelivro.R;
import com.example.appgerenciamentodelivro.dominio.Livro;

import java.util.List;

public class LivroAdapter extends RecyclerView.Adapter<LivroAdapter.LivroHolder>  {

    private List<Livro> livros;
    private Context context;

    public LivroAdapter(List<Livro> livros, Context context) {
        this.livros = livros;
        this.context = context;
    }


    @Override
    public LivroHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_livro,viewGroup,false);
        LivroHolder livroHolder =  new LivroHolder(view);


        return livroHolder;
    }

    @Override
    public void onBindViewHolder(LivroHolder Holder, int i) {
                Livro livro = livros.get(i);
                Holder.txtTitulo.setText(livro.getTitulo());
                Holder.txtAutor.setText(livro.getAutor());
                Holder.txtEdiota.setText(livro.getEditora());


                if(livro.isEmprestar()) {
                    Holder.ic_livro.setColorFilter(Color.DKGRAY);
                    Holder.status.setText("Emprestado");
                } else {
                    Holder.status.setText("Não Emprestado");
                    Holder.status.setTextColor(Color.BLUE);
                }
    }

    @Override
    public int getItemCount() {
        return livros.size();
    }

    public class LivroHolder extends RecyclerView.ViewHolder implements View.OnClickListener , View.OnLongClickListener {

    public TextView txtTitulo;
    public TextView txtAutor;
    public TextView txtEdiota;
    public ImageView ic_livro;
    public TextView status;

    public  LivroHolder (View view){
        super(view);

        txtTitulo = view.findViewById(R.id.txt_titulo);
        txtAutor = view.findViewById(R.id.txt_autor);
        txtEdiota = view.findViewById(R.id.txt_editora);
        ic_livro = view.findViewById(R.id.ic_livro);
        status = view.findViewById(R.id.txt_verifica);

        view.setOnClickListener(this);
        view.setOnLongClickListener(this);

    }

        @Override
        public void onClick(View view) {

            int pos = getAdapterPosition();
            Toast.makeText(context, "OnClick " + (pos + 1), Toast.LENGTH_SHORT).show();

            }

        @Override
        public boolean onLongClick(View view) {
            int pos = getAdapterPosition();
            Toast.makeText(context, "OnLongClick "+ (pos+1), Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}


