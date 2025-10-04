package br.com.joaocarloslima.tamagotchi.service;

import org.springframework.stereotype.Service;

import br.com.joaocarloslima.tamagotchi.model.Animal;
import br.com.joaocarloslima.tamagotchi.model.Cachorro;
import br.com.joaocarloslima.tamagotchi.model.Dragao;
import br.com.joaocarloslima.tamagotchi.model.Gato;

@Service
public class TamagotchiService {

    private Animal gato = new Gato(100, 0, 50);
    private Animal cachorro = new Cachorro(100, 0, 50);
    private Animal dragao = new Dragao(100, 0, 50);

    public Animal getGato() {
         return gato;
     }

     public Animal getCachorro() {
         return cachorro;
     }

     public Animal getDragao() {
         return dragao;
     }
    
}
