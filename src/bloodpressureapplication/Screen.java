/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodpressureapplication;

/**
 *
 * @author nimachenari
 */
// Screen.java
// Represents the screen of the BPApplication

public class Screen 
{
    // display a message without a carriage return
    public void displayMessage(String message)
    {
        System.out.print(message);
    } // end method displayMessage        
    
    // display a message with a carriage return
    public void displayMessageLine(String message)
    {
        System.out.println(message);
    } // end method displayMessageLine
    
    // display Blood Pressure 
    public void displayBloodPressure(int systolic, int diastolic)
    {
        System.out.printf("%d/%d", systolic, diastolic);
    } // end method displayBloodPressure
    
    // display Blood Pressure calcuation
    public void displayCalculation(int calculation)
    {
        System.out.printf("%d", calculation);
    } // end method displayCalculation        
    
    public void displayCalculation(double calculation)
    {
        System.out.printf("%.2f", calculation);
    } // end method displayCalcuation        
} // end class Screen
