import java.util.Scanner;

class employee {
    String name;
    int id_no;
    float salary;

 public 
    employee(String name, int id_no, float salary) {
        this.name = name;
        this.id_no = id_no;
        this.salary = salary;

    }

    void display() {
        System.out.println();
        System.out.println("Name of employee is : " + name);
        System.out.println("Id is : " + id_no);
        System.out.println("Salary given to him is : " + salary);
    }

}

public class Constructor {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details :(Name) (Id) (Salary) ");
        String name = sc.nextLine();
        int id = sc.nextInt();
        float salary = sc.nextFloat();

        employee emp = new employee(name, id, salary);
        emp.display();

    }
}
