package factory_pattern.creator;

import factory_pattern.products.*;
import factory_pattern.products.cosmetics.Mascara;
import factory_pattern.products.cosmetics.Moisturizer;

public class CosmeticsCreator implements FactoryCreator{


    @Override
    public Product factoryCreator(String productName) throws IllegalArgumentException{
        switch (productName.toLowerCase()) {
            case "mascara":
                return new Mascara();
            case "moisturizer":
                return new Moisturizer();
            default:
                throw new IllegalArgumentException("Unable to find Cosmetic product!");
        }
    }
}
