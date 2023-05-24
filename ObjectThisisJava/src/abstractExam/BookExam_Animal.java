package abstractExam;
abstract class Animal{
    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }
    abstract void sound();
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("야옹");
    }
}


public class BookExam_Animal {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        animalSound(dog);
        animalSound(cat);
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
