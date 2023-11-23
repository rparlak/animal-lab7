import java.util.Scanner;
class Person {
    String surname;
    String firstName;
    String street;
    String zipCode;
    String city;

    void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname:");
        surname = scanner.nextLine();
        System.out.print("Enter first name:");
        firstName = scanner.nextLine();
        System.out.print("Enter street: ");
        street = scanner.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = scanner.nextLine();
        System.out.print("Enter city: ");
        city = scanner.nextLine();
    }

    void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First Name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip code "+zipCode);
        System.out.println("City: " + city);
    }
}

class Staff extends Person {
    String education;
    String position;

    void initialize1() {
        initialize();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }

    void print1() {
        print();

        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}