import java.util.*;
class Theatre{
	private final String theatreName;
	private List<Seat> seats = new ArrayList<>();

	public Theatre(String theatreName, int noRows, int seatPerRow){
		this.theatreName=theatreName;

		int lastRow = 'A' + (noRows-1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);			 
			}
		}
	}

	public String getTheatreName(){
		return this.theatreName;
	}

	public boolean reserveSeat(String seatNumber){
		Seat requestedSeat = new Seat(seatNumber,0);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null); 
		if(foundSeat>=0){
				return seats.get(foundSeat).reserve();
			}
		}else{
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
	}

	//for testing
	public void getSeats(){
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}


	private class Seat{
		private double price;
		private final String seatNumber;
		private boolean reserved = false;

		public Seat(String seatNumber, double price){
			this.seatNumber=seatNumber;
			this.price=price;
		}


		public String getSeatNumber(){
			return this.seatNumber;
		}

		public boolean reserve(){
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + "Reserved");
				return true;
			}else{
				return false;
			}
		}

		public boolean cancel(){
			if (this.reserved) {
				this.reserved = true;
				System.out.println("Reservation of " + seatNumber + " Cancelled");
				return true;
			}else{
				return false;
			}
		}	
	}
}

public class Collections{
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Inox",8,12);
		theatre.getSeats();	
		if (theatre.reserveSeat("H11")) {
			System.out.println("Seat Reserved, NOw Pay at Counter");
		}else{
			System.out.println("Sorry");
		}
	}
}	