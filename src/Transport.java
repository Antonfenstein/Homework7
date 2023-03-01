public class Transport {
    private String name;
    private int seats;

    public void move() {
        System.out.println("Transport is moving ");
    }

    public void options() {
        System.out.println("I can move back and forward");
    }

    public Transport() {
        System.out.println("New transport has been created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (0 < this.seats && this.seats < 10) {
            this.seats = seats;
        }
        else {
            System.out.println("Seats quantity is not correct ");
        }
    }
}
