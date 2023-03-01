public class Car extends Transport{
    private int vin;
    private String number;

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void move() {
        System.out.println("Car is moving ");
    }
}
