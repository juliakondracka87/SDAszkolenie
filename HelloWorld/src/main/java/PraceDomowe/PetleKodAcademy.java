package PraceDomowe;

import javax.swing.*;

public class PetleKodAcademy {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę 1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę 2"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę 3"));
        int max = 0;
        if(a>b){
            max = a;
        }
        else{
            max = b;
        }
        if(max > c){
            JOptionPane.showMessageDialog(null, "Największa liczba to: " + max);}

            else{
            JOptionPane.showMessageDialog(null, "Najwięksa liczba to: " + c);

        }
        String password;
        do {
            password = JOptionPane.showInputDialog(null, "Podaj poprawne hasło!!!");

        } while(!password.equals("Akademia"));
        JOptionPane.showMessageDialog(null,"Gratulacje, rozgryzłeś to!!");

    }
}
