package nvnam.tlu.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "seat")
public class Seat implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long id;
	@Column(name = "seatCode", nullable = false)
	private String seatCode;
	@Column(name = "pricePerHour")
	private Double pricePerHour;
	@Column(name = "note")
	private String note;
	public Seat() {
		super();
	}
	public Seat(long id, String seatCode, Double pricePerHour, String note) {
		super();
		this.id = id;
		this.seatCode = seatCode;
		this.pricePerHour = pricePerHour;
		this.note = note;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSeatCode() {
		return seatCode;
	}
	public void setSeatCode(String seatCode) {
		this.seatCode = seatCode;
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