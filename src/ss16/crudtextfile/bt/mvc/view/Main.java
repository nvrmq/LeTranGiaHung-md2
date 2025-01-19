package ss16.crudtextfile.bt.mvc.view;

import ss16.crudtextfile.bt.mvc.controller.CustomerController;

public class Main {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        customerController.run();
    }
}
