package org.example;

import java.util.List;

public class Time implements Cadastrar{
    public String nome;
    public String cidade;
    public List<Jogador> jogadoras;
    public int pontuacao;

    public Time(String nome, String cidade, List<Jogador> jogadoras, int pontuacao) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadoras = jogadoras;
        this.pontuacao = pontuacao;
    }

    public List<Jogador> getJogadoras() {
        return jogadoras;
    }

    public void setJogadoras(List<Jogador> jogadoras) {
        this.jogadoras = jogadoras;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }



    @Override
    public void Cadastrar() {
        System.out.println("O time " + nome + " foi cadastrado!");
    }
}
