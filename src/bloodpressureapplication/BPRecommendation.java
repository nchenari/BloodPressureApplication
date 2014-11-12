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
// BPRecommendation.java
// Class makes recommendations to patient based on
// systolic and diastolic blood pressures

public class BPRecommendation extends Execution
{
    // BPRecommendation constructor
    public BPRecommendation(Patient userPatient, Screen applicationScreen)
    {
    super(userPatient, applicationScreen);
    } // end BPRecommendation constructor   
    
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
        
        // display clinical assesment w/ reccommendations
        screen.displayMessageLine("\n>>> Clinical Assessment:");
        
        // in accordance with American Heart Association's classifications
        // for adults 18 years and older
        
        // check systolic blood pressure for pre-hypertension, hypertension,
        // and hypotension
        if (systolic < 90)
        {
            screen.displayMessageLine("\n    Systolic BP indicates Hypotension");
            screen.displayMessageLine("    Please see primary physician if"
                + " symptoms develop");
        }
        else if (systolic >= 90 && systolic <= 119)
        {
            screen.displayMessageLine("\n    Systolic BP indicates healthy blood pressure");
        }
        else if (systolic >= 120 && systolic <= 139)
        {
            screen.displayMessageLine("\n    Systolic BP indicates Pre-Hypertension");
            screen.displayMessageLine("    At elevated risk for developing Heart Disease");
            screen.displayMessageLine("    Please monitor BP yearly and consult"
                + " primary physician if symptoms develop");
        }
        else if (systolic >= 140 && systolic <= 159)
        {
            screen.displayMessageLine("\n    Systolic BP indicates Stage 1 Hypertension");
            screen.displayMessageLine("    At high risk for developing Heart Disease.");
            screen.displayMessageLine("    Please consult primary physician for treatment");
        }
        else if (systolic >= 160 && systolic <= 179)
        {
            screen.displayMessageLine("\n    Systolic BP indicates Stage 2 Hypertension");
            screen.displayMessageLine("    At high risk for developing Heart Disease.");
            screen.displayMessageLine("    Please consult primary physician for treatment");
        }    
        else if (systolic >= 180)
        {
            screen.displayMessageLine("\n    Systolic BP indicates Hypertensive Emergency");
            screen.displayMessageLine("    Please seek emergency medical help immediately!");
        } // end if else set   
            
        // check diastolic blood pressure for pre-hypertension, hypertension,
        // and hypotension
        if (diastolic < 60)
        {
            screen.displayMessageLine("\n    Diastolic BP indicates Hypotension");
            screen.displayMessageLine("    Please consult primary physician if"
                + " symptoms develop");
        }
        else if (diastolic >= 60 && diastolic <= 79)
        {
            screen.displayMessageLine("\n    Diastolic BP indicates healthy blood pressure");
        }
        else if (diastolic >= 80 && diastolic <= 89)
        {
           screen.displayMessageLine("\n    Diastolic BP indicates Pre-Hypertension");
           screen.displayMessageLine("    At elevated risk for developing Heart Disease");
           screen.displayMessageLine("    Please monitor BP yearly and consult"
                + " primary physician if symptoms develop");
        }
        else if (diastolic >= 90 && diastolic <= 99)
        {
            screen.displayMessageLine("\n    Diastolic BP indicates Stage 1 Hypertension");
            screen.displayMessageLine("    At high risk for developing Heart Disease.");
            screen.displayMessageLine("    Please consult primary physician for treatment");
        }    
        else if (diastolic >= 100 && diastolic <= 109)
        {
            screen.displayMessageLine("\n    Diastolic BP indicates Stage 2 Hypertension");
            screen.displayMessageLine("    At high risk for developing Heart Disease.");
            screen.displayMessageLine("    Please consult primary physician for treatment");
        }    
        else if (diastolic >= 110)
        {
            screen.displayMessageLine("\n    Diastolic BP indicates Hypertensive Emergency");
            screen.displayMessageLine("    Please seek emergency medical help immediately!");
        } // end if else set   
    
        
        // inform user that they can perform other analyses
        screen.displayMessageLine("\nPlease choose another execution"
            + " or press 4 to EXIT session and reset Blood Pressure values");
        
    } // end method execute            
} // end class BPRecommendation
