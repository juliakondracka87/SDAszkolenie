package pl.kondracka.hello;

import javax.swing.*;

public class nowyKalkulatorRat {
    public static void main(String[] args) {
        String iloscRat, kwota;
        Double rataR, iloscR, rataMiesieczna, prog1, prog2, prog3;
        do {
            kwota = JOptionPane.showInputDialog("Jaką kwotę chcesz pożyczyć (od 100 do 100 000zł): ");
            iloscRat = JOptionPane.showInputDialog("Na ile rat chcesz rozłożyć spłatę (od 6 do 48): ");
            rataR = Double.parseDouble(kwota);
            iloscR = Double.parseDouble(iloscRat);
            if (iloscR < 6 || iloscR > 48 || rataR < 100 || rataR > 100000) {
                System.out.println("Witaj Nowy Dzień");

            } else if (iloscR >= 6 && iloscR <= 40) {
                prog1 = ((rataR / iloscR) * 0.025) + (rataR / iloscR);
                JOptionPane.showMessageDialog(null, "Wysokość raty: " + prog1);


            }

        } while (iloscR <= 6 || iloscR >= 48 || rataR <= 100 || rataR >= 100000);

    }
}