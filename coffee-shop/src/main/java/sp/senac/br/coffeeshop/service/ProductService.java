package sp.senac.br.coffeeshop.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sp.senac.br.coffeeshop.model.Chantilly;
import sp.senac.br.coffeeshop.model.Coffee;
import sp.senac.br.coffeeshop.model.Milk;
import sp.senac.br.coffeeshop.model.SimpleCoffee;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final List<Coffee> products = new ArrayList<>();

    @PostConstruct
    public void init(){

        products.addAll(List.of(
                new SimpleCoffee(),
                new Chantilly(null),
                new Milk(null)
        ));
    }

    public List<Coffee> getAllProducts(){
        return products;
    }

}
