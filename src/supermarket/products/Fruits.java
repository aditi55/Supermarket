package supermarket.products;

public class Fruits extends Produce {
    public Fruits(String name, double price, double discount) {
        super(name, price, discount, "Fruit");
    }
        @Override
        public String toString() {
            return "Fruits[" + super.toString() + "]";
        }
}