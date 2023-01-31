package entities;

public class Flower {
    private String name;
    private String color;
    private Float price;
    public Flower(String name, String color, Float price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public Float getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
