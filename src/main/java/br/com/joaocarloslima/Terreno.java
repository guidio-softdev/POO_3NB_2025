package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int xs, int ys) {
        this.x = xs;
        this.y = ys;
    }

    public void plantar(Morango morangos) {
        if (!estaOcupado()) {
            this.morango = morangos;
        }
    }

    public void plantar(Batata batatas) {
        if (!estaOcupado()) {
            this.batata = batatas;
        }
    }

    public void plantar(Cenoura cenouras) {
        if (!estaOcupado()) {
            this.cenoura = cenouras;
        }
    }

    public void colher(Celeiro celeiro) {
        if (this.batata != null && this.batata.podeColher()) {
            celeiro.armazenarBatata();
            batata = null;

        }
        if (this.morango != null && this.morango.podeColher()) {
            celeiro.armazenarMorango();
            morango = null;

        }
        if (this.cenoura != null && this.cenoura.podeColher()) {
            celeiro.armazenarCenoura();
            cenoura = null;

        }
    }

    public boolean estaOcupado() {
        return batata != null || morango != null || cenoura != null;
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
