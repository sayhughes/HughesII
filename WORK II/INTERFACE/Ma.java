interface Car {
 public void CarModel();
 public void CarSound();
}

class Benz implements Car {
 public void CarModel(){
 System.out.println("Model : Be20");
}
 public void CarSound(){
  System.out.println("Sound : Vuutuuuu!!");
}
}

class Ma {
 public static void main(String[] args) {
 Benz myBenz = new Benz();
 myBenz.CarModel();
 myBenz.CarSound();
}
}