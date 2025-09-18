package Level3.Model;

import Level3.Exceptions.*;

import java.util.ArrayList;


public class CinemaManager {
    Cinema cinema;

    public CinemaManager(Cinema cinema) {
        this.cinema = cinema;
    }

    public int menu(){
        return Input.readInt("""
    What do you wanna do?
    1.- Show all reserved seats.
    2.- Show the seats reserved by a person.
    3.- Reserve a seat.
    4.- Cancel the reservation of a seat.
    5.- Cancel all reservations of a person.
    0.- Exit.""");
    }

    public String showSeats(){
        if(!cinema.getSeatsM().seats.isEmpty()){
            StringBuilder returnString = new StringBuilder("The occupied seats are: ");
            for(Seat seat: cinema.getSeatsM().seats){
                returnString.append("\nRow: ").append(seat.getRowNum()).append(" Seat: ").append(seat.getSeatNum());
            }
            return returnString.toString();
        }else {
            return "There aren't reserved seats.";
        }
    }

    public String showSeatsClient(){
        String client = checkClient();
        StringBuilder returnString = new StringBuilder("This client has: ");
        for(Seat seat: cinema.getSeatsM().seats){
            if(seat.getClient().equalsIgnoreCase(client)){
                returnString.append("\nRow: ").append(seat.getRowNum()).append(" Seat: ").append(seat.getSeatNum());
            }
        }

        if(returnString.toString().equals("This client has: ")){
            return "This client has no reserved seats.";
        }else{
            return returnString.toString();
        }
    }

    public String reserveSeats(){
        try {
            cinema.getSeatsM().newSeat(new Seat(checkClient(), checkRow(), checkSeat()));
            return "Reserve completed";
        } catch (ExceptionOccupiedSeat e) {
            return e.getMessage();
        }

    }

    public String nullifyReservedSeats(){
        try{
            cinema.getSeatsM().removeSeat(checkRow(), checkSeat());
            return "Reserve nullified";
        } catch (ExceptionAvailableSeat e){
            return e.getMessage();
        }
    }

    public String nullifyReserveClient(){
        String client = checkClient();
        ArrayList<Integer> seatsIndex = new ArrayList<>();
        for(int i = 0; i < cinema.getSeatsM().getSeats().size(); i++){
            if(cinema.getSeatsM().getSeats().get(i).getClient().equalsIgnoreCase(client)){
                seatsIndex.add(i);
            }
        }

        if(seatsIndex.isEmpty()){
            return "This client has no reserved seats.";
        } else {
            for(int seatIndex: seatsIndex){
                cinema.getSeatsM().getSeats().remove(seatIndex);
            }
            return "All reserves of the client removed.";
        }
    }

    public String checkClient(){
        do {
            String clientName = Input.readString("What's the name of the client?");
            try {
                if (!clientName.matches(".*\\d.*")) {
                    return clientName;
                } else {
                    throw new ExceptionNameNotValid();
                }
            } catch (ExceptionNameNotValid exception) {
                System.out.println(exception.getMessage());
            }
        }while (true);
    }

    public int checkRow(){
        do {
            int numRow = Input.readInt("What's the row number?");
            try {
                if (numRow > 0 && numRow <= cinema.getRows()) {
                    return numRow;
                } else {
                    throw new ExceptionRowNotValid();
                }
            } catch (ExceptionRowNotValid exception) {
                System.out.println(exception.getMessage());
            }
        }while (true);
    }

    public int checkSeat(){
        do {
            int numSeat = Input.readInt("What's the seat number?");
            try {
                if (numSeat > 0 && numSeat <= cinema.getSeats()) {
                    return numSeat;
                } else {
                    throw new ExceptionRowNotValid();
                }
            } catch (ExceptionSeatNotValid exception) {
                System.out.println(exception.getMessage());
            }
        }while (true);
    }
}
