import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Singer extends Musician {
    private int yearsExperience;
    private Skill skill;
    private Set<Genres> genres = new HashSet<>();
    private ArrayList<String> roles = new ArrayList<>();
    private Set<String> influences = new HashSet<>();


    public Singer(int exp, String skl, String primaryRole, String name, int age, String gender){
        super(name, age, gender);
        yearsExperience = exp;
        roles.add(primaryRole);

        try{
            skill = Skill.valueOf(skl);
        } catch(Exception e) {
            System.out.print(skl + " is not a valid skill");
        }

        allSingers.addSinger(this);
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

    public void addRole(String role){
        roles.add(role);
    }

    public void removeRole(String role){
        int index = 0;
        for(int i = 0; i < 5; i++){
            if(roles.get(i) == role){
                index = i;
                roles.remove(index);
                break;
            }
        }
    }

    public ArrayList<String> getRoles() {return roles;}

    public void printRoles(){
        for(int i =0; i < roles.size(); i++){
            if( i != roles.size() - 1)
                System.out.print(roles.get(i) + ", ");
            else System.out.print(roles.get(i) + "\n");
        }
    }

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

    public static Singer getVoidSinger(){
        return new Singer(0, "Beginner", "backup", "temp", 0, "N");
    }

}
