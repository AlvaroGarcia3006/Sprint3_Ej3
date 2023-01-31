package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Tree {
    private String name;
    private float height;
    private float price;
    public Tree(String name, float height, float price) {
        this.name = name;
        this.height = height;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public float getHeight() {
        return height;
    }
    public float getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", price=" + price +
                '}';
    }
}
