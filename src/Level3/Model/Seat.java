package Level3.Model;

import java.util.Objects;

public class Seat {
    int rowNum;
    int seatNum;
    String client;

    public Seat(String client, int rowNum, int seatNum) {
        this.client = client;
        this.rowNum = rowNum;
        this.seatNum = seatNum;
    }

    public String getClient() {
        return client;
    }

    public int getRowNum() {
        return rowNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return rowNum == seat.rowNum && seatNum == seat.seatNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowNum, seatNum);
    }

    @Override
    public String toString(){
        return String.format("Row: %d, Seat: %d, Client: %s", getRowNum(), getSeatNum(), getClient());
    }
}
