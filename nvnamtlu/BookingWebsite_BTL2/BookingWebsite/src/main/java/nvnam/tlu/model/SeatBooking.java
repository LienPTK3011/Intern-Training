package nvnam.tlu.model;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "seat_booking")
public class SeatBooking implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long id;
	@Column(name = "userName")
	private String userName;
	@Column(name = "seatCode", nullable = false)
	private String seatCode;
	@Column(name = "pricePerHour")
	private Double pricePerHour;
	@Column(name = "daybk")
	private String dayBK;
	@Column(name = "startTime")
	private LocalTime startTime;
	@Column(name = "endTime")
	private LocalTime endTime;
	@Column (name = "totalPayment")
	private double totalPayment;

	public SeatBooking() {
		super();
	}

	public SeatBooking(long id, String seatCode, String userName, Double pricePerHour, String dayBK, LocalTime startTime,
			LocalTime endTime) {
		super();
		this.id = id;
		this.userName = userName;
		this.seatCode = seatCode;
		this.pricePerHour = pricePerHour;
		this.dayBK = dayBK;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getDayBK() {
		return dayBK;
	}

	public void setDayBK(String dayBK) {
		this.dayBK = dayBK;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

	public double calculatePrice() {
		Duration duration = Duration.between(startTime, endTime);
		long hours = duration.toHours();
		long minutes = duration.toMinutes() - hours * 60;
		double payMoney = (hours + (minutes * 1.0 / 60)) * this.getPricePerHour();
		return (double) Math.round(payMoney * 100) / 100;
	}

	

}