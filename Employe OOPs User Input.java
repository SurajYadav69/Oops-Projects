import java.util.Scanner;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void getInfo() {
        System.out.println("The Salary Of Employee Is:- " + this.salary);
        System.out.println("The Name Of Employee Is:- " + this.name);
    }
}

public class OOPS_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.println("Enter The Name Of Employee: ");
        e1.name = sc.nextLine();
        System.out.println("Enter The Salary Of Employee: ");
        e1.salary = sc.nextInt();

        e1.getInfo();
        sc.close();
    }
}
