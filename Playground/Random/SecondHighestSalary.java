import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class SecondHighestSalary {

    public static void main(String[] args) {
        Employee e1 = new Employee("Rohan", 500);
        Employee e2 = new Employee("Mohan", 600);
        Employee e3 = new Employee("Sohan", 400);
        Employee e4 = new Employee("Yohan", 700);

        List<Employee> listOfEmployees = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));

        Double secondHighestSalary = listOfEmployees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst().get()
                .getSalary();
        System.out.println("Second Highest Salary: " + secondHighestSalary);
    }
}