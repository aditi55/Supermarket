package supermarket.products;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Supermarket!");
        ArrayList<GroceryProduct> cart = new ArrayList<>();
        GroceryProduct milk = new DairyProduct("Milk", 4, 0, Fat.FULLCREAM);
        cart.add(milk);
        GroceryProduct toast = new GroceryProduct("Toast", 2.5, 10);
        cart.add(toast);
        GroceryProduct tomato = new Produce("Vegetable", 200, 10, "tomato");
        cart.add(tomato);
        //display one item only
        System.out.println(toast.display());

        //display one item only
        System.out.println("Toast actual price = " + toast.getActualPrice());

        //get total cart price
        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getActualPrice();
        }
            System.out.println("Total cost = " + total);
            System.out.println("Display cart items: ");
            for (int i = 0; i < cart.size(); i++) {
                System.out.println(cart.get(i).display() + "\n-------------------------------------------------------");
            }
        }
    }