/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC MSI
 */
public class SpecLift extends Lift {
    private int load;
    public SpecLift(){
        
    }

    public SpecLift(String label, int type, int load) {
        super(label, type);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    

    @Override
    public String toString() {
        return label+','+load+','+type;
    }
    public void setData(){
        StringBuilder modifiedLabel = new StringBuilder();
        for(int i = 0; i < getLabel().length();i++){
            if(i%2==0){
                modifiedLabel.append(getLabel().charAt(i));
            }
        }
        setLabel(modifiedLabel.toString());
    }
     public int getValue(){
        if(getLabel().contains(String.valueOf(getType()))){
            return getLoad()+ getType();
        } else {
            return getLoad();
        }
    }
}
