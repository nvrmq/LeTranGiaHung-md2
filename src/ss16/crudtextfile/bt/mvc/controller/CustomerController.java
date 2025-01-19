package ss16.crudtextfile.bt.mvc.controller;

import ss16.crudtextfile.bt.mvc.model.Customer;
import ss16.crudtextfile.bt.mvc.service.CustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private CustomerService customerService;
    private Scanner scanner;

    public CustomerController() {
        customerService = new CustomerService();
        scanner = new Scanner(System.in);
    }

    public void run() {
        int choice = -1;

        do {
            System.out.println("----Customer Menu----");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. Update Customer");
            System.out.println("5. Exit");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        Customer customer = inputDataForCustomer("add");
                        customerService.addCustomer(customer);
                        System.out.println("Customer added");
                        break;
                    case 2:
                        List<Customer> list = customerService.getAllCustomers();
                        displayCustomer(list);
                        break;
                    case 3:
                        System.out.print("Enter Customer ID to delete:");
                        int id = scanner.nextInt();
                        boolean result = customerService.deleteCustomer(id);
                        if (result) {
                            System.out.println("Customer was deleted");
                        } else {
                            System.out.println("Customer was not found");
                        }
                        break;
                    case 4:
                        System.out.print("Enter Customer ID to update:");
                        int id2 = scanner.nextInt();
                        Customer customer1 = customerService.getCustomer(id2);
                        if (customer1 != null) {
                            Customer newCustomer = inputDataForCustomer("update");
                            newCustomer.setId(id2);
                            customerService.updateCustomer(newCustomer);
                            System.out.print("Customer was updated");
                        } else {
                            System.out.print("Customer was not found");
                        }
                        break;
                        case 5:
                            System.out.print("----Exit Program----");
                            break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } while (choice !=5);
    }
    private Customer inputDataForCustomer(String type) {
        int customerId = -1;
        if (type.equals("add")) {
            System.out.print("Enter customer ID: ");
            customerId = scanner.nextInt();
        }

        System.out.print("Customer name:");
        String customerName = scanner.nextLine();
        System.out.print("Customer dob(dd/mm/yyyy):");
        String customerDOB = scanner.nextLine();
        System.out.print("Customer address:");
        String customerAddress = scanner.nextLine();
        return new Customer(customerId, customerName, customerDOB, customerAddress);
    }
    private void displayCustomer(List<Customer> list) {
        if (list.isEmpty()) {
            System.out.println("No customers found");
        } else {
            System.out.printf("-----Customer List------");
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }
    }
    private int inputIdCustomer(String prompt) {
        while (true) {
            try {
                System.out.printf(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.printf("Invalid customer ID");
            }
        }
    }
}
