import Singleton.AutomobileRobot;
import Singleton.Machine;
import abstract_factory_pattern.factories.ModernFactory;
import abstract_factory_pattern.factories.ProductFactory;
import abstract_factory_pattern.products.chair.ChairProduct;
import abstract_factory_pattern.products.sofa.SofaProduct;
//import factory_pattern.creator.*;
//import factory_pattern.products.Product;
//import factory_pattern.products.clothes.Clothing;
//import factory_pattern.products.cosmetics.Cosmetics;
//import factory_pattern.products.electronics.Electronics;

public class Main {

    private static void print(String ...args){

        StringBuilder sb = new StringBuilder();

        for(String s : args) {
            sb.append('\t');
            sb.append(s);
        }

        System.out.println(sb);
        System.out.println("=============");

    }

    public static void main(String[] args) throws IllegalArgumentException{
        Machine automobileMachine = AutomobileRobot.getInstance();




        print("call create:", automobileMachine.create(),"\n","has Instance:", AutomobileRobot.hasInstance() ? "true" : "false");


    }
}