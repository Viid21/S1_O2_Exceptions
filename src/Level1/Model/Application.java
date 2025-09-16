package Level1.Model;

import Level1.Exceptions.EmptySaleException;

public class Application {
    public static void play(){
        Sale sale = new Sale();

        try{
            sale.calculateTotalPrice();
        }catch (EmptySaleException exception){
            System.out.println(exception.getMessage());
        }

        sale.getProducts().add(new Product("Potatoe", 300));
        sale.getProducts().add(new Product("Watermelon", 450));
        sale.getProducts().add(new Product("Potatoe2", 724));

        try{
            sale.calculateTotalPrice();
        }catch (EmptySaleException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("The total price of the products is " + sale.getTotalPrice() + " €.");

        try{
            String example = sale.getProducts().get(9).getName();
            System.out.println(example);
        }catch (IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
    }
}
