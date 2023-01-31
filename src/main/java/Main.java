import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entities.*;
import controller.*;
import model.Model;
import view.*;

public class Main {
    public static void main(String[] args) {
        String fName = "Floristeria.txt";
        TreeHandler th = new TreeHandler();
        FlowerHandler fh = new FlowerHandler();
        DecorHandler dh = new DecorHandler();
        TicketHandler tkh = new TicketHandler();
        Model m = new Model();
        int input;
        do {
            Menu();
            input = AskInt();
            switch (input) {
                case 1:
                    if(!fileExists(fName)){
                        CreateFile();
                    }else System.out.println("El archivo ya existe");
                    break;
                case 2:
                    th.createPino();
                    break;
                case 3:
                    fh.createFlower();
                    break;
                case 4:
                    dh.createDecor();
                    break;
                case 5:
                    System.out.println("Arboles:");
                    StockView.printTrees(th.getTrees());
                    System.out.println("Flores:");
                    StockView.printFlowers(fh.getFlowers());
                    System.out.println("Decoraciones:");
                    StockView.printDecor(dh.getDecors());
                    break;
                case 6:
                    th.removePino();
                    break;
                case 7:
                    fh.removeFlower();
                    break;
                case 8:
                    dh.removeDecor();
                    break;
                case 9:
                    StockView.printTreesQuantity(th.getTrees());
                    StockView.printFlowersQuantity(fh.getFlowers());
                    StockView.printDecorQuantity(dh.getDecors());
                    break;
                case 10:
                    StockView.totalValue(th.totalPrice() + fh.totalPrice() + dh.totalPrice());
                    break;
                case 11:
                    int t, f, d;
                    Ticket tk = new Ticket();
                    System.out.println("¿Cuantos arboles desea comprar?");
                    t = AskInt();
                    if (!th.treeSell(t)) {
                        System.out.println("La cantidad excede el stock");
                        t = 0;
                    }
                    System.out.println("¿Cuantas flores desea comprar?");
                    f = AskInt();
                    if (!fh.flowerSell(f)) {
                        System.out.println("La cantidad excede el stock");
                        f = 0;
                    }
                    System.out.println("¿Cuantas decoraciones desea comprar?");
                    d = AskInt();
                    if (!dh.decorSell(d)) {
                        System.out.println("La cantidad excede el stock");
                        d = 0;
                    }
                    tk.showTicket(t, f, d);
                    tkh.storeTicket(tk);
                    m.modelStoreTicket(tk);
                    break;
                case 12:
                    tkh.showHistory();
                    tkh.showTotalValue();
                    break;
                case 0:
                    Model.Writer("*************************************************");
                    Model.Writer("Stock:");
                    Model.writeTrees(th.getTrees());
                    Model.writeFlowers(fh.getFlowers());
                    Model.writeDecors(dh.getDecors());
                    Model.writeTreesQuantity(th.getTrees());
                    Model.writeFlowersQuantity(fh.getFlowers());
                    Model.writeDecorQuantity(dh.getDecors());
                    Model.writeTotalValue(th.totalPrice() + fh.totalPrice() + dh.totalPrice());
                    Model.Writer("*************************************************");
                    Model.Writer("Ventas:");
                    m.writeHistory();
                    m.writeTotalValue();
                    Model.Writer("*************************************************");
                    System.out.println("Se volcarán los datos al fichero y el programa se cerrará"+"\n"+"¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Escoja una opción válida.");
                    break;
            }
        } while (input != 0);
    }
    public static void Menu() {
        System.out.println("****MENÚ PRINCIPAL****");
        System.out.println("1· Crear Floristería");
        System.out.println("2· Añadir Árbol");
        System.out.println("3· Añadir Flor");
        System.out.println("4· Añadir Decoración");
        System.out.println("5· Visualizar Stock");
        System.out.println("6· Retirar Árbol");
        System.out.println("7· Retirar Flor");
        System.out.println("8· Retirar Decoración");
        System.out.println("9· Visualizar Cantidades de Stock");
        System.out.println("10· Visualizar Valor Total de Stock");
        System.out.println("11· Crear Ticket de Compra");
        System.out.println("12· Visualizar Historial de Ventas");
        System.out.println("0· Finalizar programa.");
    }
    public static int AskInt() {
        int input = -1;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            input = sc.nextInt();
        } else {
            System.out.println("Debe escoger una opción del menú.\n");
        }
        return input;
    }
    public static void CreateFile() {
        File file = new File("Floristeria.txt");
        try {
            FileWriter escritor = new FileWriter(file);
            escritor.write("***FLORISTERIA***\n");
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean fileExists(String fName) {
        File file = new File(fName);
        return file.exists();
    }
}