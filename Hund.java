package healthypets;

import javax.swing.JOptionPane;

// Class Hund inherits class Djur.
public class Hund extends Djur{
    
    public Hund(String name, double weight){
        super(name, weight);
    }
    // All methods in this Class P
    
    /**
     * Returns the proper amount of food (in grams).
     * @return 
     */
    @Override
    protected int getDosage(){
        return (int)Math.round((getWeight() * 1000) / 100);
    }
    
    /**
     * Returns the appropriate type of food.
     * @return 
     */
    @Override
    protected String getFood(){
        return "hundfoder";
    }
    
    // This is an example of polymorfism.
    @Override
    public void printMe(){
        JOptionPane.showMessageDialog(null, getName() + " ska serveras " + getDosage() 
                                      + "g " + getFood() + ".");
    }
}