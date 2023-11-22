interface Fruit{
 void Color();
}

interface Vegetable {
 void Type();
}

class Tomato implements Fruit, Vegetable {
 public void Color() {
 System.out.println("Tomato color is : Red");
}
 public void Type() {
 System.out.println("Types is : Fruits and vegetables ");
}
}

class multip {
 public static void main(String[] args) {
 Tomato myTomato = new Tomato();
 myTomato.Color();
 myTomato.Type();
}
}