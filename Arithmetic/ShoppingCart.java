package Arithmetic;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String item;
        int size = 0;
        int price = 0;
        int quantity;
        int total;

        System.out.println("***Pizza and Burgers ***");
        System.out.print("What item you want to buy? :");
        item = scanner.nextLine().toLowerCase();
        if(item.equals("pizza"))
        {
            System.out.print("What is the size of pizza (4inch or 6inch)? :");
            size = scanner.nextInt();
            if(size == 4)
            {
                price = 400;
            }
            else if(size == 6)
            {
                price = 600;
            }
        }
        else
        {
            price = 150;
        }
        System.out.print("What quantity you want? :");
        quantity = scanner.nextInt();
        total = price*quantity;
        System.out.println("You have to pay : "+total);

        scanner.close();
    }
}
