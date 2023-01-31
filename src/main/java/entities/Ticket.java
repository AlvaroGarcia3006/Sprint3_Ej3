package entities;

import controller.TicketHandler;

import java.util.ArrayList;

public class Ticket {
    float totalPrice=0;
    String stTicket;
    ArrayList<Tree> trees = new ArrayList<>();
    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Decor> decors = new ArrayList<>();

    public float getTotalPrice() {
        return totalPrice;
    }
    public void showTicket(int t, int f, int d){
        for (int i=0; i<f; i++){
            Flower inputFlower = new Flower("Rosa", "Rojo", 5F);
            flowers.add(inputFlower);
            totalPrice += inputFlower.getPrice();
        }
        for (int i=0; i<t; i++){
            Tree inputTree = new Tree("Pino", 25, 200);
            trees.add(inputTree);
            totalPrice += inputTree.getPrice();
        }
        for (int i=0; i<d; i++){
            Decor inputDecor = new Decor("Madera", 40F);
            decors.add(inputDecor);
            totalPrice += inputDecor.getPrice();
        }
        stTicket= "Arboles: "+trees.stream().count()+"\n"+"Flores: "+flowers.stream().count()+"\n"
                +"Decoraciones: "+decors.stream().count()+"\n"+"Precio: "+totalPrice;
        System.out.println(stTicket);
    }
    @Override
    public String toString() {
        return stTicket;
    }
}
