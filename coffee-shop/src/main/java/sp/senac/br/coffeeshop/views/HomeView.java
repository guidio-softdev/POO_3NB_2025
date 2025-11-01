package sp.senac.br.coffeeshop.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import sp.senac.br.coffeeshop.model.Coffee;
import sp.senac.br.coffeeshop.service.OrderService;
import sp.senac.br.coffeeshop.service.ProductService;

@Route("")
public class HomeView extends VerticalLayout {
    private final HorizontalLayout productContent = new HorizontalLayout();
    private final VerticalLayout orderContent = new VerticalLayout();
    private final OrderService orderService;

    public HomeView(ProductService productService, OrderService orderService) {
        this.orderService = orderService;
        configureLayout();
        add(new H1("Coffee Shop"));
        add(productContent);
        add(orderContent);
        productService.getAllProducts().forEach(this::addProduct);
        showOrder();
    }

    private void showOrder() {
        orderContent.removeAll();
        orderContent.add(new H2("Seu Pedido"));
        var coffee = orderService.getOrder();
        orderContent.add(new CoffeeCard(coffee));
    }

    private void configureLayout() {
        productContent.setAlignItems(Alignment.CENTER);
        orderContent.setAlignItems(Alignment.CENTER);
        orderContent.setSizeFull();
        setSizeFull();
    }

    private void addProduct(Coffee coffee) {
        productContent.add(new CoffeeCard(coffee, () -> {
            orderService.addProductToOrder(coffee);
            showOrder();
        }, () -> {
            orderService.removeProductFromOrder(coffee);
            showOrder();
        }));

    }
}
