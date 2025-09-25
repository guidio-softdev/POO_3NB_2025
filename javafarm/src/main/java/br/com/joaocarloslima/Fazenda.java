package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    private List<Terreno> terrenos = new ArrayList<>();
    private Celeiro celeiro = new Celeiro();

    public Fazenda() {
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public void plantarCenoura(int x, int y) {

        if (celeiro.getQtdeCenouras() != 0) {
            Terreno terreno = getTerreno(x, y);
            if (terreno.estaOcupado()) {
                throw new RuntimeException("Este terreno já está ocupado!");
            }
            terreno.plantar(new Cenoura());
            celeiro.consumirCenoura();
        }
    }

    public void plantarBatata(int x, int y) {
        if (celeiro.getQtdeBatatas() != 0) {
            Terreno terreno = getTerreno(x, y);
            if (terreno.estaOcupado()) {
                throw new RuntimeException("Este terreno já está ocupado!");
            }
            terreno.plantar(new Batata());
            celeiro.consumirBatata();
        }
    }

    public void plantarMorango(int x, int y) {
        if (celeiro.getQtdeMorangos() != 0) {
            Terreno terreno = getTerreno(x, y);
            if (terreno.estaOcupado()) {
                throw new RuntimeException("Este terreno já está ocupado!");
            }
            terreno.plantar(new Morango());
            celeiro.consumirMorango();
        }
    }


    public Terreno getTerreno(int x, int y) {
        for (Terreno terreno : terrenos) {
            if (terreno.getX() == x && terreno.getY() == y) {
                return terreno;
            }
        }
        return null;
    }
    public void colher(int x,int y){
        Terreno terreno = getTerreno(x, y);
        terreno.colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}



