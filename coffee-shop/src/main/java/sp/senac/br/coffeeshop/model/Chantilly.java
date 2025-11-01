package sp.senac.br.coffeeshop.model;

public class Chantilly extends CoffeeDecorator{

    public Chantilly(Coffee coffee) {
        super(coffee);
    }


    @Override
    public String getName() {
        if (coffee == null) return "Chantilly";
        return coffee.getName() +", com Chantilly";
    }

    @Override
    public String getImageUrl() {
        if (coffee == null) return "chantilly";
        return coffee.getImageUrl()+"-chantilly";
    }

    @Override
    public String getDescription() {
        if (coffee == null) return "Delicioso chantilly";
        return coffee.getDescription() +",com Delicioso chantilly";
    }

    @Override
    public Double getPrice() {
        if (coffee == null) return 2.5;
        return coffee.getPrice() + 2.5;
    }
}
