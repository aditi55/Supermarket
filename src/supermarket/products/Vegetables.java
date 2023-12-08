package supermarket.products;
public class Vegetables extends Produce {
    public Vegetables(String name, double price, double discount) {
        super(name, price, discount, "Vegetables");
    }

    @Override
    public String toString() {
        return "Vegetables(" +
                "name=" + getName() +
                "price=" + getPrice() +
                "discount=" + getDiscount() +
                "quantity=" + getQuantity() +
                '}';
    }
}
