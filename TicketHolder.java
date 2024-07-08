public class TicketHolder {
    Ticket ticket;
    int numOfGuests;
    Guests guests;

    TicketHolder(Ticket ticket,int numOfGuests,Guests guests){
        this.ticket = ticket;
        this.numOfGuests = numOfGuests;
        this.guests = guests;
    }

    public String toString(){
        String str = "\n";
        str += "Ticket Type\n----------\n" + ticket.toString() + "\nNumber of Guests: " + numOfGuests + "\n\nGuests\n----------" + guests.toString();
        return str;
    }
}
