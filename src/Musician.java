public class Musician {
    private String name;
    private int age;
    private String gender;

    public Musician(String Name, int Age, String Gender){
        name = Name;
        age = Age;
        gender = Gender;
    }

    public void changeName(String newName){
        name = newName;
    }

    public void changeAge(int newAge){
        age = newAge;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public String getGender() {return gender;}


}
