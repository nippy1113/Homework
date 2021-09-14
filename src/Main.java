import BoxStuff.Box;
import SweetStuff.Candy;
import SweetStuff.Marshmallow;
import SweetStuff.CheeseCake;

public class Main {
    public static void main(String[] args) {
        Marshmallow marshmallow = new Marshmallow(5, "Zefirka", 1.0, true);
        Candy candy = new Candy(2, "RitterSport", 2.5, "German Chocolate prod");
        CheeseCake cheesecake = new CheeseCake(10, "new York cheesecake", 3.0, "Mascarpone");

        Box box = new Box();

        box.addSweetie(marshmallow);
        box.addSweetie(candy);
        box.addSweetie(cheesecake);
        box.removeSweetie(5);

        box.smartCostOptimiser(4);
        // box.smartWeightOptimiser(5);

        box.getSweetiesCost();
        box.getSweetiesWeight();
        box.getSweetiesInfo();
    }
}
