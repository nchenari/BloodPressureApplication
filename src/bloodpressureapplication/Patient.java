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
// Patient.java

public class Patient 
{
    // attributes
    private int systolic; // patient systolic blood pressure
    private int diastolic; // patient diastolic blood pressure
    
    // Patient constructor initializes attributes
    public Patient(int theSystolic, int theDiastolic)
    {
        systolic = theSystolic;
        diastolic = theDiastolic;    
    } // end Patient constructor
    
    // set patient systolic blood pressure
    public void setSystolic(int theSystolic)
    {
        systolic = theSystolic;
    } // end method setSystolic        
    
    // return patient systolic blood pressure
    public int getSystolic()
    {
        return systolic;
    } // end method getSystolic
    
    // set patient diastolic blood pressure
    public void setDiastolic(int theDiastolic)
    {
        diastolic = theDiastolic;
    } // end method setDiastolic
    
    // return patient systolic blood pressure
    public int getDiastolic()
    {
        return diastolic;
    } // return patient diastolic blood pressure
} // end class Patient
