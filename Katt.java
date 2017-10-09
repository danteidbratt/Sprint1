package healthypets;

import javax.swing.JOptionPane;

public class Katt extends Djur{

    public Katt(String namn, double vikt){
        super(namn, vikt);
    }
    @Override
    protected int getDosage(){
        return (int)Math.round((getWeight() * 1000) / 150);
    }
    
    @Override
    public void printMe(){
        JOptionPane.showMessageDialog(null, getName() + " ska serveras " + getDosage() 
                                      + "g " + Food.KATT.foder + ".");
    }
}