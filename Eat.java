package healthypets;

public interface Eat {
    
    /**
     * Prints a message showing how much food a given animal should be fed.
     */
    public void printMe();
    
    /**
     * Returns a string containing the name of given animal.
     * @return 
     */
    public String getName();
}