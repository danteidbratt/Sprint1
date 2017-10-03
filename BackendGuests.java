package healthypets;

public class BackendGuests {
    
    // Creates all animals currently staying at the Hotel.
    private final Djur sixten = new Hund("Sixten", 5);
    private final Djur dogge = new Hund("Dogge", 10);
    private final Djur venus = new Katt("Venus", 5);
    private final Djur ove = new Katt("Ove", 3);
    private final Djur hypno = new Orm("Hypno", 1);
    
    /**
     * Creates and returns an array containing all animals.
     * @return array of type Eat (interface).
     */
    public Eat[] getGuests(){
        Eat[] guests = new Djur[5];
        guests[0] = sixten;
        guests[1] = dogge;
        guests[2] = venus;
        guests[3] = ove;
        guests[4] = hypno;
        return guests;
    }
}