package controller;
import entities.Ticket;
import java.util.ArrayList;
public class TicketHandler {
    ArrayList<Ticket> tickets = new ArrayList<>();

    @Override
    public String toString() {
        return "TicketHandler{" +
                "tickets=" + tickets +
                '}';
    }

    public void storeTicket(Ticket tk) {
        tickets.add(tk);
    }
    public void showHistory() {
        for (Ticket t : tickets) {
            System.out.println(t.toString());
        }
    }
    public void showTotalValue() {
        float totalPrice = 0;
        for (Ticket t : tickets) {
            totalPrice += t.getTotalPrice();
        }
        System.out.println("Ventas totales: "+totalPrice);
    }
}

