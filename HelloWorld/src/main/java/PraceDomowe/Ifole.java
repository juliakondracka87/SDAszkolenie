package PraceDomowe;

import javax.swing.*;

public class Ifole {
    public static void main(String[] args) {
        String name = "Julia";
        name = JOptionPane.showInputDialog(null, "Podaj sowje imię:");
        int length = name.length();
        char lastLetter = name.charAt(length - 1);
            if(lastLetter == 'a'){
                JOptionPane.showMessageDialog(null,"Jesteś kobietą!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Jesteś mężczyzną");
            }

        int age = 33;
        if(age >= 18){
            JOptionPane.showMessageDialog(null, "Jesteś osobą pełnoletnią.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Jesteś dzieckiem!");
        }
    }
}
