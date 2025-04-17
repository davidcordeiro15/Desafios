package org.example;

public class Partida implements Registrar{
    public Time time1;
    public Time time2;
    public int golsTime1;
    public int golsTime2;

    public Partida(Time time1, Time time2, int golsTime1, int golsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    @Override
    public void Registrar() {
        System.out.println("A partida entre  " + time1.getNome() + " e " + time2.getNome() + " foi registrada, com o placar de " + golsTime1 + " X " + golsTime2);
    }
}
