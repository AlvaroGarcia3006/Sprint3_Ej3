package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Decor {
    private String type;
    private Float price;
    public Decor(String type, Float price) {
        this.type = type;
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public Float getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Decor{" +
                "material='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
