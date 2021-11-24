import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class allSingers {
    public static Set<Singer> singers = new HashSet<>();
    int numSingers = 0;

    public static void removeSinger(Singer s){
        singers.remove(s);
    }

    public static void addSinger(Singer s){
        singers.add(s);
    }

    public static Set<Singer> getSingers(){
        return singers;
    }

    public static  Singer findSinger(HashMap<Genres, Integer> bandGenres, int minExp, Skill skill){
        Set<Singer> label = getSingers();
        int maxSharedGenres = 0;
        Singer idealSinger = Singer.getVoidSinger();

        for(Singer singer : label){
            int matches = 0;
            if (singer.getSkill() == skill && singer.getExperience() >= minExp){
                for(Genres genre : singer.getGenres()){
                    if(bandGenres.containsKey(genre)) matches++;
                }
                if(matches > maxSharedGenres){
                    maxSharedGenres = matches;
                    idealSinger = singer;
                }
            }
        }
        return idealSinger;

    }


}
