package healthypets;

// Class Djur implements interface Eat.
abstract public class Djur implements Eat{
    
    // Incapsulated varibles.
    private double weight;
    private String name;
    
    /**
     * 
     * @param name Give name of animal.
     * @param weight Give weight of animal.
     */
    protected Djur(String name, double weight){
        setName(name);
        setWeight(weight);
    }
    
    // Assigns values to incapsulated variables.
    private void setWeight(double weight){
        this.weight = weight;
    }
    private void setName(String name){
        this.name = name;
    }
    
    protected double getWeight(){
        return weight;
    }
    
    abstract protected int getDosage();
    
    // Methods override interface methods.
    @Override
    public String getName(){
        return name;
    }
    // This is an example of dynamic binding.
    @Override
    public void printMe(){}
}