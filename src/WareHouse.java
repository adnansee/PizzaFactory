import java.util.ArrayList;
import java.util.List;

public class WareHouse extends Thread {

    private List<Pizza> pizzaStocked = new ArrayList<Pizza>();
    PizzaFactory pizzaFactory1 = new PizzaFactory();
    PizzaFactory pizzaFactory2 = new PizzaFactory();
    //  private boolean checkStatus = false;


    public List<Pizza> getPizzaStocked() {
        return pizzaStocked;
    }

    public void setPizzaStocked(List<Pizza> pizzaStocked) {
        this.pizzaStocked = pizzaStocked;
    }


    public void makePizzaAfterCheck(Pizza newPizza) throws InterruptedException {


        if (!pizzaFactory1.isAlive()) {


            startFactory1(newPizza);


        } else if (!pizzaFactory2.isAlive()) {


            startFactory2(newPizza);


        }


        System.out.println("There are " + pizzaStocked.size() + " pizzas left");
        System.out.println("The pizza added to list is " + newPizza.toString());

    }


    public void startFactory1(Pizza newPizza) throws InterruptedException {

        Pizza justMade = pizzaFactory1.makePizza(newPizza);
        pizzaStocked.add(justMade);
        System.out.println("Pizza factory - 1 used to make pizza \n");

    }

    public void startFactory2(Pizza newPizza) throws InterruptedException {

        Pizza justMade = pizzaFactory1.makePizza(newPizza);
        pizzaStocked.add(justMade);
        System.out.println("Pizza factory - 2 used to make pizza \n");

    }
}







