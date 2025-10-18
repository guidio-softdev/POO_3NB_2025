package com.example.model;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Jogador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador) {
        Carta carta = monte.virar();
        if (jogador.parou()) {
            return null;
        }
        jogador.receberCarta(carta);
        return carta;
    }
    public boolean acabou(){
        if (jogador.parou() && computador.parou()){
            return true;
        }
        if (jogador.getPontos() >= 21){
            return true;
        }
        if (computador.getPontos() >= 21){
            return true;
        }
        return false;
    }

    public String resultado() {

        if (jogador.getPontos() > 21 && computador.getPontos() > 21) {
            return "Empate (ambos ultrapassaram 21!)";

        } else if (jogador.getPontos() > 21) {
           return "Você perdeu (ultrapassou 21!)";

        } else if (computador.getPontos() > 21) {
            return "Você venceu (computador ultrapassou 21!)";

        } else {

            if (jogador.getPontos() > computador.getPontos()) {
                return "Você venceu (mais próximo de 21!)";
            } else if (computador.getPontos() > jogador.getPontos()) {
                return "Você perdeu (computador mais próximo de 21!)";
            } else {
                return"Empate (pontuação igual!)";
            }
        }

    }

    public Jogador getJogador() {
        return jogador;
    }

    public Jogador getComputador() {
        return computador;
    }
}



