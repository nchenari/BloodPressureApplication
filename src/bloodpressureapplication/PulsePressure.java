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
// PulsePressure.java
// calcualtes pulse pressure from systolic and diastolic blood pressure

public class PulsePressure extends Execution
{
    // PulsePressure constructor
    public PulsePressure(Patient userPatient, Screen applicationScreen)
    {
    super(userPatient, applicationScreen);
    } // end PulsePressure constructor     
    
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
        
        // calculate patient's Pulse Pressure
        int pulsePressure;
        
        pulsePressure = systolic - diastolic;
        
        // display Pulse Pressure calculation
        screen.displayMessageLine("\n>>> Pulse Pressure calcualated as:");
        screen.displayMessage("    ");
        screen.displayCalculation(pulsePressure);
        screen.displayMessageLine(" mm Hg");
        
        // inform user that they can perform other analyses
        screen.displayMessageLine("\nPlease choose another execution"
            + " or press 4 to EXIT session and reset Blood Pressure values");
        
    } // end method execute           
} // end class PulsePressure
