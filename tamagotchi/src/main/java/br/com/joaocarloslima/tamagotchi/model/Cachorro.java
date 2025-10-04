package br.com.joaocarloslima.tamagotchi.model;

public class Cachorro extends Animal{

    public Cachorro(int energia, int fome, int felicidade) {
        super(energia, fome, felicidade);
    }

    @Override
    public void brincar() {
        felicidade.comportamentoIncrementar(15);
        energia.comportamentoDecrementar(10);
        fome.comportamentoIncrementar(10);
    }

    @Override
    public void comer() {

        fome.comportamentoDecrementar(20);
        energia.comportamentoIncrementar(15);

    }

    @Override
    public void dormir() {

        energia.comportamentoIncrementar(15);
        fome.comportamentoIncrementar(10);

    }

    @Override
    public void turno() {

        energia.comportamentoDecrementar(10);
        fome.comportamentoIncrementar(10);
        felicidade.comportamentoDecrementar(5);
    }
}
