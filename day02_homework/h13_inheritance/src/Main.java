public class Main {
    public static void main(String[] args) {
        Costumer costumer = new Costumer();
        costumer.firstName = "Veli";
        System.out.println( costumer.firstName);

        Employee employee = new Employee();
        employee.firstName = "Engin";
        System.out.println(employee.firstName);

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.BestEmployee();
    }
}