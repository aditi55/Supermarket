package supermarket.products;
public class Produce extends GroceryProduct{
        private float quantity;
        private String type;
        public Produce(String name, double price, double discount, String fruit) {
            super();
            this.setName(name);
            this.setPrice(price);
            this.quantity = quantity;
            this.type = type;

        }
        public float getQuantity() {
            return quantity;
        }
        public void setQuantity(float quantity) {
            this.quantity = quantity;
        }
        public String getType() {
            return type;
        }
        public void setType(String type){
                this.type = type;
            }
//method updates the available stock
        public void updateQuantity(float quantity) {
         this.quantity += quantity;
}

//method to obtain cost including quantity and price
}