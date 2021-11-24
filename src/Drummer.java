import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Drummer extends Musician {
    private int yearsExperience;
    private Skill skill;
    private Set<Genres> genres = new HashSet<>();
    private Set<String> influences = new HashSet<>();


    public Drummer(int exp, String skl, String name, int age, String gender) {
        super(name, age, gender);
        if (exp >= 0 && super.isValid()) {

            yearsExperience = exp;

            try {
                skill = Skill.valueOf(skl);
            } catch (Exception e) {
                System.out.print(skl + " is not a valid skill");
                super.makeInvalid();
            }

            allDrummers.addDrummer(this);
        } else super.makeInvalid();
    }

    public void changeExperience(int newExp){
        yearsExperience = newExp;
    }

    public int getExperience(){return yearsExperience;}

    public void printExperience(){System.out.println(super.getName() + " has " + yearsExperience + " experience");}

    public void changeSkill(String newSkill){
        try {
            skill = Skill.valueOf(newSkill);
        } catch(Exception e){
            System.out.print(newSkill + " is not a valid skill, try again");
        }
    }

    public Skill getSkill(){return skill;}

    public void printSkill(){System.out.println(super.getName() + " skill level is " + skill);}

    public void addInfluences(String artist){
        influences.add(artist);
    }

    public void removeInfluence(String artist){
        try{
            influences.remove(artist);
        } catch(Exception e){
            System.out.print("Artist is not an influence");
        }
    }

    public Set<String> getInfluences() {return influences;}

    public void printInfluences(){
        for(String i : influences){
            System.out.print(influences.contains(i) + ", ");
        }
    }

    public void pickGenres(String input){
        String[] g = input.split(" ");
        for(int i = 0; i < g.length; i++){
            try {
                genres.add(Genres.valueOf(g[i]));
            } catch(Exception e){
                System.out.println(g[i] + "is not a valid genre");
            }
        }
    }

    public void addGenre(String input){
        try {
            genres.add(Genres.valueOf(input));
        } catch(Exception e){
            System.out.println("Please enter a valid genre");
        }
    }

    public void removeGenre(String input){
        try {
            genres.remove(Genres.valueOf(input));
        } catch(Exception e){
            System.out.println("Please enter a valid genre");
        }
    }

    public void printGenres(){
        for(Genres g : genres){
            System.out.print(g + " ");
        }
        System.out.print("\n");
    }

    public Set<Genres> getGenres(){
        return genres;
    }

    public static Drummer getVoidDrummer(){
        return new Drummer(0, "Beginner", "temp", 0, "N");
    }

}
