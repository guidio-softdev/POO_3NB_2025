package com.example.model;

public class EstrategiaAgressiva implements EstrategiaDeParada {

    @Override
    public boolean deveParar(Jogador computador) {
        return computador.getPontos() >= 19;
    }

}
