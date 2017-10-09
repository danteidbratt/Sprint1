package healthypets;

import javax.swing.JOptionPane;

public class Orm extends Djur{
    
    public Orm(String name, double weight){
        super(name, weight);
    }
    
    @Override
    protected int getDosage(){
        return 20;
    }
    
    @Override
    public void printMe(){
        JOptionPane.showMessageDialog(null, getName() + " ska serveras " + getDosage() 
                                      + "g " + Food.ORM.foder + ".");
    }
}