package threads.synchro;

public class TestBooking {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        BookingTread[] bookingTread = new BookingTread[12];

        for (int i =0 ; i < bookingTread.length ; i++){
            bookingTread[i] = new BookingTread(ticket);
        }

        for (int i = 0 ; i < bookingTread.length ; i++)
            bookingTread[i].start();
    }
}
