interface Animal {
 public void AnimalSound();
 public void Sleep(); 
}

class Pig implements Animal {
  public void AnimalSound() {
    System.out.println("The pig says: Wee Wee");
  }
  public void Sleep() {
    System.out.println("Zzzz!");
  }
}

public class Mainn {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.AnimalSound();
    myPig.Sleep();
  }
}