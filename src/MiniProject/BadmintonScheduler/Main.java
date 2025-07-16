package MiniProject.BadmintonScheduler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hardcode an array or list of 5–6 `Batch` objects with unique time slots and varying
        //availability.

        Batch[] batches = new Batch[5];

        Scanner scanner = new Scanner(System.in);
        int slotTime = 3;
        for (int i = 0; i < batches.length; i++) {
            batches[i] = new Batch((slotTime + " PM " + (slotTime + 1) + " PM "), (int) (Math.random() * 10) + 1);
            slotTime++;
        }

        System.out.println("How many users are operating :");
        User[] users = new User[Integer.parseInt(scanner.nextLine())];
        System.out.println("Enter Name of each user : ");
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(scanner.nextLine());
        }

        for (User user : users) {
            System.out.println(user.name);
        }

        int choice;
        do {

            System.out.println("Available Batches : ");
            for (int i = 0; i < batches.length; i++) {
                System.out.print("Batch no :" + (i + 1) + "\t");
                batches[i].display();
            }

            System.out.println("Which User is accessing : ");
            String name = scanner.nextLine();
            int id = findIndex(users, name);
            System.out.println("Name : " + name + " Index : " + id);
            choice = 0;

            System.out.println("1.Book Appointment 2.Cancel Appointment 0.Exit");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:

                    System.out.println("Enter Which batch you want to book appointment : ");
                    int slot = Integer.parseInt(scanner.nextLine());

                    if (batches[slot - 1].spots > 0 && users[id].bookSlot(name, slot)) {
                        batches[slot - 1].spots--;
                    } else {
                        System.out.println("You aldready Have booking.");
                    }

                    System.out.println("The user : " + users[id].name);
                    System.out.println("Slot booked : " + users[id].bookedBatchIndex);
                    break;

                case 2:
                    if (users[id].bookedBatchIndex > 0) {
                        batches[users[id].bookedBatchIndex - 1].spots++;
                        users[id].cancelSlot();
                    } else
                        System.out.println("You have no present appointment");
                    break;

            }

        } while (choice != 0);
    }


    public static int findIndex(User[] users, String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(name)) {
                return i; // Return the index if found
            }
        }
        return -1;
    }

}
