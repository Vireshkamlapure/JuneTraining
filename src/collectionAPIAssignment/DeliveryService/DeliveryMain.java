package collectionAPIAssignment.DeliveryService;

import java.util.Scanner;

public class DeliveryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestDelivery testDelivery = new TestDelivery();
        int choice = 0;
        do{
            System.out.println("1.Add city 2.Show City List 3.Check delivery available 4.Remove city 0.Exit");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){

                case 1:
                    try {
                        System.out.println("Enter Delivery status and city Name : ");
                        testDelivery.addCity(scanner.nextLine());
                        System.out.println("City Added. ");
                    } catch (DuplicateCityException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    testDelivery.displayAllCities();
                    break;

                case 3:
                    System.out.println("Enter city Name : ");
                    testDelivery.checkDelivery(scanner.nextLine());
                    break;

                case 4:
                    System.out.println("Enter city Name : ");
                    testDelivery.removeCity(scanner.nextLine());
                    break;
            }
        }while(choice != 0);
    }
}
