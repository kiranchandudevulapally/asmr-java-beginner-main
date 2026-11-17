import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSystem {
    ArrayList<Employee> employees;

    EmployeeSystem() {
        this.employees = new ArrayList<>();
    }

    void add(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee id: ");
        int id = scanner.nextInt();

        Employee employee = new Employee(name, id);
        this.employees.add(employee);
    }

    void remove(Scanner scanner) {
        System.out.print("Enter an index of employee: ");
        int id = scanner.nextInt();
        if (id < 0) {
            System.out.println("Index cannot be negative!");
        } else if (id >= this.employees.size()) {
            System.out.println("Index out of bounds!");
        } else {
            System.out.println("Successfully removed employee with id " + id);
            this.employees.remove(id);
        }
    }

    void display() {
        System.out.println("Employees details:");
        for (int i = 0; i < this.employees.size(); i++) {
            System.out.println(this.employees.get(i).id + ") " + this.employees.get(i).name);
        }
    }
}
