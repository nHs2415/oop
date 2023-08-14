import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

    }

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

    public String createTopping(String ingredient1, String ingredient2){
        String top=this.topping+ingredient1+ingredient2;
        return top;
    }

    public double calculateTotalPrice(Ingredient[] ingredient,String topping,String pizzaSize){
        System.out.println("********Welcome to PRK Pizza********");
        System.out.println();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String userName= scanner.nextLine();

        System.out.println();
        System.out.println("*********WELCOME "+userName+" **********");
        System.out.println("Select the Pizza size : ");
        System.out.println("\t1) Large \n\t2) Medium \n\t3) Small");
        int size = scanner.nextInt();

        System.out.println();
        System.out.println("Select the Pizza category : ");
        System.out.println("\t1) Veggie Pizza \n\t2) Cheese Pizza \n\t3) Chicken Pizza ");
        int category = scanner.nextInt();

        System.out.println();
        System.out.println("Select Extra ingredient 1 : ");
        System.out.println("\t1) Cheese \n\t2) Sausages \n\t3) Prawns \n\t4) Mushrooms \n\t5) CuttleFish \n\t6) Chicken");
        int ing1= scanner.nextInt();

        System.out.println();
        System.out.println("Select Extra ingredient 2 :");
        System.out.println("\t1) Cheese \n\t2) Sausages \n\t3) Prawns \n\t4) Mushroom \n\t5) CuttleFish \n\t6) Chicken");
        int ing2 = scanner.nextInt();
        System.out.println();

        return 0.0;
    }

    public void displayOrderDetails(){
        System.out.println("Pizza size : "+this.getPizzaSize()+"\t");
    }
}

