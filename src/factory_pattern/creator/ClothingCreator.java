package factory_pattern.creator;

import factory_pattern.products.clothes.Pant;
import factory_pattern.products.Product;
import factory_pattern.products.clothes.Shirt;

public class ClothingCreator implements FactoryCreator{


    @Override
    public Product factoryCreator(String productName) throws IllegalArgumentException{
        switch (productName) {
            case "shirt":
                return new Shirt();
            case "pant":
                return new Pant();
            default:
                throw new IllegalArgumentException("Unable to find Clothing product!");
        }
    }


}
