import factory_pattern.creator.CosmeticsCreator;
import factory_pattern.creator.ElectronicsCreator;
import factory_pattern.creator.FactoryCreator;
import factory_pattern.products.Product;

public class Main {

    private static void print(String ...args){

        StringBuilder sb = new StringBuilder();

        for(String s : args) {
            sb.append(s);
            sb.append('\t');
        }

        System.out.println(sb);

    }

    public static void main(String[] args) {
        FactoryCreator electronicsCreator = new ElectronicsCreator();
        Product electronics = electronicsCreator.factoryCreator();

        print(electronics.getName(),electronics.getDescription());

        FactoryCreator cosmeticsCreator = new CosmeticsCreator();
        Product cosmetics = cosmeticsCreator.factoryCreator();

        print(cosmetics.getName(),cosmetics.getDescription());

    }
}