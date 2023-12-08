package supermarket.products;

//Inheritance property of 0OPS used
public class Beverage extends GroceryProduct {
    private SugarLevel sugarLevel;

    public Beverage() {
        super();
    }

    public Beverage(String name, double price, double discount) {
        super(name, price, discount);
    }

    public Beverage(String name, Double price, Double discount, SugarLevel sugarLevel) {
        super(name, price, discount);
        this.sugarLevel = sugarLevel;
    }

    public SugarLevel getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(SugarLevel sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String display() {
        return (super.display() + "\n SugarLevel: " + sugarLevel);
    }
}
