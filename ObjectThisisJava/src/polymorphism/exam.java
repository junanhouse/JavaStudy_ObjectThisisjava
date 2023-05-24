package polymorphism;

public class exam {
    public static void main(String[] args){
        Bird bird = new Bird();
        Dog dog = new Dog();

        dog.AnimalInfo();
        dog.bark();
        bird.bark();
        bird.AnimalInfo();


        System.out.println("자동 타입 변환");

        Animal bird2 = new Bird();
        Animal dog2 = new Dog();

        dog2.bark();
        bird2.bark();


        System.out.println("dog2 leg : " + dog2.leg + "dog2 tail : " + dog2.tail);
        System.out.println("bird2 leg : " + bird2.leg + "bird2 tail : " + bird2.tail);


        ((Dog) dog2).dogInfo();
        ((Bird) bird2).birdInfo();
    }
}
