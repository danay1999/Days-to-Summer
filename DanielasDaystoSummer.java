/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danayfernandez
 */
public class DanielasDaystoSummer {

    private String month;
    private int days;
    private double lessons;

    public double averagelessonsperday() {
        double averagelessonsperday;

        averagelessonsperday = lessons / days;

        return averagelessonsperday;
    }

    public DanielasDaystoSummer(int days, double lessons) {
        this.days = days;
        this.lessons = lessons;
    }

    public String getDate() {

        if (lessons <= 430 && days<=102)  {
           this.month = ("July") ;
        }
        else if (lessons <= 390 && days>=103){
  this.month = ("August");
        }
    
        return month;

    }
}
