import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Band {

    private HashMap<Genres, Integer> commonGenres = new HashMap<>(); //create hashmap matching genre to number of occurrences upon all members
    private Set<Musician> bandMembers = new HashSet<>();
    private String bandName;
    private int numMembers;


    //get name of band and a single musician type
    public Band(String name, Drummer drummer, Bassist bassist, Guitarist guitarist, Singer singer){
        bandName = name;
        if (!name.equals("") && (drummer != null || bassist != null || guitarist != null || singer != null)) {
            if (drummer != null) {
                addDrummer(drummer);
            }

            if (bassist != null) {
                addBassist(bassist);

            }

            if (guitarist != null) {
                addGuitarist(guitarist);
            }

            if (singer != null) {
                addSinger(singer);
            }
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

    public void addSinger(Singer s){
        bandMembers.add(s);
        numMembers++;

        for(Genres genre : s.getGenres()){
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


    public void findGuitarist(int exp, Skill skill){
        Guitarist potentialGuitarist = allGuitarists.findGuitarist(commonGenres, exp, skill);

        assert potentialGuitarist != null;
        //Check that guitarist isn't void guitarist
        if (!potentialGuitarist.getGender().equals("N")) addGuitarist(potentialGuitarist);
    }

    public void findBassist(int exp, Skill skill){
        Bassist potentialbassist = allBassists.findBassist(commonGenres, exp, skill);

        assert potentialbassist != null;
        //Check that guitarist isn't void guitarist
        if (!potentialbassist.getGender().equals("N")) addBassist(potentialbassist);
    }

    public void findDrummer(int exp, Skill skill){
        Drummer potentialDrummer = allDrummers.findDrummer(commonGenres, exp, skill);

        assert potentialDrummer != null;
        if (!potentialDrummer.getGender().equals("N")) addDrummer(potentialDrummer);
    }


    public HashMap<Genres, Integer> getCommonGenres(){
        return commonGenres;
    }

    public void printCommonGenres() {
        for(Genres genr : commonGenres.keySet()){
            System.out.println("Genre: " + genr.toString() + ", Matches: " + commonGenres.get(genr));
        }
    }

    public Set<Musician> getBandMembers(){
        return bandMembers;
    }

    public int getNumMembers(){return numMembers;}

}
