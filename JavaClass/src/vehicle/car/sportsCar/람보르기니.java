package vehicle.car.sportsCar;

public class 람보르기니 {
    static int price;
    String name;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        람보르기니.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "람보르기니 [name=" + name + "]";
    }
}
