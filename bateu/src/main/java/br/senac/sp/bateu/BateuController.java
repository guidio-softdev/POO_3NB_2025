package br.senac.sp.bateu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BateuController {

    // declare e instancie um atribulo do tipo baralho
    // Para subir nop git fiz esse comentário
    private Baralho baralho = new Baralho();
    private int cont = 0;
    
    @GetMapping
    public String index() {
        return "index"; 
    }

    @GetMapping("virar")
    public String virar(Model model) {
        if (baralho.getCartas().isEmpty()) {
             model.addAttribute("msg", "Acabaram as cartas!");
             return "index";
         }

         cont++;
         if (cont > 13) cont = 1;
         model.addAttribute("cont", cont);
         model.addAttribute("carta", baralho.comprar());
        return "index";
    }

    @GetMapping("novo")
    public String novo(Model model) {
         cont = 0;
         baralho = new Baralho();
        return "index";
    }

}
