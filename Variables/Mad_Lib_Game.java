package Variables;
import java.util.Scanner;
public class Mad_Lib_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb;

        System.out.print("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun(name/place): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb with ing(action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a "+adjective1+" zoo.");
        System.out.println("In an exibit, I saw "+noun1 +".");
        System.out.println(noun1 + " was "+adjective2+ " and "+verb+".");
        System.out.println("I was "+adjective3+".");
        scanner.close();
    }
}
