class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}


class Moto extends Vehicle {
    void ride() {
        System.out.println("Moto is riding");
    }
}


class hie {
    public static void main(String[] args) {
        Car myCar = new Car();
        Moto myMoto = new Moto();
        
        myCar.start();
        myCar.drive();
        myCar.stop();

        myMoto.start();
        myMoto.ride();
        myMoto.stop();
    }
}