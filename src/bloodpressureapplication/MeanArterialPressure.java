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
// MeanArterialPressure.java
// calculates mean arterial pressure approximation from
// systolic and diastolic blood pressure

public class MeanArterialPressure extends Execution
{
    // MeanArterialPressure constructor
    public MeanArterialPressure(Patient userPatient, Screen applicationScreen)
    {
    super(userPatient, applicationScreen);
    } // end MeanArterialPressure constructor   
    
    // performs the execution
    @Override
    public void execute()
    {
        // get reference to screen
        
        Screen screen = getScreen(); 
        
        // get the patient's systolic and diastolic blood pressure
        Patient patient = getPatient();
        
        int systolic = patient.getSystolic();
        int diastolic = patient.getDiastolic();
        
        // calculate patient's Mean Arterial Pressure
        double meanArterialPressure;
        
        meanArterialPressure = 
                ((double)systolic - (double)diastolic) / 3 + (double)diastolic;
        
        // display Mean Arterial Pressure approx. calculation
        screen.displayMessageLine("\n>>> Mean Arterial Pressure calcualated as:");
        screen.displayMessage("    approx. ");
        screen.displayCalculation(meanArterialPressure);
        screen.displayMessageLine(" mm Hg");
        
        // inform user that they can perform other analyses
        screen.displayMessageLine("\nPlease choose another execution"
            + " or press 4 to EXIT session and reset Blood Pressure values");
        
    } // end method execute            
} // end class MeanArterialPressure
