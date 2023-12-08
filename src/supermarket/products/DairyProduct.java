package supermarket.products;
//Inheritance property of OOPS used
public class DairyProduct extends GroceryProduct {
    //instance variable has access specifier datatype name
    private Fat fat;

    public DairyProduct() {
        super();
    }

    public DairyProduct(String name, double price, double discount) {
        super(name, price, discount);
    }

    public DairyProduct(String name, double price, double discount, Fat fat) {
        super(name, price, discount);
        this.fat = fat;
    }

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

    public String display() {
        return (super.display() + "\nFat: " + fat);
    }
}