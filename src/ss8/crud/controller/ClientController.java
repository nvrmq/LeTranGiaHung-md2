package ss8.crud.controller;

import ss8.crud.service.ClientService;
import ss8.crud.model.Client;

import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class ClientController {
    private ClientService clientService;
    private Scanner scanner;
    public ClientController() {
        clientService = new ClientService();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choice = 0;
        do {
            System.out.println("-----Customer List------");
            System.out.println("1. Show Customer");
            System.out.println("2. Add Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. Update Customer");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Client[] clients = clientService.findAll();
                    for (Client client : clients) {
                        if (client != null) {
                            System.out.println(client);
                        }
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Enter id: ");
                        int id = Integer.parseInt(scanner.nextLine()); // Consider using scanner.nextInt() for integer input
                        System.out.println("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter birthyear: ");
                        int birthyear = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter address: ");
                        String address = scanner.nextLine();
                        Client client = new Client(id, name, birthyear, address);
                        clientService.addClient(client);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter integers for ID and birthyear.");
                    }
                    break;
                case 3:
                    System.out.println("Enter id to delete: ");
                    int idDelete = scanner.nextInt();
                    clientService.deleteClient(idDelete);
                    break;
                case 4:
                    System.out.println("Enter id of the client you want to update: ");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    int newId = Integer.parseInt(scanner.nextLine());
                    String newName = scanner.nextLine();
                    int newBirthyear = Integer.parseInt(scanner.nextLine());
                    String newAddress = scanner.nextLine();
                    clientService.updateClient(idUpdate, newName, newBirthyear, newAddress);
            }
        } while (choice != 5);
    }
}
