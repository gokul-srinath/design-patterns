package factory_pattern.creator;

import factory_pattern.products.Clothing;
import factory_pattern.products.Product;

public class ClothingCreator implements FactoryCreator{
    @Override
    public Product factoryCreator() {
        return new Clothing();
    }
}
