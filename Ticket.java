public class Ticket {
    String ticketName;
    int numOfTickets;
    boolean vip;
    boolean discount;

    Ticket(){
    }

    Ticket(String ticketName, int numOfTickets, boolean vip, boolean discount){
        this.ticketName = ticketName;
        this.numOfTickets = numOfTickets;
        this.vip = vip;
        this.discount = discount;
    }

    public String getTicketName(){
        return ticketName;
    }

    public int getNumOfTickets(){
        return numOfTickets;
    }

    public boolean getVip(){
        return vip;
    }

    public boolean getDiscount(){
        return discount;
    }

    public String toString(){
        String str = "";
        str += "Type: " + getTicketName() + "\nMax Tickets: " + getNumOfTickets() + "\nVip: ";
        if(getVip() == true){
            str += "yes";
        } else {
            str += "no";
        }
        
        str += "\nDiscount: ";
        if(getDiscount() == true){
            str += "yes";
        } else {
            str += "no";
        }
        
        return str;
    }
}
