import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Band {

    private HashMap<Genres, Integer> commonGenres = new HashMap<>(); //create hashmap matching genre to number of occurrences upon all members
    private Set<Musician> bandMembers = new HashSet<>();
    private String bandName;
    int numMembers;


    //get name of band and a single musician type
    public Band(String name, Drummer drummer, Bassist bassist, Guitarist guitarist){
        bandName = name;
        numMembers = 1;

        if(drummer != null){
            addDrummer(drummer);
        }

        if(bassist != null){
            addBassist(bassist);
        }

        if(guitarist != null){
            addGuitarist(guitarist);
        }
    }

    public void addBassist(Bassist b){
        bandMembers.add(b);
        numMembers++;

        //search the players genres
        for(Genres genre : b.getGenres()){
            //if its in the commonGenres hashset, increment number of occurrences, else, set it to 1
            if(commonGenres.containsKey(genre)){
                int temp = commonGenres.get(genre);
                temp++;
                commonGenres.replace(genre, temp);
            }
            else{
                commonGenres.put(genre, 1);
            }
        }
    }

    public void addDrummer(Drummer d){
        bandMembers.add(d);
        numMembers++;

        for(Genres genre : d.getGenres()){
            if(commonGenres.containsKey(genre)){
                int temp = commonGenres.get(genre);
                temp++;
                commonGenres.replace(genre, temp);
            }
            else{
                commonGenres.put(genre, 1);
            }
        }
    }

    public void addGuitarist(Guitarist g){
        bandMembers.add(g);
        numMembers++;

        for(Genres genre : g.getGenres()){
            if(commonGenres.containsKey(genre)){
                int temp = commonGenres.get(genre);
                temp++;
                commonGenres.replace(genre, temp);
            }
            else{
                commonGenres.put(genre, 1);
            }
        }
    }


    public void findGuitarist(){
        addGuitarist(allGuitarists.findGuitarist(commonGenres));
    }

    public void findBassist(){
        addBassist(allBassists.findBassist(commonGenres));
    }

    public void findDrummer(){
        addDrummer(allDrummers.findDrummer(commonGenres));
    }


    public HashMap<Genres, Integer> getCommonGenres(){
        return commonGenres;
    }

    public void printCommonGenres() {
        for(Genres genr : commonGenres.keySet()){
            System.out.println("Genre: " + genr.toString() + ", Matches: " + commonGenres.get(genr));
        }
    }


}
