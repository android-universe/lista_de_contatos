package com.example.ducabral.lilstadecontatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaContatoOffline extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contato_offline);


        ArrayList<Contatos> lista = new ArrayList<Contatos>();

        Contatos a = new Contatos(R.drawable.contatos, " Nome Contato A", "Fone Contato A", "Email Contato A");
        Contatos b = new Contatos(R.drawable.contatos, " Nome Contato B", "Fone Contato B", "Email Contato B");
        Contatos c = new Contatos(R.drawable.contatos, " Nome Contato C", "Fone Contato C", "Email Contato C");
        Contatos d = new Contatos(R.drawable.contatos, " Nome Contato D", "Fone Contato D", "Email Contato D");
        Contatos e = new Contatos(R.drawable.contatos, " Nome Contato E", "Fone Contato E", "Email Contato E");
        Contatos f = new Contatos(R.drawable.contatos, " Nome Contato F", "Fone Contato F", "Email Contato F");
        Contatos g = new Contatos(R.drawable.contatos, " Nome Contato G", "Fone Contato G", "Email Contato G");

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);

        ListaAdapterContato adapterContato = new ListaAdapterContato(this, lista);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapterContato);

    }

    public void addContato(View view){
        Intent intent = new Intent(this, AdicionarContato.class);
            startActivity(intent);

    }

}
