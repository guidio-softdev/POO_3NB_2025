package sp.senac.br.coffeeshop.model;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        if (coffee == null) return "Leite";
        return coffee.getName() +", com Leite";
    }

    @Override
    public String getImageUrl() {
        if (coffee == null) return "milk";
        return coffee.getImageUrl()+"-milk";
    }

    @Override
    public String getDescription() {
        if (coffee == null) return "Delicioso Leite";
        return coffee.getDescription() +",com Delicioso leite";
    }

    @Override
    public Double getPrice() {
        if (coffee == null) return 2.0;
        return coffee.getPrice() + 2.0;
    }
}
