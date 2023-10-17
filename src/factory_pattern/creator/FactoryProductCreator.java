package factory_pattern.creator;

import factory_pattern.products.*;

abstract public class FactoryProductCreator implements FactoryCreator{

     final String productName;
    public FactoryProductCreator(String productName) {
        this.productName = productName;
    }

//    @Override
//    public Product factoryCreator() throws IllegalArgumentException{
//        switch (this.productName.toLowerCase()) {
//            case "tv":
//                return new Tv();
//            case "smartphone":
//                return new SmartPhone();
//            case "headphone":
//                return new HeadPhone();
//            case "shirt":
//                return new Shirt();
//            case "pant":
//                return new Pant();
//            case "moisturizer":
//                return new Moisturizer();
//            case "mascara":
//                return new Mascara();
//            default:
//                throw new IllegalArgumentException("Unable to find Product!");
//        }
//    }
}
