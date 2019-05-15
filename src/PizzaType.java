public enum PizzaType {
    SMALL(10,6),
    MEDIUM(12,8.5),
    LARGE(16,11);

    private int size;
    private double price;

    PizzaType(int size, double price) {
        this.size = size;
        this.price = price;
    }

    PizzaType(int size) {
        this.size = size;
    }

    PizzaType() {

    }
}