package factory_pattern.creator;

import factory_pattern.products.Cosmetics;
import factory_pattern.products.Product;

public class CosmeticsCreator implements FactoryCreator{
    @Override
    public Product factoryCreator() {
        return new Cosmetics();
    }
}
