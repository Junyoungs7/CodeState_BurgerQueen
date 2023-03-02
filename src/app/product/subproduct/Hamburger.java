package app.product.subproduct;

import app.product.Product;

public class Hamburger extends Product {

    private boolean isBurgerSet;
    private int burgerSetPrice;

    public Hamburger(int id, String name, int price, int kcal, boolean isBurgerSet, int burgerSetPrice) {
        super(id, name, price, kcal);
        this.burgerSetPrice = burgerSetPrice;
        this.isBurgerSet = isBurgerSet;
    }

    public Hamburger(Hamburger hamburger){
        super(hamburger.getName(), hamburger.getPrice(), hamburger.getKcal());
        this.isBurgerSet = hamburger.isBurgerSet();
        this.burgerSetPrice = hamburger.getBurgerSetPrice();
    }

    public boolean isBurgerSet() {
        return isBurgerSet;
    }

    public int getBurgerSetPrice() {
        return burgerSetPrice;
    }

    public void setBurgerSet(boolean burgerSet) {
        isBurgerSet = burgerSet;
    }

    public void setBurgerSetPrice(int burgerSetPrice) {
        this.burgerSetPrice = burgerSetPrice;
    }
}
