package org.example;

public class Jogador implements Cadastrar{
    public String nome;
    public int idade;
    public int numCamisa;

    public Jogador(String nome, int idade, int numCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void Cadastrar() {
        System.out.println("A jogadora " + nome + " foi cadastrada");
    }


}
