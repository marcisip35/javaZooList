import java.util.ArrayList;

public class Animals {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    
    Animals(){
        animals.add(new Animal("Polar Bear", "Sam", 7));
        animals.add(new Animal("Tiger", "Max", 13));
        animals.add(new Animal("Grizzly Bear", "Georgia", 10));
        animals.add(new Animal("Panda", "Pamaang", 3));
    }
    
    public class Animal{
        String species;
        String name;
        int age;

        Animal(String species, String name, int age){
            this.species = species;
            this.name = name;
            this.age = age;
        }

        public String getSpecies(){
            return species;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String toString(){
            String str = "";
            str += "\nSpecies: " + getSpecies() + "\nName: " + getName() + "\nAge: " + getAge(); 
            return str;
        }
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < animals.size(); i++){
            str += animals.get(i).toString() + "\n";
        }
        return str;
    }
}
