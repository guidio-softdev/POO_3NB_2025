package br.com.joaocarloslima.tamagotchi.model;

public abstract class Animal {

    Atributo energia;
    Atributo fome;
    Atributo felicidade;

    public Animal(int energia, int fome, int felicidade) {
        this.energia = new Atributo(energia);
        this.fome = new Atributo(fome);
        this.felicidade = new Atributo(felicidade);

    }

    public abstract void brincar();

    public abstract void comer();

    public abstract void dormir();

    public abstract void turno();

    public int getEnergia() {
        return energia.getAtual();
    }

    public int getFome() {
        return fome.getAtual();
    }

    public int getFelicidade() {
        return felicidade.getAtual();
    }
}
