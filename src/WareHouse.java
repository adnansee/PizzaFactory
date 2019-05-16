import java.util.ArrayList;
import java.util.List;

public class WareHouse extends Thread {

    private List<Pizza> pizzaStocked = new ArrayList<Pizza>();
    PizzaFactory pizzaFactory1 = new PizzaFactory();
    PizzaFactory pizzaFactory2 = new PizzaFactory();
    private boolean checkStatus = false;


    public List<Pizza> getPizzaStocked() {
        return pizzaStocked;
    }

    public void setPizzaStocked(List<Pizza> pizzaStocked) {
        this.pizzaStocked = pizzaStocked;
    }


    public void makePizzaAfterCheck(Pizza newPizza) throws InterruptedException {

        if (pizzaStocked.size() <= 10) {

            if(!pizzaFactory1.isAlive()){
                Pizza justMade = pizzaFactory1.makePizza(newPizza);
                pizzaStocked.add(justMade);
                System.out.println("Pizza factory1 used to make pizza ");
            }
            else{
                Pizza justMade = pizzaFactory2.makePizza(newPizza);
                pizzaStocked.add(justMade);
                System.out.println("Pizza factory2 used to make pizza ");
            }


            System.out.println("There are " + pizzaStocked.size() + " pizzas left");
            System.out.println("The pizza added to list is "+ newPizza.toString());

        }


    }


}


