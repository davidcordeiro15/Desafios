package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Jogador> jogadoresCorinthians = Arrays.asList(
                new Jogador("Letícia", 38, 12),
                new Jogador("Tamires", 37, 23),
                new Jogador("Erika", 40, 3),
                new Jogador("Giovanna Campiolo", 25, 4),
                new Jogador("Diany", 23, 6),
                new Jogador("Gabi Zanotti", 37, 8),
                new Jogador("Adriana", 28, 9),
                new Jogador("Jaqueline", 26, 7),
                new Jogador("Ingryd", 33, 10),
                new Jogador("Yasmim", 28, 5)
        );

        List<Jogador> jogadoresPalmeiras = Arrays.asList(
                new Jogador("Amanda", 36, 21),
                new Jogador("Agustina", 30, 15),
                new Jogador("Thais", 27, 26),
                new Jogador("Bruna Calderan", 31, 12),
                new Jogador("Katherine", 25, 22),
                new Jogador("Julia Bianchi", 30, 8),
                new Jogador("Bia Zaneratto", 29, 23),
                new Jogador("Byanca Brasil", 28, 10),
                new Jogador("Camilinha", 18, 9),
                new Jogador("Duda Santos", 32, 7)
        );

        List<Jogador> jogadoresSaoPaulo = Arrays.asList(
                new Jogador("Carla", 34, 23),
                new Jogador("Lauren", 32, 5),
                new Jogador("Giovanna", 25, 4),
                new Jogador("Karla Alves", 26, 6),
                new Jogador("Rafaela", 30, 12),
                new Jogador("Mirim", 22, 29),
                new Jogador("Isa", 31, 11),
                new Jogador("Carol", 30, 9),
                new Jogador("Aline Milene", 28, 8),
                new Jogador("Naná", 32, 10)
        );

        List<Jogador> jogadoresSantos = Arrays.asList(
                new Jogador("Camila", 28, 1),
                new Jogador("Day Silva", 24, 2),
                new Jogador("Giovanna Rocha", 29, 13),
                new Jogador("Fernanda", 30, 16),
                new Jogador("Thaisinha", 31, 5),
                new Jogador("Ketlen", 25, 8),
                new Jogador("Cristiane", 26, 10),
                new Jogador("Rhayanne", 21, 9),
                new Jogador("Brena", 27, 30),
                new Jogador("Jane Tavares", 30, 11)
        );

        Time corinthians = new Time("Corinthians", "SP", jogadoresCorinthians, 6);
        Time palmeiras = new Time("Palmeiras", "SP", jogadoresPalmeiras, 3);
        Time saoPaulo = new Time("São Paulo", "SP", jogadoresSaoPaulo, 3);
        Time santos = new Time("Santos", "SP", jogadoresSantos, 0);

        corinthians.Cadastrar();
        palmeiras.Cadastrar();
        saoPaulo.Cadastrar();
        santos.Cadastrar();


        Partida partida1 = new Partida(corinthians, palmeiras, 2, 2);
        Partida partida2 = new Partida(saoPaulo, santos, 3, 1);
        Partida partida3 = new Partida(corinthians, saoPaulo, 1, 0);
        Partida partida4 = new Partida(palmeiras, santos, 4, 2);

        partida1.Registrar();
        partida2.Registrar();
        partida3.Registrar();
        partida4.Registrar();


        List<Partida> partidas = Arrays.asList(partida1, partida2, partida3, partida4);
        Campeonato campeonato = new Campeonato(partidas);

        campeonato.Visualizar();

    }
}