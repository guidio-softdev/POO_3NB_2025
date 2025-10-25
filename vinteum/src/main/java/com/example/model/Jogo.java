package com.example.model;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

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

    public boolean acabou() {
        var jogadorEstourou = jogador.getPontos() > 21;
        var computadorEstourou = computador.getPontos() > 21;
        var osDoisPararam = jogador.parou() && computador.parou();

        return osDoisPararam || jogadorEstourou || computadorEstourou;
    }

    public String resultado() {
        if (jogador.getPontos() == computador.getPontos() || (jogador.getPontos() > 21 && computador.getPontos() > 21)) {
            return "Empate";
        }
        if ((jogador.getPontos() > computador.getPontos() && jogador.getPontos() <=21) || computador.getPontos() > 21){
            return "Venceu!";
        }
        return "Perdeu";
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Jogador getComputador() {
        return computador;
    }
}



