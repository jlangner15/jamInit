public class main {

    public static void main(String[] args){

        Guitarist Jimmy = new Guitarist(4,"Professional", "lead", "Jimmy", 27, "M");
        Bassist Jeremy = new Bassist(1,"Intermediate", "bass", "Jeremy", 20, "M");
        Drummer John = new Drummer(15, "Professional", "drummer", "bonzo", 30, "M");
        Guitarist Tony = new Guitarist(10,"Professional", "lead", "Tony", 20, "M");

        Jimmy.addGenre("Rock");
        Jimmy.addGenre("Folk");
        Jimmy.addGenre("Blues");

        Tony.addGenre("Metal");

        Jeremy.addGenre("Rock");
        Jeremy.addGenre("Alternative");
        Jeremy.addGenre("Blues");

        John.addGenre("Rock");

        //startBand ZedLeppelin = new startBand("ZepLeppelin",null,Jeremy, null);
        //Jeremy.startBand();

        Band ZedLeppelin = new Band("Zed Leppelin", null, Jeremy, null);

        //allGuitarists guitarists = new allGuitarists();
        //allGuitarists.addGuitarist(Jimmy);
        //allGuitarists.addGuitarist(Tony);


        ZedLeppelin.findDrummer();
        ZedLeppelin.findGuitarist();

        System.out.println(ZedLeppelin.numMembers);
        //System.out.println(ZedLeppelin.getCommonGenres());
        //System.out.println(startBand.findGuitarist(ZedLeppelin.getCommonGenres()).getName());


    }

}
