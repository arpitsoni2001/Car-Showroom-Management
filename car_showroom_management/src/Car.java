import java.util.Scanner;
import java.sql.SQLOutput;

public class Car extends Showroom implements Details {
    String car_company;
    String car_name;
    int car_model;
    String car_trans;
    String fuel_type;
    int car_price;

    public void getDetails(){
        System.out.println();
        System.out.println("Car's Company : " + car_company);
        System.out.println("Car's Name : " + car_name);
        System.out.println("Car's Model (Year) : " + car_model);
        System.out.println("Car's Transmission Type : " + car_trans);
        System.out.println("Car's Fuel Type : " + fuel_type);
        System.out.println("Car's Price : Rs." + car_price);
    }
    public void setDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("========================= *** ENTER CAR DETAILS *** =========================");
        System.out.println();
        System.out.print("Enter Car's Company Name : ");
        car_company=in.nextLine();
        System.out.println();
        System.out.print("Enter Car's Name : ");
        car_name=in.nextLine();
        System.out.println();
        System.out.print("Enter Car's Model (Year) : ");
        car_model = in.nextInt();
        System.out.println();
        System.out.print("Enter Car's Transmission Type : ");
        car_trans=in.nextLine();
        System.out.println();
        System.out.print("Enter Car's Fuel Type : ");
        fuel_type=in.nextLine();
        System.out.println();
        System.out.print("Enter Car's Price (In Rupees) : ");
        car_price=in.nextInt();
        System.out.println();
        total_cars++;
    }
}
