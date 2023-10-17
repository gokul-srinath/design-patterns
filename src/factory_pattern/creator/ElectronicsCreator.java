package factory_pattern.creator;

import factory_pattern.products.*;
import factory_pattern.products.electronics.HeadPhone;
import factory_pattern.products.electronics.SmartPhone;
import factory_pattern.products.electronics.Tv;

public class ElectronicsCreator implements FactoryCreator{


    @Override
    public Product factoryCreator(String productName) throws IllegalArgumentException{
        switch (productName) {
            case "tv":
                return new Tv();
            case "smartphone":
                return new SmartPhone();
            case "headphone":
                return new HeadPhone();
            default:
                throw new IllegalArgumentException("Unable to find Electronic product!");
        }
    }


}
