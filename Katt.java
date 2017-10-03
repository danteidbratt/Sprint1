package healthypets;

import javax.swing.JOptionPane;

// Class Katt inherits Djur.
public class Katt extends Djur{

    public Katt(String namn, double vikt){
        super(namn, vikt);
    }
    
    /**
     * Returns the proper amount of food (in grams).
     * @return 
     */
    @Override
    public int getDosage(){
        return (int)Math.round((getWeight() * 1000) / 150);
    }
    
    /**
     * Returns the appropriate type of food.
     * @return 
     */
    @Override
    public String getFood(){
        return "kattfoder";
    }
    
    // This is an example of polymorfism.
    @Override
    public void printMe(){
        JOptionPane.showMessageDialog(null, getName() + " ska serveras " + getDosage() 
                                      + "g " + getFood() + ".");
    }
}