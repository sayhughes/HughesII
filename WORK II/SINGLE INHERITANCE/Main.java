class animal {
public void eat() {
 System.out.println("Animal is Eating");
}
public void sleep() {
 System.out.println("Animal is Sleeping");
}
}

class dog extends animal {
 void bark() {
 System.out.println("Dog is Barking");
}
}
public class Main {
public static void main(String[] args) {
 dog mydog = new dog();
 mydog.eat();
 mydog.sleep();
 mydog.bark();
}
}
