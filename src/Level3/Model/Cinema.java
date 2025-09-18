package Level3.Model;

public class Cinema {
    int rows;
    int seats;
    SeatsManager seatsM;
    CinemaManager cinemaM;

    public Cinema() {
        requestInitialData();
        this.seatsM = new SeatsManager();
        this.cinemaM = new CinemaManager(this);
    }

    public int getRows() {
        return rows;
    }

    public int getSeats() {
        return seats;
    }

    public SeatsManager getSeatsM() {
        return seatsM;
    }

    public void play() {
        int option;
        do {
            option = this.cinemaM.menu();
            String message = switch (option) {
                case 1 -> this.cinemaM.showSeats();
                case 2 -> this.cinemaM.showSeatsClient();
                case 3 -> this.cinemaM.reserveSeats();
                case 4 -> this.cinemaM.nullifyReservedSeats();
                case 5 -> this.cinemaM.nullifyReserveClient();
                case 0 -> "Good bye.";
                default -> "Choose a valid option.";
            };
            System.out.println(message);
        } while (option != 0);
    }

    public void requestInitialData(){
        this.rows = Input.readInt("How many rows are there?");
        this.seats = Input.readInt("How many seats per row are there?");
    }
}
