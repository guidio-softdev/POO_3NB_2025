package sp.senac.br.coffeeshop.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.card.Card;
import com.vaadin.flow.component.card.CardVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import sp.senac.br.coffeeshop.infra.AddHandler;
import sp.senac.br.coffeeshop.infra.RemoveHandler;
import sp.senac.br.coffeeshop.model.Coffee;


public class CoffeeCard extends Card {
    public CoffeeCard(Coffee coffee) {
        this(coffee, null, null);
    }

    public CoffeeCard(Coffee coffee, AddHandler addHandler, RemoveHandler removeHandler) {
        setTitle(coffee.getName());
        Span description = new Span(coffee.getDescription());
        add(description);

        Image image = new Image("/" + coffee.getImageUrl() + ".png", coffee.getName());
        image.setWidth("400px");
        setMedia(image);
        addThemeVariants(CardVariant.LUMO_STRETCH_MEDIA);

        var price = new Span("R$ " + coffee.getPrice());
        price.getElement().getThemeList().add("badge success");
        setHeaderSuffix(price);

        setWidth("400px");


        if (addHandler != null) {

            Button addButton = new Button("Adicionar", VaadinIcon.PLUS.create());
            addButton.addClickListener(e -> addHandler.onAdd());
            addToFooter(addButton);

            Button deleteButton = new Button("Remover", VaadinIcon.TRASH.create());
            deleteButton.addClickListener(e -> removeHandler.onRemove());
            addToFooter(deleteButton);

        }

    }
}
