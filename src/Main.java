import factory_pattern.creator.CosmeticsCreator;
import factory_pattern.creator.ElectronicsCreator;
import factory_pattern.creator.FactoryCreator;
import factory_pattern.creator.FactoryProductCreator;
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

        FactoryCreator tvFactory = new FactoryProductCreator("tv");
        Product tv = tvFactory.factoryCreator();

        print(tv.getName(),tv.getDescription());

        FactoryCreator mascaraFactory = new FactoryProductCreator("mascara");
        Product mascara = mascaraFactory.factoryCreator();

        print(mascara.getName(),mascara.getDescription());

    }
}