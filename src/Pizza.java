public class Pizza {


    public PizzaType sizeType;
    private PizzaFlavor pizzaFlavor;

    @Override
    public String toString() {
        return "Pizza " +
                "sizeType = " + sizeType +
                " pizzaFlavor = " + pizzaFlavor+" "
                ;
    }

    public Pizza(PizzaType sizeType, PizzaFlavor pizzaFlavor) {
        this.sizeType = sizeType;
        this.pizzaFlavor = pizzaFlavor;
    }

    public Pizza() {

    }
}
