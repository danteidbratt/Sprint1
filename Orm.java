package healthypets;

import javax.swing.JOptionPane;

// Class Orm inherits class Djur.
public class Orm extends Djur{
    
    public Orm(String name, double weight){
        super(name, weight);
    }
    
    /**
     * Returns the proper amount of food (in grams).
     * @return 
     */
    @Override
    public int getDosage(){
        return 20;
    }
    
    /**
     * Returns the appropriate type of food.
     * @return 
     */
    @Override
    public String getFood(){
        return "ormpellets";
    }
    
    // This is an example of polymorfism.
    @Override
    public void printMe(){
        JOptionPane.showMessageDialog(null, getName() + " ska serveras " + getDosage() 
                                      + "g " + getFood() + ".");
    }
}