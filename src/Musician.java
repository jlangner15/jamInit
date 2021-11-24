public class Musician {
    private String name;
    private int age;
    private String gender;

    public Musician(String Name, int Age, String Gender){
        if (!Name.equals("") && Age > 0 && !Gender.equals("N")) {
            name = Name;
            age = Age;
            gender = Gender;
        }
        else System.out.println("Please enter a valid musician");
    }

    public void changeName(String newName){
        if (newName.equals("")) System.out.println("Please enter a valid name");
        else name = newName;
    }

    public void changeAge(int newAge){
        if (newAge < age) age = newAge;
        else System.out.println("Age change must be older than previous age");
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public String getGender() {return gender;}


}
