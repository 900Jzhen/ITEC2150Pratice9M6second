package Car;

public class Car {
    private String color;
    private int numberOfSeats;
    private int numberOfWindows;
    private  int numOfDoors;

    public Car(String color, int nS, int nW, int nD){
        this.color = color;
        this.numberOfSeats = nS;
        this.numberOfWindows = nW;
        this.numOfDoors = nD;
    }

    public void accelerate(){
        System.out.println("This car is accelerating");
    }

    public void brake(){
        System.out.println("This car is braking");
    }

    public void turn(){
        System.out.println("This car is turning");
    }


}
