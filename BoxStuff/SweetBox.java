package BoxStuff;

import SweetStuff.Sweetness;

import java.util.ArrayList;

public interface SweetBox {
    void addSweetie(Sweetness sweetie);
    void removeSweetie(int sweetieIndex);
    void getSweetiesWeight();
    void getSweetiesCost();
    void getSweetiesInfo();
}
