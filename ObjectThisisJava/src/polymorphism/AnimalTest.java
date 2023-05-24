package polymorphism;

import java.util.ArrayList;

class Animal2 {
    public void move(){
        System.out.println("move");
    }

    public void eating(){

    }
}

class Human extends Animal2{
    public void move(){
        System.out.println("Human move");
    }

    public void readBooks(){
        System.out.println("Human read book");
    }
}
class Tiger extends Animal2{

    public void move(){
        System.out.println("Tiger move");
    }

    public void hunting(){
        System.out.println("Tiger hunting");
    }
}

class Eagle extends Animal2{
    public void move(){
        System.out.println("Eagle move");
    }
    public void flying(){
        System.out.println("Eagle is flying");
    }
}
public class AnimalTest {
    public static void main(String[] args){
        Animal2 hAnimal = new Human();
        Animal2 tAnimal = new Tiger();
        Animal2 eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        //test.moveAnimal(hAnimal);
        //test.moveAnimal(tAnimal);
        //test.moveAnimal(eAnimal);

        ArrayList<Animal2> animalList = new ArrayList<Animal2>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal2 animal : animalList){
            animal.move();
        }
    }

    public void moveAnimal(Animal2 animal){
        animal.move();
    }
}
