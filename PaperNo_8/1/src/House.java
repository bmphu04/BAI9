/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC MSI
 */
public class House {
    private String type;
    private int area;
    public House(){}

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        if(type.length()<3){
            return new StringBuilder(type).reverse().toString();
        }else{
            String lastThreeChars = type.substring(type.length() - 3);
            return new StringBuilder(lastThreeChars).reverse().toString();
        }
    }

    public int getArea() {
        return area;
    }

    public void setArea(int newArea) {
        this.area = 3*newArea;
    }
    
}
