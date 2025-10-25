package com.example.model;

import java.util.Random;

public class Computador extends Jogador{

    private EstrategiaDeParada estrategia;

    public Computador() {
        this.estrategia = Math.random() < 0.5?
                new EstrategiaAgressiva():
                new EstrategiaCautelosa();
    }

    @Override
    public boolean parou() {
        return estrategia.deveParar(this);
    }

    public EstrategiaDeParada getEstrategia() {
        return estrategia;
    }
}
