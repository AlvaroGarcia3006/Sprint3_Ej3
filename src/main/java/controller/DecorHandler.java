package controller;
import entities.Decor;
import entities.Flower;
import entities.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class DecorHandler {
    private ArrayList<Decor> decors = new ArrayList<>();

    public ArrayList<Decor> getDecors() {
        return decors;
    }
    public void setDecors(ArrayList<Decor> decors) {
        this.decors = decors;
    }
    @Override
    public String toString() {
        return "DecorHandler{" +
                "decors=" + decors +
                '}';
    }
    public void createDecor(){
        Decor inputDecor = new Decor("Madera", 40F);
        decors.add(inputDecor);
        System.out.println("Añadido correctamente");
    }
    public void removeDecor() {
        if (!decors.isEmpty()) {
            decors.remove(0);
            System.out.println("Eliminado!");
        }
    }
    public float totalPrice(){
        float total = 0;
        for(Decor d : decors){
            total += d.getPrice();
        }
        return total;
    }
    public boolean decorSell(int d){
        if(d<= decors.stream().count()){
            decors.subList(0, d).clear();
            return true;
        }
        return false;
    }
}
