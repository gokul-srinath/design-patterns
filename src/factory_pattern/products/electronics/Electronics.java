package factory_pattern.products.electronics;

import factory_pattern.products.Product;

abstract public class Electronics implements Product {
    public final String getCategory() {
        return "Electronics";
    }
}
