class Vehicle {
   
    private String make;
    private int year;

 
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }
}


class Car extends Vehicle {
    
    private String model;

    
    public Car(String make, int year, String model) {
      
        super(make, year);
        this.model = model;
    }


    @Override
    public void displayDetails() {
      
        super.displayDetails();
     
        System.out.println("Model: " + model);
    }
}


public class Main {
    public static void main(String[] args) {
       
        Car myCar = new Car("Toyota", 2021, "Camry");
      
        myCar.displayDetails();
    }
}
