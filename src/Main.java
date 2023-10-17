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
        FactoryCreator electronicsCreator = new ElectronicsCreator();
        FactoryCreator cosmeticCreator = new CosmeticsCreator();
        FactoryCreator clothingCreator = new ClothingCreator();

        Electronics tv = (Electronics) electronicsCreator.factoryCreator("tv");
        Electronics smartphone = (Electronics) electronicsCreator.factoryCreator("smartphone");

        Cosmetics mascara = (Cosmetics)  cosmeticCreator.factoryCreator("mascara");
        Cosmetics moisturizer = (Cosmetics)  cosmeticCreator.factoryCreator("moisturizer");

        Clothing pant = (Clothing)  clothingCreator.factoryCreator("pant");
//        Clothing suits = (Clothing)  clothingCreator.factoryCreator("suits");

        print("\n","Category:",tv.getCategory(),"\n","Name:",tv.getName(),"\n","Description:",tv.getDescription());
        print("\n","Category:",smartphone.getCategory(),"\n","Name:",smartphone.getName(),"\n","Description:",smartphone.getDescription());

        print("\n","Category:",mascara.getCategory(),"\n","Name:",mascara.getName(),"\n","Description:",mascara.getDescription());
        print("\n","Category:",moisturizer.getCategory(),"\n","Name:",moisturizer.getName(),"\n","Description:",moisturizer.getDescription());

        print("\n","Category:",pant.getCategory(),"\n","Name:",pant.getName(),"\n","Description:",pant.getDescription());
//        print("\n","Category:",suits.getCategory(),"\n","Name:",suits.getName(),"\n","Description:",suits.getDescription());
    }
}