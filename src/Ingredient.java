public class Ingredient {
    private String name;
    private double ingredient_price;

    public Ingredient(String name,double ingredient_price){
        this.name=name;
        this.ingredient_price=ingredient_price;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setIngredient_price(double ingredient_price) {
        this.ingredient_price = ingredient_price;
    }

    public double getIngredient_price() {
        return ingredient_price;
    }
}
