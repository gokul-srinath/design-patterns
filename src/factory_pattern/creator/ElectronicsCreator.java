package factory_pattern.creator;

import factory_pattern.products.Electronics;
import factory_pattern.products.Product;

public class ElectronicsCreator implements FactoryCreator{
    @Override
    public Product factoryCreator() {
        return new Electronics();
    }
}
