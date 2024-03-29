public class Musician {
    private String name;
    private int age;
    private String gender;
    private boolean valid = false;

    public Musician(String Name, int Age, String Gender){
        if (!Name.equals("") && Age > 0) {
            name = Name;
            age = Age;
            gender = Gender;
            valid = true;
        }
    }

    public void changeName(String newName){
        if (newName.equals("") && valid) System.out.println("Please enter a valid name");
        else name = newName;
    }

    public void changeAge(int newAge){
        if (newAge > age && valid) age = newAge;
        else System.out.println("Please enter a valid age");
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public String getGender() {return gender;}

    public boolean isValid(){return valid;}

    public void makeInvalid() {
        valid = false;
        name = null;
        age = 0;
        gender = null;
    }


}
