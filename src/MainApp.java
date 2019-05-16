import jdk.jshell.Snippet;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {

        WareHouse storagePizza = new WareHouse();

        PizzaFactory KingsPizza = new PizzaFactory();
        PizzaFactory QueenssPizza = new PizzaFactory();

        storagePizza.pizzaFactory1 = KingsPizza;
        storagePizza.pizzaFactory2 = QueenssPizza;






        Pizza fungi = new Pizza(PizzaType.LARGE, PizzaFlavor.FUNGI);
        Pizza marg = new Pizza(PizzaType.MEDIUM, PizzaFlavor.MARGARITA);
        Pizza haw = new Pizza(PizzaType.SMALL, PizzaFlavor.HAWAIAN);
        Random random = new Random();

        for (int i = 0; i <= 5; i++) {
            int randomer = random.nextInt(3);

            if (randomer == 0) {

                storagePizza.makePizzaAfterCheck(fungi);}


             else if (randomer == 1) {

                    storagePizza.makePizzaAfterCheck(marg);}



            else if (randomer == 2) {

                    storagePizza.makePizzaAfterCheck(haw);}

        }


    }
}
