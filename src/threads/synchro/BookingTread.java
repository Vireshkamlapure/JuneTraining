package threads.synchro;

public class BookingTread extends Thread {

    Ticket ticket;

    public BookingTread(Ticket ticket ){
        this.ticket = ticket;
    }

    @Override
    public void run(){
        ticket.bookTicket(getName());
    }
}
