import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class allBassists {
    public static Set<Bassist> bassist = new HashSet<>();
    int numBassists = 0;

    public static void removeBassist(Bassist g){
        bassist.remove(g);
    }

    public static void addBassist(Bassist b){
        bassist.add(b);
    }

    public static Set<Bassist> getBassists(){
        return bassist;
    }

    public static  Bassist findBassist(HashMap<Genres, Integer> bandGenres) {
        Set<Bassist> bassists = allBassists.getBassists();

        int maxSharedGenres = 0; //integer to count shared genres between each bassist and the band to find optimal candidate
        Bassist idealBassist = Bassist.getVoidBassist(); //Get a blank bassist to compare against

        //For every bassist check each genre for a match in the band's common genres
        for (Bassist bassist : bassists) {
            int matches = 0;
            for (Genres genre : bassist.getGenres()) {
                if (bandGenres.containsKey(genre)) matches++;
            }
            //If this candidate contains more matches than the most already, update the shared value and ideal bassist
            if (matches > maxSharedGenres) {
                maxSharedGenres = matches;
                idealBassist = bassist;
            }
        }

        //Check if bassist is the void one initialized earlier
        if (idealBassist.getGender().equals("N")) {
            return null;
        }
        return idealBassist;
    }

}
