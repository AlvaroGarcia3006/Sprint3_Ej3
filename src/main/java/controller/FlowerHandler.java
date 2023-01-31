package controller;
import entities.Flower;
import entities.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowerHandler {
    private ArrayList<Flower> flowers = new ArrayList<>();

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }
    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }
    @Override
    public String toString() {
        return "FlowerHandler{" +
                "flowers=" + flowers +
                '}';
    }
    public void createFlower(){
            Flower inputFlower = new Flower("Rosa", "Rojo", 5F);
            flowers.add(inputFlower);
            System.out.println("Añadido correctamente");
    }
    public void removeFlower(){
        if(!flowers.isEmpty()){
            flowers.remove(0);
            System.out.println("Eliminado!");
        }
    }
    public float totalPrice(){
        float total = 0;
        for(Flower f : flowers){
            total += f.getPrice();
        }
        return total;
    }
    public boolean flowerSell(int f){
        if(f<= flowers.stream().count()){
            flowers.subList(0, f).clear();
            return true;
        }
        return false;
    }
}
