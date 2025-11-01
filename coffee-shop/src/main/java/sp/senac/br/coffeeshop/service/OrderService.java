package sp.senac.br.coffeeshop.service;

import org.springframework.stereotype.Service;
import sp.senac.br.coffeeshop.model.Chantilly;
import sp.senac.br.coffeeshop.model.Milk;
import sp.senac.br.coffeeshop.model.SimpleCoffee;
import sp.senac.br.coffeeshop.model.Coffee;


import java.util.HashSet;
import java.util.Set;

@Service
public class OrderService {
    private final Set<Coffee> orderItems = new HashSet<>();

    public void addProductToOrder(Coffee product) {
        orderItems.add(product);
    }

    public void removeProductFromOrder(Coffee product) {
        orderItems.remove(product);
    }

    public Coffee getOrder() {
        if (orderItems.isEmpty()){
            return getEmptyOrderPlaceholder();
        }
        // 2. Instanciar o café base
        Coffee coffee = new SimpleCoffee();

        // 3. Aplicar cada decorador sobre o café
        // Percorra a lista de itens do pedido e para cada decorador, "envolva" o café atual
        // Exemplo:
        //if (item instanceof Milk) coffee = new Milk(coffee);

        for (Coffee decoradores : orderItems){
            if (decoradores instanceof Milk) coffee = new Milk(coffee);
            if (decoradores instanceof  Chantilly) coffee = new Chantilly(coffee);
        }

        // 4. Retornar o café decorado
        return coffee;
    }

    private Coffee getEmptyOrderPlaceholder() {
        return new Coffee() {
            @Override
            public String getName() {
                return "nenhum produto adicionado";
            }

            @Override
            public String getImageUrl() {
                return "placeholder";
            }

            @Override
            public String getDescription() {
                return "adicione produtos ao pedido";
            }

            @Override
            public Double getPrice() {
                return 0.0;
            }
        };
    }

}
