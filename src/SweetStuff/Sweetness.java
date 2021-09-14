package SweetStuff;

public abstract class Sweetness {
    private int cost;
    private String name;
    private double weight;

    public Sweetness(int cost, String name, double weight) {
        this.cost = cost;
        this.name = name;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getInfo() {
        System.out.print("Name: " + name + ", Cost: " + cost + ", Weight: " + weight );
    }
}
