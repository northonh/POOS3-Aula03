package exercicio;

import java.util.ArrayList;

public class Department {
    private String name;
    private int code;
    private String location;
    private int phoneExtension;
    private double budget;
    private Employee[] staff;
    private Employee chief;
    // Índice para controlar adição e remoção de empregrados
    private final int MAX_EMPLOYEES = 10;
    private int staffIdx;

    public Department(String name, int code, String location, int phoneExtension, double budget) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.phoneExtension = phoneExtension;
        this.budget = budget;
        staff = new Employee[MAX_EMPLOYEES];
        staffIdx = 0;
    }

    public void addEmployee(Employee e) {
        if (staffIdx < MAX_EMPLOYEES){
            staff[staffIdx++] = e;
        }
    }

    public void removeEmployee(Employee e) {
        removeEmployee(e.getId());
    }

    public void removeEmployee(long id) {
        for (int i = 0; i < staffIdx; i++) {
            if (staff[i].getId() == id) {
                staff[i].setDept(null);
                if (staff[i].getDeptInCharge() == this){
                    staff[i].setDeptInCharge(null);
                }

                for (int j = i; j < staffIdx - 1; j++) {
                    staff[j] = staff[j + 1];
                }
                staffIdx--;
                break;
            }
        }
    }

    public void listAllEmployees() {
        Employee e;
        for (int i = 0; i < staffIdx; i++) {
            e = staff[i];
            e.printState();
            System.out.println("Name = " + e.getName());
            System.out.println("Id = " + e.getId());
            System.out.println("Salary = " + e.getSalary());
            System.out.println("JobTitle = " + e.getJobTitle());
        }
    }
    public int sizeOfEmployees() {
        return staffIdx;
    }
    public Employee getEmployee(long id) {
        for (int i = 0; i < staffIdx; i++) {
            if (staff[i].getId() == id) {
                return staff[i];
            }
        }
        return null;
    }

    public Employee getChief() {
        return chief;
    }

    public void setChief(Employee chief) {
        this.chief = chief;
    }
}
