package Fabrica;

public class CarFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Ferrari(1000, "electric fuel", "black");
            case "B":
                return new Audi(800, "gasoline", "white");
            default:
                System.out.println("The requested car is not available");
                return null;
        }
    }
}