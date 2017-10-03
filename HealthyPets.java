package healthypets;

import javax.swing.JOptionPane;

public class HealthyPets {

    public static void main(String[] args) {
        // Creates an object of this class.
        HealthyPets go = new HealthyPets();
        // Calling method timeToEat.
        go.timeToEat();
    }

    /**
     * This method will ask the user to input the name of a guest who needs to
     * be fed. The method will then tell the user which amount and which kind of
     * food the guest ought to be fed.
     */
    public void timeToEat() {
        // Creates an object of BackendGuest (database).
        BackendGuests bg = new BackendGuests();
        // Takes array containing guests från BackendGuests (database).
        Eat[] guests = bg.getGuests();

        while (true) {
            boolean found = false;
            String s = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            if (s == null || s.equals("")) {
                break;
            }
            s = s.trim();
            s = s.toLowerCase();

            for (Eat x : guests) {
                // Checks if chosen name matches any guests name.
                if (s.equals(x.getName().toLowerCase())) {
                    // Prints dietary information of chosen guest.
                    x.printMe();
                    found = true;
                }
            }
            if (found == false) {
                JOptionPane.showMessageDialog(null, "Gäst ej funnen.");
            }
        }
    }
}
