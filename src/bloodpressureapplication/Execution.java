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
// Execution.java
// Abstract superclass Execution represents BPrApplication's functions
public abstract class Execution 
{
    // attributes
    private Patient patient; // refecence to patient
    private Screen screen; // BPApplication's screen
    
    // Exectuion constructor invoked by subclasses using super()
    public Execution(Patient userPatient, Screen applicationScreen)
    {
        patient = userPatient;
        screen = applicationScreen;
    } // end Execution constructor
    
    // return patient name
    public Patient getPatient()
    {
        return patient;
    } // end method getPatientName        
    
    // return reference to screen
    public Screen getScreen()
    {
        return screen;
    } // end method getScreen
    
    // perform the function (overridden by each subclass)
    abstract public void execute();
} // end class Execution 
