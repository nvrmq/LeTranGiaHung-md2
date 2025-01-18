package ss8.crud.view;

import ss8.crud.controller.ClientController;

public class View {
    public static void main(String[] args) {
        ClientController controller = new ClientController();
        controller.showMenu();
    }
}
