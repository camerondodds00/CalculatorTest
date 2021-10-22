import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome to the calculator");
        System.out.println("Available commands are 'add', 'subtract', 'multiply', 'divide', quit.");
        System.out.println("All math commands accept 2 input numbers, separated by spaces.");

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command:");

            String command = scanner.nextLine();
            String[] inputs = command.split(" ");

            if (inputs[0].equals("add")) {
                System.out.println(calculator.add(Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2])));
            } else if (inputs[0].equals("subtract")) {
                System.out.println(calculator.subtract(Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2])));
            } else if (inputs[0].equals("multiply")) {
                System.out.println(calculator.multiply(Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2])));
            } else if (inputs[0].equals("divide")) {
                System.out.println(calculator.divide(Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2])));
            } else if (inputs[0].equals("quit")) {
                break;
            }
            else {
                System.out.println("Error: Invalid input");
            }
        }

        System.out.println("Program finished");


    }



}
