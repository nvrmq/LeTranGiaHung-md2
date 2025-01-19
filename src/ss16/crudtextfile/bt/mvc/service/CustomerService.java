package ss16.crudtextfile.bt.mvc.service;

import ss16.crudtextfile.bt.mvc.model.Customer;
import ss16.crudtextfile.bt.mvc.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private final String FILE_PATH ="/Users/macbook/Desktop/md2/untitled/src/ss16/crudtextfile/bt/mvc/data/customer.csv";

    public void addCustomer(Customer customer) {
        List<String> data = ReadAndWrite.readFile(FILE_PATH);
        data.add(customer.toCSV());
        ReadAndWrite.writeFile(FILE_PATH, data, false);
    }

    public List<Customer> getAllCustomers() {
        List<String> data = ReadAndWrite.readFile(FILE_PATH);
        List<Customer> customers = new ArrayList<>();
        for (String line : data) {
            customers.add(Customer.fromCSV(line));
        }
        return customers;
    }

    public boolean deleteCustomer(int id) {
        List<Customer> customers = getAllCustomers();
        boolean result = false;

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                result = true;
                customers.remove(i);
                break;
            }
        }
        if (result) {
            saveAll(customers);
        }
        return result;
    }
    public boolean updateCustomer(Customer customer) {
        List<Customer> customers = getAllCustomers();
        boolean result = false;

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == customer.getId()) {
                customers.set(i, customer);
                result = true;
                break;
            }
        }
        if (result) {
            saveAll(customers);
        }
        return result;
    }
    public Customer getCustomer(int id) {
        List<Customer> customers = getAllCustomers();
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
    private void saveAll(List<Customer> customers) {
        List<String> data = new ArrayList<>();
        for (Customer customer : customers) {
            data.add(customer.toCSV());
        }
        ReadAndWrite.writeFile(FILE_PATH, data, false);
    }
}
