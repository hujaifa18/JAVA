package Variables;
import java.util.Scanner;
public class Input_Issue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();//Use this if we take string after int/double

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your age is "+age);
        System.out.println("Your name is "+ name);
        scanner.close();
    }
}
