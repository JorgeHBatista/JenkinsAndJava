import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Surname: ");
        String surname = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println("\nInformación del Usuario:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}
