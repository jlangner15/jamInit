import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class allGuitarists {
    public static Set<Guitarist> guitarists = new HashSet<>();
    int numGuitarists = 0;

    public static void removeGuitarist(Guitarist g){
        guitarists.remove(g);
    }

    public static void addGuitarist(Guitarist g){
        guitarists.add(g);
    }

    public static Set<Guitarist> getGuitarists(){
        return guitarists;
    }

    public static  Guitarist findGuitarist(HashMap<Genres, Integer> bandGenres){
        Set<Guitarist> label = allGuitarists.getGuitarists();
        int maxSharedGenres = 0;
        Guitarist idealGuitarist = Guitarist.getVoidGuitarist();

        for(Guitarist guitarist : label){
            int matches = 0;
            for(Genres genre : guitarist.getGenres()){
                if(bandGenres.containsKey(genre)) matches++;
            }
            if(matches > maxSharedGenres){
                maxSharedGenres = matches;
                idealGuitarist = guitarist;
            }
        }

        if (idealGuitarist.getGender() == "N"){
            return null;
        }
        return idealGuitarist;

    }


}
