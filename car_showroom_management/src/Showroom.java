import java.sql.SQLOutput;
import java.util.Scanner;


public class Showroom implements Details {

    String Showroom_Name;
    String Showroom_Address;
    String Showroom_Manager;
    int total_emp;
    int total_cars = 0;

    @Override
    public void getDetails(){
        System.out.println();
        System.out.println("Showroom Name : " + Showroom_Name);
        System.out.println("Showroom Address : " + Showroom_Address);
        System.out.println("Showroom Manager : " + Showroom_Manager);
        System.out.println("Total No. of Employees : " + total_emp);
        System.out.println("Total No. of Cars in Stock : " + total_cars );
        System.out.println();
    }

    @Override
    public void setDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("========================= *** ENTER SHOWROOM DETAILS *** =========================");
        System.out.println();
        System.out.print("Showroom Name : " );
        Showroom_Name=in.nextLine();
        System.out.println();
        System.out.print("Showroom Address : " );
        Showroom_Address=in.nextLine();
        System.out.println();
        System.out.print("Showroom Manager : " );
        Showroom_Manager=in.nextLine();
        System.out.println();
        System.out.print("Total No. of Employees : ");
        total_emp=in.nextInt();
        System.out.println();
        System.out.print("Total No. of Cars in Stock : " );
        total_cars=in.nextInt();
        System.out.println();
    }
}
