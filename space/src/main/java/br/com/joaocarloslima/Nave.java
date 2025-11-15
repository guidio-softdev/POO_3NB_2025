package br.com.joaocarloslima;

public class Nave extends Asset{

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }
    public Tiro atirar(int poder){
        return new Tiro(this.getX(),this.getY(),10,Direcao.CIMA,poder);
    }

    @Override
    public void mover (){
        if (this.direcao == Direcao.ESQUERDA) this.setX(this.getX()-velocidade);
        if (this.direcao == Direcao.DIREITA) this.setX(this.getX()+velocidade);
        if (this.getX() < 0) this.setX(0);
        if (this.getX() > 640-50) this.setX(640-50);
    }
}