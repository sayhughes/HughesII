class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class hier {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

      
        myDog.eat();
        myDog.bark();

        myCat.eat();
        myCat.meow();
    }
}
