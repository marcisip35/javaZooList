public class Contact {
    String email;
    long number;

    Contact(String email, long number){
        this.email = email;
        this.number = number;
    }

    public String getEmail(){
        return email;
    }

    public long getNumber(){
        return number;
    }

    public String toString(){
        String str = "";
        str += "\nEmail: " + getEmail() + "\nPhone: " + getNumber();
        return str;
    }
}
