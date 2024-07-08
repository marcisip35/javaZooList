import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean exit = false;

    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        menuStatement();
        showSelectedMenu(selectedMenu());
    }

    public static void menuStatement() {
        System.out.println(
                "\nZoo Menu \n1. Rates (Buy Tickets Here!) \n2. Hours \n3. Animals \n4. Locations \n5. Contact Info \n6. Exit");
    }

    public static String selectedMenu() {
        System.out.print("Select a page by typing out the name or number of the page: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        return input;
    }

    public static void showSelectedMenu(String selected) {

        if (selected.equals("1") || selected.equalsIgnoreCase("Rates")) {
            ratesMenu();
        } else if (selected.equals("2") || selected.equalsIgnoreCase("Hours")) {
            hoursMenu();
        } else if (selected.equals("3") || selected.equalsIgnoreCase("Animals")) {
            animalsMenu();
        } else if (selected.equals("4") || selected.equalsIgnoreCase("Locations")) {
            locationsMenu();
        } else if (selected.equals("5") || selected.equalsIgnoreCase("Contact Info")) {
            contactMenu();
        } else if (selected.equals("6") || selected.equalsIgnoreCase("Exit")) {
            System.out.println("Exiting Program...");
        } else {
            System.out.println("\n\nInvalid input please try again");
            runProgram();
        }
    }

    public static void ratesMenu() {
        Scanner inputScanner = new Scanner(System.in);
        String input;
        Rates rates = new Rates();

        System.out.println("\nRates (all rates are for the day pass)\n----------" + rates.toString());
        System.out.print(
                "Select a ticket by typing the ticket name type or it's corresponding number (type \"Home\" to go back to the Main Menu) or type anything to exit the program: ");
        input = inputScanner.nextLine();

        if (input.equalsIgnoreCase("Home")) {
            runProgram();
        } else if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("Single")) {
            Ticket ticket = rates.getSingleTicket();
            int numOfGuests = howManyGuests(ticket.getNumOfTickets(), ticket);
            Guests guests = userInput(numOfGuests);
            TicketHolder ticketHolder = new TicketHolder(ticket, numOfGuests, guests);
            System.out.println(ticketHolder.toString());
            System.out.println("Thank you for your purchase, see you then!");
        } else if (input.equalsIgnoreCase("2") || input.equalsIgnoreCase("Family")) {
            Ticket ticket = rates.getFamilyTicket();
            int numOfGuests = howManyGuests(ticket.getNumOfTickets(), ticket);
            Guests guests = userInput(numOfGuests);
            TicketHolder ticketHolder = new TicketHolder(ticket, numOfGuests, guests);
            System.out.println(ticketHolder.toString());
            System.out.println("Thank you for your purchase, see you then!");
        } else if (input.equalsIgnoreCase("3") || input.equalsIgnoreCase("Vip")) {
            Ticket ticket = rates.getVipTicket();
            int numOfGuests = howManyGuests(ticket.getNumOfTickets(), ticket);
            Guests guests = userInput(numOfGuests);
            TicketHolder ticketHolder = new TicketHolder(ticket, numOfGuests, guests);
            System.out.println(ticketHolder.toString());
            System.out.println("Thank you for your purchase, see you then!");
        } else {
            inputScanner.close();
            System.out.println("Exiting Program....");
        }
    }

    public static int howManyGuests(int guestMax, Ticket ticket) {
        Scanner inputScanner = new Scanner(System.in);
        int input;
        int numOfGuest = 0;

        if (ticket.getTicketName().equals("Single") || ticket.getTicketName().equals("Vip")) {
            System.out.println("----------\nYou have selected a " + ticket.getTicketName() + " ticket, you qualify for "
                    + guestMax + " ticket.");
            numOfGuest = 1;
        } else {
            System.out.print(
                    "----------\nYou have selected a " + ticket.getTicketName() + " ticket bundle, you qualify for "
                            + guestMax + " tickets. Please specify how many guests you want to add: ");
            input = Integer.parseInt(inputScanner.nextLine());

            if (input <= guestMax && input != 0) {
                numOfGuest = input;
            } else {
                System.out.println("\n !Invalid Input! Try again");
                numOfGuest = howManyGuests(guestMax, ticket);
            }
        }

        return numOfGuest;
    }

    public static Guests userInput(int numOfGuests) {
        Guests guests = new Guests();
        Scanner inputScanner = new Scanner(System.in);
        String input = "";
        String[] inputArray;
        String name;
        int age = 0;
        boolean validName;
        boolean validAge;
        boolean valid = false;

        if (numOfGuests <= 1) {
            System.out.println("Please fill out the required information, type name then age, e.g.(Alexander,21):");
        } else {
            System.out.println(
                    "Please fiil out the required information for each guest, type name then age, e.g.(Alexander,21)");
        }

        for (int i = 0; i < numOfGuests; i++) {
            System.out.print("\nGuest " + (i + 1) + "(name,age):");
            input = inputScanner.nextLine();
            inputArray = input.split(",");
            name = inputArray[0];
            try{
                age = Integer.parseInt(inputArray[1]);
                validAge = true;
            } catch (Exception e){
                validAge = false;
            }

            try {
                Integer.parseInt(inputArray[0]);
                validName = false;
            } catch (Exception e){
                validName = true;
            }

            if(validName && validAge){
                valid = true;
            } else {
                valid = false;
            }

            if(!valid){
                System.out.println("!Guests unsuccessfully added please make sure to type the name and age correctly (name,age)");
                guests = userInput(numOfGuests);
            } else {
                guests.addGuest(name, age);
                System.out.println("Guest successfully added");
            }

        }
        return guests;
    }

    public static void hoursMenu() {
        Scanner inputScanner = new Scanner(System.in);
        String input;
        Hours hours = new Hours();
        System.out.println(hours.toString());
        System.out.print("\nType \"Home\" to return to the Main Menu or type anything to exit the program: ");
        input = inputScanner.nextLine();

        // 1. Choose Ticket
        // 2. Choose the Location
        // 3. Choose the Day
        // 4. Fill out the information of the customers
        // 5. Get a print of the ticket info

        if (input.equalsIgnoreCase("Home")) {
            runProgram();
        } else {
            inputScanner.close();
            System.out.println("Exiting Program...");
        }

        inputScanner.close();
    }

    public static void animalsMenu() {
        Scanner inputScanner = new Scanner(System.in);
        String input = "";
        Animals animals = new Animals();
        System.out.println("\nAnimals: \n---------" + animals.toString());
        System.out.print("Type \"Home\" to return to the Main Menu or type anything to exit the program: ");
        input = inputScanner.nextLine();

        if (input.equalsIgnoreCase("Home")) {
            runProgram();
        } else {
            inputScanner.close();
            System.out.println("Exiting Program...");
        }
    }

    public static void locationsMenu() {
        Scanner inputScanner = new Scanner(System.in);
        String input = "";
        Locations locations = new Locations();
        System.out.println("\nLocations\n----------" + locations.toString());
        System.out.print("Type \"Home\" to return to the Main Menu or type anything to exit the program: ");
        input = inputScanner.nextLine();

        if (input.equalsIgnoreCase("Home")) {
            runProgram();
        } else {
            inputScanner.close();
            System.out.println("Exiting the program...");
        }
    }

    public static void contactMenu() {
        Scanner inputScanner = new Scanner(System.in);
        String input = "";
        System.out.print("\nContact\n----------");
        Contact contact = new Contact("zooworld@contactsupport.com", 18005213455L);
        System.out.print(contact.toString()
                + "\nType \\\"Home\\\" to return to the Main Menu or type anything to exit the program: ");
        input = inputScanner.nextLine();

        if (input.equalsIgnoreCase("Home")) {
            runProgram();
        } else {
            inputScanner.close();
            System.out.println("Exiting the program..");
        }
    }

}