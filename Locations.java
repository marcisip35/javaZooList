import java.util.ArrayList;

public class Locations {
    ArrayList<Location> locations = new ArrayList<Location>();

    Locations(){
        locations.add(new Location("Canada","Winnipepg","90 Acres",3,true));
        locations.add(new Location("Canada","Toronto","200 Acres", 5, true));
        locations.add(new Location("Canada","Vancouver","180 Acres", 2,false));
        locations.add(new Location("United States","Chicago","300 Acres",4,true));
    }
    
    public class Location {
        String country;
        String city;
        String size;
        int rating;
        boolean open;

        Location(String country, String city, String size, int rating, boolean open){
            this.country = country;
            this.city = city;
            this.size = size;
            this.rating = rating;
            this.open = open;
        }

        public String getCountry(){
            return country;
        }

        public String getCity(){
            return city;
        }

        public String getSize(){
            return size;
        }

        public int getRating(){
            return rating;
        }

        public boolean getOpen(){
            return open;
        }

        public String toString(){
            String str = "";
            str += "\nCountry: " + getCountry() + "\nCity: " + getCity() + "\nSize: " + getSize() + "\nRating: " + getRating() + "/5\nOpen?: ";
            if(getOpen()){
                str += "Yes";
            } else {
                str += "No";
            }
            return str;
        }
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < locations.size(); i++){
            str += locations.get(i).toString() + "\n";
        }
        return str;
    }
}
