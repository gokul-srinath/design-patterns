package factory_pattern.products.cosmetics;

import factory_pattern.products.Product;

abstract public class Cosmetics implements Product {

    public final String getCategory() {
        return "Cosmetics";
    }
}
