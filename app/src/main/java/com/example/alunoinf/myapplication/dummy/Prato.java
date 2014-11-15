package com.example.alunoinf.myapplication.dummy;

/**
 * Created by alunoinf on 11/11/2014.
 */
public class Prato {

    private String nome;
    private double preco;
    private String descricaoPrato;
    private int image;


    public Prato(String nome, String descricaoPrato, double preco, int image) {
        this.nome = nome;
        this.preco = preco;
        this.descricaoPrato = descricaoPrato;
        this.image = image;
    }

    public String getDescricaoPrato() {
        return descricaoPrato;
    }

    public void setDescricaoPrato(String descricaoPrato) {
        this.descricaoPrato = descricaoPrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}