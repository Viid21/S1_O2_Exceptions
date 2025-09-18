package Level3.Model;

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

    public boolean equals(Seat otherSeat){
        return otherSeat.getRowNum() == getRowNum() && otherSeat.getSeatNum() == getSeatNum();
    }

    public String toString(){
        return String.format("Row: %d, Seat: %d, Client: %s", getRowNum(), getSeatNum(), getClient());
    }
}
