package threads.synchro;

public class Ticket {
    int ticket = 10;

    public synchronized void bookTicket(String name){
        System.out.println("=====================================================");

        System.out.println("Booking a ticket for " + name);

        if (ticket > 0){
            ticket--;
            System.out.println("Ticket is booked for : " + name);
            System.out.println("Tickets available : "+ticket);
        }
        else
            System.out.println("Tickets Sold out !!!");

        System.out.println("=====================================================");

    }

}
