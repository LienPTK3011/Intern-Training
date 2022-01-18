package nvnam.tlu.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "room")
public class Room implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long id;
	@Column(name = "roomCode", nullable = false)
	private String roomCode;
	@Column(name = "pricePerHour")
	private Double pricePerHour;
	@Column(name = "note")
	private String note;
	public Room() {
		super();
	}
	public Room(long id, String roomCode, Double pricePerHour, String note) {
		super();
		this.id = id;
		this.roomCode = roomCode;
		this.pricePerHour = pricePerHour;
		this.note = note;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public Double getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}