package BoxStuff;

import BoxStuff.SweetBox;
import SweetStuff.Sweetness;

import java.util.ArrayList;
import java.util.Collections;

public class Box implements SweetBox {
    private ArrayList<Sweetness> sweeties = new ArrayList<>();

    @Override
    public void addSweetie(Sweetness sweetie) {
        sweeties.add(sweetie);
        System.out.println(sweetie.getName() + " was added to the box!");
    }

    @Override
    public void removeSweetie(int sweetieIndex) {
        try {
            sweeties.remove(sweetieIndex);
            System.out.println(sweeties.get(sweetieIndex).getName() + " was removed from the box!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is no sweetie with such index!");
        }
    }

    @Override
    public void getSweetiesWeight() {
        double totalWeight = 0;
        for (int i = 0; i < sweeties.size(); i++) {
            totalWeight += sweeties.get(i).getWeight();
        }
        System.out.println("Total weight is: " + totalWeight);
    }

    @Override
    public void getSweetiesCost() {
        int totalCost = 0;
        for (int i = 0; i < sweeties.size(); i++) {
            totalCost += sweeties.get(i).getCost();
        }
        System.out.println("Total cost is: " + totalCost);
    }

    @Override
    public void getSweetiesInfo() {
        System.out.println("BoxStuff.Box contains: ");
        for (int i = 0; i < sweeties.size(); i++) {
            sweeties.get(i).getInfo();
        }
    }

    //additional methods:

     public void smartCostOptimiser(double inputWeight) {
        double totalWeight = 0;
        for (int i = 0; i < sweeties.size(); i++) {                    //find total weight
            totalWeight += sweeties.get(i).getWeight();
        }

        while (totalWeight >= inputWeight) {
            int min = sweeties.get(0).getCost();
            for (int i = 0; i < sweeties.size(); i++) {
                if(sweeties.get(i).getCost() < min)               //find min value
                    min = sweeties.get(i).getCost();
            }
            for (int i = 0; i < sweeties.size(); i++) {
                if(sweeties.get(i).getCost() == min) {                         // remove min value
                    totalWeight -= sweeties.get(i).getWeight();
                    System.out.println(sweeties.get(i).getName() + " removed because of the optimisation");
                    sweeties.remove(i);
                    break;
                }
            }
        }
    }
    
    public void smartWeightOptimiser(double inputWeight) {
        double totalWeight = 0;
        for (int i = 0; i < sweeties.size(); i++) {
            totalWeight += sweeties.get(i).getWeight();
        }
        while (totalWeight >= inputWeight) {
            double min = sweeties.get(0).getWeight();
            for (int i = 0; i < sweeties.size(); i++) {
                if(sweeties.get(i).getWeight() < min)
                    min = sweeties.get(i).getWeight();
            }
            for (int i = 0; i < sweeties.size(); i++) {
                if(sweeties.get(i).getWeight() == min) {
                    totalWeight -= sweeties.get(i).getWeight();
                    System.out.println(sweeties.get(i).getName() + " removed because of the optimisation");
                    sweeties.remove(i);
                    break;
                }
            }
        }
    }

}
