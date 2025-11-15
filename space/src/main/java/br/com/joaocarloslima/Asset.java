package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public abstract class Asset {

    private int x;
    private int y;
    ImageView imagem;
    int velocidade;
    Direcao direcao;

    public Asset(int x, int y, int velocidade, Direcao direcao) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.direcao = direcao;
    }

    public void mover (){
        if (this.direcao == Direcao.CIMA) y = y - velocidade;
        if (this.direcao == Direcao.BAIXO) y = y + velocidade;
        if (this.direcao == Direcao.ESQUERDA) x = x - velocidade;
        if (this.direcao == Direcao.DIREITA) x = x + velocidade;
    }

    public boolean colidiuCom(Asset asset){
        return x < asset.getX() + 50 &&
                x + 50 > asset.getX() &&
                y < asset.getY() + 50 &&
                y + 50 > asset.getY();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Direcao getDirecao() {
        return direcao;
    }
}
