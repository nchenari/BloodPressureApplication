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
// BPApplication.java
// Represents a blood pressure information system

public class BPApplication 
{
    // attributes
    private Patient currentPatient; // current BP application user
    private Screen screen; // BPApplication's screen
    private Keypad keypad; // BPApplication's keypad
    
    // constants corresponding to main menu options
    private static final int BP_RECOMMENDATION = 1;
    private static final int PULSE_PRESSURE = 2;
    private static final int MEAN_ARTERIAL_PRESSURE = 3;
    private static final int EXIT = 4;     
    
    // no-argument BPApplication constructor
    public BPApplication()
    {
        screen = new Screen(); // create screen
        keypad = new Keypad(); // create keypad
        
    } // end no-argument BPApplication constructor        
   
    // start BPApplication
    public void run()
    {
        // welcome patient; perform executions
        while (true)
        {
            screen.displayMessageLine("\nWelcome to the Blood Pressure " +
                "Analysis Application!"); 
            
            performExecution(); 
        } // end infinite while loop 
    } // end method run  
    
    // display the main menu and perform executions
    private void performExecution()
    {        
        // local variable to store execution currently being processed
        Execution currentExecution = null;
        boolean userExited = false; // user has not chosen to exit
        
        // ask patient for systolic and diastolic blood pressure
        int systolic;
        int diastolic; 
        
        screen.displayMessage("\nTo start,");
        screen.displayMessageLine("\nPlease enter your Systolic" 
                + " Blood Pressure:");
        systolic = keypad.getInput();
        
        screen.displayMessage("\nNow,");
        screen.displayMessageLine("\nPlease enter your Diastolic" 
                + " Blood Pressure:");
        diastolic = keypad.getInput();
        
        // Blood Pressure summary
        screen.displayMessage("\n>>> Your Arterial Blood Pressure Reading is: ");
        screen.displayBloodPressure(systolic, diastolic);
        screen.displayMessageLine(" mm Hg");
        
        // assign patient given blood pressure values to a Patient object
        currentPatient = new Patient(systolic, diastolic);
       
        // loop while user has not chosen option to exit system
        while (!userExited)
        {    
            // show main menu and get user selection
            int mainMenuSelection = displayMainMenu();
            
            // decide how to proceed based on user's menu selection
            switch (mainMenuSelection)
            {    
                // user chose to perform one of three transaction types
                case BP_RECOMMENDATION:
                case PULSE_PRESSURE:
                case MEAN_ARTERIAL_PRESSURE:
                        
                    // initialize as a new object of the chosen type
                    currentExecution =
                        createExecution(mainMenuSelection);
                    
                    currentExecution.execute(); // execute polymorphically
                    break;
                case EXIT: // user chose to terminate session
                    screen.displayMessageLine("\nResetting the system...");
                    userExited = true; // this BPApplication session should end
                    break;
                default: // user did not enter an integer from 1-4
                    screen.displayMessageLine(
                        "\nYou did not enter a valid selection. Please try again.");
                    break; 
            } // end switch    
        } // end while
    } // end utiliy method performExecutions
    
    // display the main menu and return an input selection
    private int displayMainMenu()
    {
        screen.displayMessageLine("\nPlease select a specific analysis to execute:");
        screen.displayMessageLine("1 - Clinically assess Blood Pressure");
        screen.displayMessageLine("2 - Calculate Pulse Pressure");
        screen.displayMessageLine("3 - Calculate Mean Arterial Pressure (MAP)");
        screen.displayMessageLine("4 - Exit\n");
        screen.displayMessage("Enter number (1-4) for desired execution: ");
        return keypad.getInput();
        
    } // end utility method displayMainMenu
    
    // return object of specified Execution subclass
    private Execution createExecution(int type)
    {
        Execution temp = null; // temporary Execution variable
        
        // determine which type of Executin to create
        switch (type)
        {
            case BP_RECOMMENDATION: // create new BPRecommendation 
                temp = new BPRecommendation(currentPatient, screen);
                break;
            case PULSE_PRESSURE: // create new PulsePressure 
                temp = new PulsePressure(currentPatient, screen);
                break;
            case MEAN_ARTERIAL_PRESSURE: // create new MeanArterialPressure 
                temp = new MeanArterialPressure(currentPatient, screen);
                break;
        } // end switch
        
        return temp; // return the newly created object
    } // end utility method createExecution       
} // end class BPApplication
