package controller;
import entities.Flower;
import model.*;
import entities.Tree;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeHandler {
    private ArrayList<Tree> trees = new ArrayList<>();

    public ArrayList<Tree> getTrees() {
        return trees;
    }
    public void setTrees(ArrayList<Tree> trees) {
        this.trees = trees;
    }
    @Override
    public String toString() {
        return "TreeHandler{" +
                "trees=" + trees +
                '}';
    }
    public void createPino(){
        Tree inputTree = new Tree("Pino", 25, 200);
        trees.add(inputTree);
        System.out.println("Añadido correctamente");
    }
    public  void removePino(){
        if(!trees.isEmpty()){
            trees.remove(0);
            System.out.println("Eliminado!");
        }
    }
    public float totalPrice(){
        float total = 0;
        for(Tree t : trees){
            total += t.getPrice();
        }
        return total;
    }
    public boolean treeSell(int t){
        if(t<= trees.stream().count()){
            trees.subList(0, t).clear();
            return true;
        }
        return false;
    }
}
