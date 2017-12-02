package PraceDomowe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
    int counter = 0;

    public TicTacToe() {
        setSize(700, 700);
        setVisible(true);
        setTitle("Kółko i krzyżyk");
        setLayout(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(" []  ");
            add(button);
            button.addActionListener(new ActionListener() {
                                         @Override
                                         public void actionPerformed(ActionEvent e) {
                                             JButton button = (JButton) e.getSource();
                                             if (counter % 2 == 0) {
                                                 button.setText("x");
                                                 System.out.println("x");
                                             } else {
                                                 button.setText("o");
                                                 System.out.println("o");
                                             }
                                             button.setEnabled(false);
                                             counter++;

                                         }
                                     }
            );
        }
    }



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToe();
            }
        });
        //StringMain name = "Julia";
        int age = 25;
        if (age >= 18) {
            System.out.println("Jesteś osobą pełnoletnią.");
        } else {
            System.out.println("Jesteś dzieckiem.");

        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

