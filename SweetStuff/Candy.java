package SweetStuff;

public class Candy extends Sweetness {
    private String factoryManufacturer; //Производитель

    public Candy(int cost, String name, double weight, String factoryManufacturer) {
        super(cost, name, weight);
        this.factoryManufacturer = factoryManufacturer;
    }

    public String getFactoryManufacturer() {
        return factoryManufacturer;
    }

    public void setFactoryManufacturer(String factoryManufacturer) {
        this.factoryManufacturer = factoryManufacturer;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(", Manufacturer: " + factoryManufacturer);
    }
}
