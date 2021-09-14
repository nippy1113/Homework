package SweetStuff;

public class Marshmallow extends Sweetness {
    private boolean isInChocolate; // Переменная отвечающая на вопрос шоколаде зефир или нет

    public Marshmallow( int cost, String name, double weight, boolean isInChocolate) {
        super(cost, name, weight);
        this.isInChocolate = isInChocolate;
    }

    public boolean isInChocolate() {
        return isInChocolate;
    }

    public void setInChocolate(boolean inChocolate) {
        isInChocolate = inChocolate;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(", is in chocolate: " + isInChocolate);
    }
}
