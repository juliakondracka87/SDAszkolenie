package PraceDomowe;

import javax.swing.*;

public class StringMain {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Podaj swoje imię: ");
        String surname = JOptionPane.showInputDialog(null, "Podaj swoje nazwisko: ");
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(4);
        JOptionPane.showMessageDialog(null,"Nazywasz się " + name.charAt(0)+" "+surname.charAt(0));
    }
}
