class Vehicle {
public void Name() {
 System.out.println("Name is Ferrari");
}
public void Model() {
 System.out.println("Model is FeBazoo");
}
}

class Car extends Vehicle {
 public void Sound() {
 System.out.println("Sound is Vuutuutuu!!");
}
}
public class fe {
public static void main(String[] args) {
 Car myCar = new Car();
 myCar.Name();
 myCar.Model();
 myCar.Sound();
}
}
