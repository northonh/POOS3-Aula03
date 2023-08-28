package exercicio;

public class Main {
    public static void main(String[] args) {
        Department computacao = new Department(
                "Computação",
                1,
                "IFSP - São Carlos",
                16,
                1000
        );

        Employee employee1 = new Employee("Sérgio", 1, 1000, "Doctor");
        Employee employee2 = new Employee("Pedro", 2, 500, "Master");
        Employee employee3 = new Employee("José", 3, 250, "Graduated");

        // Relacionamento
        employee1.setDept(computacao);
        employee2.setDept(computacao);
        employee3.setDept(computacao);

        computacao.addEmployee(employee1);
        computacao.addEmployee(employee2);
        computacao.addEmployee(employee3);

        computacao.setChief(employee1);
        employee1.setDeptInCharge(computacao);

//        System.out.println("Employee number: " + computacao.sizeOfEmployees());
//        computacao.listAllEmployees();

        computacao.removeEmployee(employee2);
        computacao.removeEmployee(employee3.getId());
        computacao.addEmployee(new Employee("Maria", 55, 200, "Phd"));
        System.out.println("Employee number: " + computacao.sizeOfEmployees());
        computacao.listAllEmployees();
    }
}
