package br.senac.sp.bateu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private List<Carta> cartas;

    public Baralho (){

        cartas = new ArrayList<>();
        //

        for (int i = 1; i <= 13; i++){
            cartas.add(new Carta(i, Naipe.COPAS));
        }
        for (int i = 1; i <= 13; i++){
            cartas.add(new Carta(i, Naipe.ESPADAS));
        }
        for (int i = 1; i <= 13; i++){
            cartas.add(new Carta(i, Naipe.PAUS));
        }
        for (int i = 1; i <= 13; i++){
            cartas.add(new Carta(i, Naipe.OUROS));
        }

        embaralhar();
    }

    public Carta comprar (){
        return cartas.remove(0);

    }

    public void embaralhar (){
        Collections.shuffle(cartas);
    }

    public List<Carta> getCartas() {
        return new ArrayList<>(cartas);
    }
}
