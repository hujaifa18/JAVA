package Variables;
import java.util.Scanner;
public class User_Input {
    public static void main(String[] arge)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+ name);
        System.out.println("Your age is "+age+" years");
        System.out.println("Your gpa is "+gpa);
        if(isStudent)
        {
            System.out.println("You are a student");
        }
        else
        {
            System.out.println("You are not a student");
        }
        scanner.close();
    }
}
