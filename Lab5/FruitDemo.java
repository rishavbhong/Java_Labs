class Fruit {
    private String name;
    private boolean isSingleFruit;
    private double price;

    public Fruit(String name, boolean isSingleFruit, double price) {
        this.name = name;
        this.isSingleFruit = isSingleFruit;
        this.price = price;
    }

    public void displayFruit() {
        System.out.println(name);
        System.out.println(isSingleFruit ? "Single Fruit" : "Bunch Fruit");
        System.out.println(price);
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", true, 120.50);
        Fruit fruit2 = new Fruit("Banana", false, 60.00);

        fruit1.displayFruit();

        fruit2.displayFruit();
    }
}
