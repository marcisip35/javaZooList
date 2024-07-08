import java.util.ArrayList;

public class Guests {
    ArrayList<Guest> guests = new ArrayList<Guest>();
    
    Guests(){
       
    }

    public void addGuest(String name, int age){
        guests.add(new Guest(name,age));
    }

    public class Guest{
        public String name;
        public int age;
        
        Guest(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }
    }

    public String toString(){
        String str = "";
        String name = "";
        int age = 0;
        for(int i = 0; i < guests.size(); i++){
            name = guests.get(i).getName();
            age = guests.get(i).getAge();
            str += "\nName: " + name + "\nAge: " + age + "\n";
        }
        return str;
    }
}
