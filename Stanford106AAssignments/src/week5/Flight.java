package week5;

public class Flight {
    private String currentCity;
    private String destination;

    Flight(String currentCity, String destination) {
        this.currentCity = currentCity;
        this.destination = destination;
    }

    public String getCurrentCity() {
        return this.currentCity;
    }

    public String getDestination() {
        return this.destination;
    }

    public String toString() {
        return currentCity + " -> " + destination;
    }
}