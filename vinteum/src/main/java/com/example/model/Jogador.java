package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;

    public void receberCarta(Carta carta) {
        if (!parou) {
            cartas.add(carta);
            pontos += carta.numero();
        }
    }

    public void parar() {
        parou = true;
    }

    public boolean parou() {
        return parou;
    }

    public int getPontos() {
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
