/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danayfernandez
 */
import javax.swing.JOptionPane;

public class DanielasDaystoSummerTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String input = JOptionPane.showInputDialog("Enter the number of lessons");

        double lessons = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the number of days");

        int days = Integer.parseInt(input);

        DanielasDaystoSummer Daniella = new DanielasDaystoSummer(days, lessons);

        System.out.println("The average amount of lessons per day is "
                + Daniella.averagelessonsperday());
        System.out.println(" Your expected graduation date is "
                + Daniella.getDate());

    }
}
