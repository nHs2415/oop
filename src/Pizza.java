public class Pizza {
    private String topping;
    private String pizzaSize;
    private double price;

    public Pizza(String topping,String pizzaSize,double price){
        this.topping=topping;
        this.pizzaSize=pizzaSize;
        this.price=price;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String createTopping(String ingredient1,String ingredient2){
        return this.getTopping();
    }

    public double calculateTotalPrice(Ingredient[] ingredient,)
}

