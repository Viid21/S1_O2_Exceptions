package Level3.Model;

import Level3.Exceptions.ExceptionAvailableSeat;
import Level3.Exceptions.ExceptionOccupiedSeat;

import java.util.ArrayList;

public class SeatsManager {
    ArrayList<Seat> seats;

    public SeatsManager() {
        this.seats = new ArrayList<>();
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void newSeat(Seat seat) throws ExceptionOccupiedSeat{
        if(searchSeat(seat) == -1){
            seats.add(seat);
        } else {
            throw new ExceptionOccupiedSeat();
        }
    }

    public void removeSeat(int row, int seat) throws ExceptionAvailableSeat{
        try{
            seats.remove(searchSeat(new Seat("", row, seat)));
        } catch (IndexOutOfBoundsException e) {
            throw new ExceptionAvailableSeat();
        }
    }

    public int searchSeat(Seat seat){
        for(int i = 0; i < seats.size(); i++){
            if(seat.getRowNum() == seats.get(i).getRowNum() && seat.getSeatNum() == seats.get(i).getSeatNum()){
                return i;
            }
        }
        return -1;
    }
}
