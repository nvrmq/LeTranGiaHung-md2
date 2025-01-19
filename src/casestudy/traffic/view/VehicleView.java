package casestudy.traffic.view;

import casestudy.traffic.models.Vehicle;

import java.util.Scanner;

public class VehicleView {
    private final Scanner scanner = new Scanner(System.in);

    public void display() {
        System.out.println("-----VEHICLE MANAGEMENT-----");
        System.out.println("1.Add Vehicle");
        System.out.println("2.Remove Vehicle");
        System.out.println("3.Show Vehicles");
        System.out.println("4.Exit");
        System.out.println("Choose an option: ");
    }
    public int getChoice(){
        while (true) {
            String choice = scanner.nextLine();
            if (choice.isEmpty()){
                System.out.print("Please enter a number");
            } else {
                try {
                    return Integer.parseInt(choice);
                } catch (NumberFormatException e) {
                    System.out.print("Invalid number, try again");
                }
            }
        }
    }
    public String getInput(String prompt) {
        System.out.print(prompt);
        String input;
        while((input = scanner.nextLine()).isEmpty()){
            System.out.print("Data cannot be empty, try again" + prompt);
        }
        return input;
    }
    public void printMessage(String message) {
        System.out.println(message);
    }
}
