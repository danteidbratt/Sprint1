package healthypets;

import javax.swing.JOptionPane;

public class Hund extends Djur{
    
    public Hund(String name, double weight){
        super(name, weight);
    }
    @Override
    protected int getDosage(){
        return (int)Math.round((getWeight() * 1000) / 100);
    }
    
    @Override
    public void printMe(){
        JOptionPane.showMessageDialog(null, getName() + " ska serveras " + getDosage() 
                                      + "g " + Food.HUND.foder + ".");
    }
}