package model;

import controller.TicketHandler;
import entities.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Model {
    ArrayList<Ticket> tickets = new ArrayList<>();
    public static void Writer(String st) {
        try {
            FileWriter fw = new FileWriter("Floristeria.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(st);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Se ha producido un error.");
        }
    }
    public static void writeTrees(ArrayList<Tree> trees){
        for(Tree t : trees){
            Writer(t.toString());
        }
    }
    public static void writeFlowers(ArrayList<Flower> flowers){
        for(Flower f : flowers){
            Writer(f.toString());
        }
    }
    public static void writeDecors(ArrayList<Decor> decors){
        for(Decor d : decors){
            Writer(d.toString());
        }
    }
    public static void writeTreesQuantity(ArrayList<Tree> trees){
        Writer("Hay "+trees.stream().count()+" arboles en stock");
    }
    public static void writeFlowersQuantity(ArrayList<Flower> flowers){
       Writer("Hay "+flowers.stream().count()+" flores en stock");
    }
    public static void writeDecorQuantity(ArrayList<Decor> decors){
        Writer("Hay "+decors.stream().count()+" decoraciones en stock");
    }
    public static void writeTotalValue(Float value){
        Writer("El valor total del stock es "+value);
    }
    public void modelStoreTicket(Ticket tk){
        tickets.add(tk);
    }
    public void writeHistory(){
        for (Ticket t : tickets){
            Writer(t.toString());
        }
    }
    public void writeTotalValue(){
        float totalPrice = 0;
        for (Ticket t : tickets) {
            totalPrice += t.getTotalPrice();
        }
        Writer("Ventas totales: "+totalPrice);
    }
}
