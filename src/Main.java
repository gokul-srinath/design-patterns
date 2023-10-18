import abstract_factory_pattern.factories.ModernFactory;
import abstract_factory_pattern.factories.ProductFactory;
import abstract_factory_pattern.products.chair.ChairProduct;
import abstract_factory_pattern.products.sofa.SofaProduct;
import factory_pattern.creator.*;
import factory_pattern.products.Product;
import factory_pattern.products.clothes.Clothing;
import factory_pattern.products.cosmetics.Cosmetics;
import factory_pattern.products.electronics.Electronics;

public class Main {

    private static void print(String ...args){

        StringBuilder sb = new StringBuilder();

        for(String s : args) {
            sb.append(s);
            sb.append('\t');
        }

        System.out.println(sb);
        System.out.println("=============");

    }

    public static void main(String[] args) throws IllegalArgumentException{
        ProductFactory modernFactory = new ModernFactory();

        ChairProduct chair = modernFactory.createChair();
        SofaProduct sofa = modernFactory.createSofa();


        print("\t","chair:", chair.getType(),"\n","has Cushion", chair.hasCushion() ? "true" : "false");
        print("\t","sofa:", sofa.getType(),"\n","has Leather", sofa.hasLeather() ? "true" : "false");

    }
}