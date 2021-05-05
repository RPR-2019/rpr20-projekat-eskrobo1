package ba.unsa.etf.rpr.project;

import ba.unsa.etf.rpr.project.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Employee> employees=new ArrayList<>();
    private List<Item> items=new ArrayList<>();

    public Bookstore() throws IllegalAccount {
        Account firstAccount = new Account("Emina", "Skrobo", "eskrobo1@etf.unsa.ba", "eskrobo1","eskrobo1");
        employees.add(new Administrator(firstAccount));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
