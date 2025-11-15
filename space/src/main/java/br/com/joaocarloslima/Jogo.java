package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {

    protected List<Asset> assets = new ArrayList<>();
    protected Nave nave = new Nave(280,400,10,Direcao.DIREITA);
    private int pontos;
    private int nivel = 1;

    public Tiro atirar(){
        Tiro littlePiu = nave.atirar(nivel);
        assets.add(littlePiu);
        return littlePiu;
    }

    public Meteoro criarMeteoro (){
        Meteoro litteRock = new Meteoro(new Random().nextInt(641-50), 0, 5, Direcao.BAIXO);
        assets.add(litteRock);
        return  litteRock;
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void pontuar(){
        pontos++;
        if (pontos % 10 == 0 && nivel < 4) nivel++;
    }
}
