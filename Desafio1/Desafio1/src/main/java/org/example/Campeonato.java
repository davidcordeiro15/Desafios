package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Campeonato implements Visualizar{
    public List<Partida> partidas;

    public Campeonato(List<Partida> partidas) {
        this.partidas = partidas;
    }

    @Override
    public void Visualizar() {
        List<Time> times = partidas.stream()
                .flatMap(p -> Stream.of(p.getTime1(), p.getTime2()))
                .distinct()
                .sorted(Comparator.comparingInt(Time::getPontuacao).reversed())
                .toList();


        System.out.println("===== Classificação =====");
        times.forEach(t -> System.out.printf("%-20s %3d pontos%n", t.getNome(), t.getPontuacao()));
    }
}
