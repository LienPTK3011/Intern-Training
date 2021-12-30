package Project1;

public class Booking {

	public void inputbook() {
		Seat seat = new Seat();
		ConferenceRoom room = new ConferenceRoom();
		
		seat.inputSeat();
		room.inputConferenceRoom();
	}
	
	public void bookingSeatRoom() {
		SeatBooking seatBooking = new SeatBooking();
		ConferenceBooking roomBooking = new ConferenceBooking();
		
		seatBooking.inputSeatBooking();
		roomBooking.inputConferenceBooking();
	}
	
	
}
