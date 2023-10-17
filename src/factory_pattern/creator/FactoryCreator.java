package factory_pattern.creator;

import factory_pattern.products.Product;

public interface FactoryCreator {
    Product factoryCreator(String productName);
}
