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
public class ConferenceRoom {
    private String id;
    private String roomcode;
    private double priceperhour;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomcode() {
        return roomcode;
    }

    public void setRoomcode(String roomcode) {
        this.roomcode = roomcode;
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

    public ConferenceRoom() {
    }

    public ConferenceRoom(String id, String roomcode, double priceperhour, String note) {
        this.id = id;
        this.roomcode = roomcode;
        this.priceperhour = priceperhour;
        this.note = note;
    }
    
}
