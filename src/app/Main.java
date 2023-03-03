package app;

public class Main {
    public static void main(String[] args) {

        AppConfigurer appConfigurer = new AppConfigurer();
        OrderApp orderApp = new OrderApp(
                appConfigurer.productRepository(),
                appConfigurer.menu(),
                appConfigurer.cart(),
                appConfigurer.order()
        );
        orderApp.start();
    }
}