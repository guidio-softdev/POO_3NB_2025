package br.com.joaocarloslima.tamagotchi.model;

public class Gato extends Animal{

    public Gato(int energia, int fome, int felicidade) {
        super(energia, fome, felicidade);
    }

    @Override
    public void brincar() {
        felicidade.comportamentoIncrementar(10);
        energia.comportamentoDecrementar(5);
        fome.comportamentoIncrementar(5);
    }

    @Override
    public void comer() {

        fome.comportamentoDecrementar(15);
        energia.comportamentoIncrementar(10);

    }

    @Override
    public void dormir() {

        energia.comportamentoIncrementar(20);
        fome.comportamentoIncrementar(5);

    }

    @Override
    public void turno() {

        energia.comportamentoDecrementar(5);
        fome.comportamentoIncrementar(5);
        felicidade.comportamentoDecrementar(3);
    }
}
