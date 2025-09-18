package br.com.joaocarloslima;

public class Batata {

    private int tamanho = 1;
    private int tempoDeVida = 1;
    private int tempoDeCrescimento = 2;

    public void crescer() {
        tempoDeVida++;

        if (tempoDeVida % tempoDeCrescimento == 0 && tamanho <= 4){
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/batata" + tamanho + ".png";
    }

}
