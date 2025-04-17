package org.test;

import org.example.Campeonato;
import org.example.Jogador;
import org.example.Partida;
import org.example.Time;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
class SistemaFutebolTest {

    @Test
    void deveRegistrarTimeCorretamente() {
        List<Jogador> jogadores = Arrays.asList(
                new Jogador("Cássio", 38, 12),
                new Jogador("Fagner", 37, 23)
        );

        Time corinthians = new Time("Corinthians", "SP", jogadores, 30);
        assertEquals("Corinthians", corinthians.getNome());
        assertEquals("SP", corinthians.getCidade());
        assertEquals(30, corinthians.getPontuacao());

    }

    @Test
    void deveRegistrarJogadorCorretamente() {
        Jogador jogador = new Jogador("Róger Guedes", 28, 9);

        assertEquals("Róger Guedes", jogador.getNome());
        assertEquals(28, jogador.getIdade());
        assertEquals(9, jogador.getNumCamisa());
    }

    @Test
    void deveVisualizarCampeonatoOrdenadoPorPontos() {
        Time timeA = new Time("Time A", "RJ", Arrays.asList(), 20);
        Time timeB = new Time("Time B", "SP", Arrays.asList(), 35);
        Time timeC = new Time("Time C", "MG", Arrays.asList(), 15);

        Partida partida1 = new Partida(timeA, timeB, 1, 2);
        Partida partida2 = new Partida(timeB, timeC, 3, 0);
        Partida partida3 = new Partida(timeC, timeA, 1, 1);

        Campeonato campeonato = new Campeonato(Arrays.asList(partida1, partida2, partida3));

        System.out.println("Times ordenados por pontuação:");
                campeonato.Visualizar(); // você pode modificar para retornar a lista ordenada se quiser testar com assert
    }
}
