public class PizzaFactory extends Thread{


    public Pizza makePizza(Pizza newPizza) throws InterruptedException {
        System.out.println("Pizza is being made");

        Thread.sleep(newPizza.sizeType.getTime());
        return newPizza;
    }

}
