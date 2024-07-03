/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC MSI
 */
public class Lift {
    private String label;
    private int load;
    public Lift(){
        
    }

    public Lift(String label, int load) {
        this.label = label;
        this.load = load;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public String getLabel() {
        return label;
    }

    public int getLoad() {
        return load;
    }
    
}
