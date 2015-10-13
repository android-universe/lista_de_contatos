package com.example.ducabral.lilstadecontatos;

/**
 * Created by Eduardo on 12/10/2015.
 */
public class Contatos {

    private int imagem;
    private String nome;
    private String fone;
    private String email;


    public Contatos() {
    }

    public Contatos(int imagem, String nome, String fone, String email) {
        this.imagem = imagem;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getFone() {

        return fone;
    }

    public void setFone(String fone) {

        this.fone = fone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
