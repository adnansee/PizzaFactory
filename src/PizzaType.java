public enum PizzaType {
    SMALL(10,6,300),
    MEDIUM(12,8.5,500),
    LARGE(16,11,2000);

    private int size;
    private double price;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private int time;

    PizzaType(int size, double price, int time) {
        this.size = size;
        this.price = price;
        this.time = time;
    }

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