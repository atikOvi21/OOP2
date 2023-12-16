public class TheaterShow implements Show {
    private String showName;
    private int totalSeats;
    private int bookedSeats;

    public TheaterShow(String showName, int totalSeats) {
        this.showName = showName;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    @Override
    public String getShowName() {
        return showName;
    }

    @Override
    public boolean bookSeats(int numSeats) {
        if (numSeats <= totalSeats - bookedSeats) {
            bookedSeats += numSeats;
            return true;
        }
        return false;
    }
}
