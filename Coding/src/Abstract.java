abstract class Car {
    String model;

    Car(String name) {
        model = name;
    }

    abstract void displayModel();
}

public class Abstract {
    public static void main(String[] args) {
        Car a = new Car("Tesla") {
            @Override
            void displayModel() {
                System.out.println("The model of the car is " + this.model);
            }
        };
        
        a.displayModel();
    }
}