public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.setName("BMW");
        transport.setSeats(5);
        System.out.println("This transport is called " + transport.getName());
        System.out.println("Its number of seats is " + transport.getSeats());

    Car car = new Car();
   car.move();

   Car renault = new Car();
   renault.options();


    }
}