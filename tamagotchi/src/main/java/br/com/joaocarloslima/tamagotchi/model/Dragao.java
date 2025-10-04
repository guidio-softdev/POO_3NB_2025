package br.com.joaocarloslima.tamagotchi.model;

public class Dragao extends Animal {

    public Dragao(int energia, int fome, int felicidade) {
        super(energia, fome, felicidade);
    }

    @Override
    public void brincar() {

        felicidade.comportamentoIncrementar(12);
        energia.comportamentoDecrementar(15);
        fome.comportamentoIncrementar(15);

    }

    @Override
    public void comer() {

        fome.comportamentoDecrementar(30);
        energia.comportamentoIncrementar(20);

    }

    @Override
    public void dormir() {

        energia.comportamentoIncrementar(10);
        fome.comportamentoIncrementar(10);

    }

    @Override
    public void turno() {

        energia.comportamentoDecrementar(15);
        fome.comportamentoIncrementar(10);
        felicidade.comportamentoDecrementar(7);
    }
}
