import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements Details {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_dept;
    public void getDetails(){
        System.out.println();
        System.out.println("Employee ID : " + emp_id);
        System.out.println("Employee Name : " + emp_name);
        System.out.println("Employee Age : " + emp_age);
        System.out.println("Employee Department : " + emp_dept);
        System.out.println();

    }
    public void setDetails(){
        Scanner in = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id =String.valueOf(uuid);
        System.out.println("========================= *** ENTER EMPLOYEE DETAILS *** =========================");
        System.out.println();
        System.out.print("Enter Employee Name : ");
        emp_name = in.nextLine();
        System.out.println();
        System.out.print("Enter Employee Age : ");
        emp_age = in.nextInt();
        System.out.println();
        System.out.print("Enter Employee Department : ");
        emp_dept = in.nextLine();
        System.out.println();

    }
}
