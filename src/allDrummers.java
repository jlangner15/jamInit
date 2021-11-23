import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class allDrummers {
    public static Set<Drummer> drummers = new HashSet<>();
    int numDrummers = 0;

    public static void removeDrummers(Drummer d){
        drummers.remove(d);
    }

    public static void addDrummer(Drummer d){
        drummers.add(d);
    }

    public static Set<Drummer> getGuitarists(){
        return drummers;
    }

    public static  Drummer findDrummer(HashMap<Genres, Integer> bandGenres, int minExp, Skill skill){
        Set<Drummer> label = allDrummers.getGuitarists();
        int maxSharedGenres = 0;
        Drummer idealDrummer = Drummer.getVoidDrummer();

        for(Drummer drummer : label){
            int matches = 0;

            if (drummer.getSkill() == skill && drummer.getExperience() >= minExp) {
                for (Genres genre : drummer.getGenres()) {
                    if (bandGenres.containsKey(genre)) matches++;
                }
                if (matches > maxSharedGenres) {
                    maxSharedGenres = matches;
                    idealDrummer = drummer;
                }
            }
        }

        if (idealDrummer.getGender().equals("N")){
            return null;
        }
        return idealDrummer;
    }

}
