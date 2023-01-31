package view;
import entities.*;
import controller.*;
import java.util.ArrayList;

public class StockView {
    public static void printTrees(ArrayList<Tree> trees){
        for(Tree t : trees){
            System.out.println(t.toString());
        }
    }
    public static void printTreesQuantity(ArrayList<Tree> trees){
        System.out.println("Hay "+trees.stream().count()+" arboles en stock");
    }
    public static void printFlowers(ArrayList<Flower> flowers){
        for(Flower f : flowers){
            System.out.println(f.toString());
        }
    }
    public static void printFlowersQuantity(ArrayList<Flower> flowers){
        System.out.println("Hay "+flowers.stream().count()+" flores en stock");
    }
    public static void printDecor(ArrayList<Decor> decors){
        for(Decor d : decors){
            System.out.println(d.toString());
        }
    }
    public static void printDecorQuantity(ArrayList<Decor> decors){
        System.out.println("Hay "+decors.stream().count()+" decoraciones en stock");
    }
    public static void totalValue(Float value){
        System.out.println("El valor total del stock es "+value);
    }
}
