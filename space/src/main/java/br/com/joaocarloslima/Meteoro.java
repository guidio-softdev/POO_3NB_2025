package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

import java.util.Random;

public class Meteoro extends Asset{

    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        this.tamanho = new Random().nextInt(8)+1;
        this.poder = tamanho;
        String path = "images/meteoro/meteoro" + tamanho + ".png";
        this.imagem = new ImageView(App.class.getResource(path).toString());
    }

    public void tomarTiro (Tiro tiro){
        this.poder = this.poder - tiro.getPoder();
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPoder() {
        return poder;
    }
}
