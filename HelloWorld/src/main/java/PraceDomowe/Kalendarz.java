package PraceDomowe;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Kalendarz {
    public static void main(String[] args) {
       LocalDate date = LocalDate.now();//tworzymy obiekt kalendarza, który inicjujemy aktualną datą
       int month = date.getMonthValue();//pobieramy aktualny  miesiąc
       int today = date.getDayOfMonth(); //pobieramy aktualny dzień
       date = date.minusDays(today - 1);//ustawiamy zmienną date na pierwszy dzień misiąca
       DayOfWeek weekday = date.getDayOfWeek();//pobieramy dzień tygodania dla tej daty
       int value = weekday.getValue();//pobieramy numeryczna wartość dnia tygodnuia
               //zmienna weekday reprezentuje obiekt typu DayOfWeek

        System.out.println("Pn  Wt  Śr  Cz  Pt  So  N  ");
        for(int i = 1; i < value; i++){
            System.out.print("   ");}
        while (date.getMonthValue() == month){
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today){
                System.out.print("*");
            }
            else System.out.print("  ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
            if(date.getDayOfWeek().getValue() != 1){
                System.out.println();
            }
        }
    }
}
