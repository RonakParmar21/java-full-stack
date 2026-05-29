public class Train {
    private int trainID;
    private String trainName;
    private String source;
    private String destination;
    private int totalSeats;
    private int availableSeats;

    public Train(int trainID, String trainName, String source, String destination, int totalSeats) { // why availble seats not take because if new train is create availableseats = total seats right.
        this.trainID = trainID;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public boolean bookSeat(int count) {
        if(count <= availableSeats) {
            availableSeats -= count;
            return true;
        }
        return false;
    }

    public void cancelSeat(int count) {
        availableSeats += count;
    }

    @Override
    public String toString() {
        return trainID + " | " + trainName + " | " + source + " -> " + destination + " Seats Available : " + availableSeats;
    }
}
