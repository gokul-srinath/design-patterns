package factory_pattern.products.clothes;

import factory_pattern.products.Product;

abstract public class Clothing implements Product {

    public final String getCategory() {
        return "Clothing";
    }
}
