
import java.util.Scanner;
import java.lang.*;

interface Details {
    void getDetails();
    void setDetails();
}
public class Main {

    static void mainmenu(){
        System.out.println("================================ *** MAIN MENU *** ================================");
        System.out.println();
        System.out.println("============================ *** ENTER YOUR CHOICE *** ============================");
        System.out.println();
        System.out.println("1.] ADD SHOWROOM  \t\t\t\t  2.] ADD EMPLOYEE  \t\t\t\t  3.] ADD CAR");
        System.out.println();
        System.out.println("4.] GET SHOWROOM  \t\t\t\t  5.] GET EMPLOYEE  \t\t\t\t  6.] GET CAR");
        System.out.println();
        System.out.println("============================= *** ENTER 0 TO EXIT *** =============================");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employee[] employee = new Employee[5];
        Car[] car = new Car[5];
        int showroom_counter = 0;
        int emp_counter = 0;
        int car_counter = 0;
        int choice=10;
        while(choice!=0){

            mainmenu();
            choice=in.nextInt();
            while (choice!=9 && choice!=0){

                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].setDetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1.] ADD ANOTHER SHOWROOM");
                        System.out.println("9.] MAIN MENU");
                        System.out.println();
                        System.out.println("ENTER 0 TO EXIT");
                        choice = in.nextInt();
                        break;
                    case 2:
                        employee[emp_counter] = new Employee();
                        employee[emp_counter].setDetails();
                        emp_counter++;
                        System.out.println();
                        System.out.println("2.] ADD ANOTHER EMPLOYEE");
                        System.out.println("9.] MAIN MENU");
                        System.out.println();
                        System.out.println("ENTER 0 TO EXIT");
                        choice = in.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Car();
                        car[car_counter].setDetails();
                        car_counter++;
                        System.out.println();
                        System.out.println("3.] ADD ANOTHER CAR");
                        System.out.println("9.] MAIN MENU");
                        System.out.println();
                        System.out.println("ENTER 0 TO EXIT");
                        choice = in.nextInt();
                        break;
                    case 4:
                        for (int i= 0;i<showroom_counter;i++){
                            showroom[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9.] MAIN MENU");
                        System.out.println();
                        System.out.println("ENTER 0 TO EXIT");
                        choice = in.nextInt();
                        break;
                    case 5:
                        for (int i= 0;i<emp_counter;i++){
                            employee[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9.] MAIN MENU");
                        System.out.println();
                        System.out.println("ENTER 0 TO EXIT");
                        choice = in.nextInt();
                        break;
                    case 6:
                        for (int i= 0;i<car_counter;i++){
                            car[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9.] MAIN MENU");
                        System.out.println();
                        System.out.println("ENTER 0 TO EXIT");
                        choice = in.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE");
                        break;
                }
            }
        }
    }


}
