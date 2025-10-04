package br.com.joaocarloslima.tamagotchi.model;

public class Atributo {

    int atual;

    public Atributo(int atual) {
        this.atual = atual;
    }

    public int comportamentoIncrementar (int entrada){
        if(atual < 100) return atual += entrada;
        return atual = 100;
    }

    public int comportamentoDecrementar (int entrada){
        if(atual > 0) return atual -= entrada;
        return atual = 0;
    }

    public int getAtual() {
        return atual;
    }
}
