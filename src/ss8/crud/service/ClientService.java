package ss8.crud.service;

import ss8.crud.model.Client;

public class ClientService {
    private static Client[] clients = new Client[10];
    static {
        clients[0] = new Client(1, "Nguyễn Văn A", 2003, "Đà Nẵng");
        clients[1] = new Client(2, "Nguyễn Văn B", 2006, "Hà Nội");
        clients[2] = new Client(3, "Nguyễn Văn C", 2001, "Nha Trang");
    }
    public Client[] findAll() {
        return clients;
    }
    public void addClient(Client client) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null){
                clients[i] = client;
                break;
            }
        }
    }
    public void updateClient(int id, String name, int birthYear, String address) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].getId() == id && clients[i] != null) {
                clients[i].setName(name);
                clients[i].setBirthYear(birthYear);
                clients[i].setAddress(address);
            }
        }
    }
    public void deleteClient(int id) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].getId() == id) {
                clients[i] = null;
                break;
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
