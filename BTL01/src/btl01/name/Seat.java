/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl01.name;

/**
 *
 * @author Asus
 */
public class Seat {
    private String id;
    private String setcode;
    private double priceperhour;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSetcode() {
        return setcode;
    }

    public void setSetcode(String setcode) {
        this.setcode = setcode;
    }

    public double getPriceperhour() {
        return priceperhour;
    }

    public void setPriceperhour(double priceperhour) {
        this.priceperhour = priceperhour;
    }
    
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Seat() {
    }

    public Seat(String id, String setcode, double priceperhour, String note) {
        this.id = id;
        this.setcode = setcode;
        this.priceperhour = priceperhour;
        this.note = note;
    }

    
}
