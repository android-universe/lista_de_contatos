package com.example.ducabral.lilstadecontatos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eduardo on 12/10/2015.
 */
public class ListaAdapterContato extends ArrayAdapter<Contatos> {

    private Context context;
    private ArrayList<Contatos> lista;



    public void ListaAdapterContato() {

    }

    public ListaAdapterContato(Context context, ArrayList<Contatos> lista) {
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contatos contatosPosicao = this.lista.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.fragment_contato_offline,null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        imageView.setImageResource(contatosPosicao.getImagem());

        TextView textViewNome = (TextView) convertView.findViewById(R.id.nomeCont);
        textViewNome.setText(contatosPosicao.getNome());

        TextView textViewFone = (TextView) convertView.findViewById(R.id.foneCont);
        textViewFone.setText(contatosPosicao.getFone());

        TextView textViewEmail = (TextView) convertView.findViewById(R.id.emailCont);
        textViewEmail.setText(contatosPosicao.getEmail());

        return convertView;

    }

    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Contatos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Contatos> lista) {
        this.lista = lista;
    }
}
