import java.util.Scanner;

class FirstLastname {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = SC.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = SC.nextLine();
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}