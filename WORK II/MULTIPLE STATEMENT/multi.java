interface Animal {
 void Sound();
}

interface Mammal {
 void Eat();
}

class Cat implements Animal, Mamal {
 public void Sound() {
 System.out.println("Cat sound : Meuw Meuwww!!");
}
 public void Eat() {
 System.out.println("Cat is eating");
}
}

class multi {
 public static void main(String[] args) {
 Cat myCat = new Cat();
 myCat.Sound();
 myCat.Eat();
}
}