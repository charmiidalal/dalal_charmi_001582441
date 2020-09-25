/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
/* Import Array List library */
import java.util.ArrayList;

/**
 *
 * @author charmidalal
 */
public class VitalSignHistory {
    
    /* Declare VitalSignHistory Array List */
    private ArrayList<VitalSigns> vitalSignHistory;
    
    /* This method initialize Arraylist variable */
    public VitalSignHistory(){
        vitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    /* This method returns ArrayList variable */
    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    /* This method sets ArrayList variable */
    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    /* This method holds object of variables and adds its into array */
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;         
    }
    
    /* This method deletes object from VitalSignHistory array */
    public void deleteVitals(VitalSigns v){
        vitalSignHistory.remove(v);
    }
}
