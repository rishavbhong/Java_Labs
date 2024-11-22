class Product {
    private int productId;
    private String name;
    private int categoryId;
    private double unitPrice;

    public Product(int productId, String name, int categoryId, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Category ID: " + categoryId);
        System.out.println("Unit Price: " + unitPrice);
    }
}

class ElectricalProduct extends Product {
    private String voltageRange;
    private int wattage;

    public ElectricalProduct(int productId, String name, int categoryId, double unitPrice, String voltageRange, int wattage) {
        super(productId, name, categoryId, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void updateWattageAndPrice(int newWattage, double newPrice) {
        setWattage(newWattage);
        setUnitPrice(newPrice);
    }

    public void displayElectricalProductDetails() {
        displayProductDetails();
        System.out.println("Voltage Range: " + voltageRange);
        System.out.println("Wattage: " + wattage);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        ElectricalProduct eProduct = new ElectricalProduct(101, "Electric Heater", 5, 5000.0, "220-240V", 2000);

        eProduct.displayElectricalProductDetails();

        eProduct.updateWattageAndPrice(2500, 5500.0);

        eProduct.displayElectricalProductDetails();
    }
}
