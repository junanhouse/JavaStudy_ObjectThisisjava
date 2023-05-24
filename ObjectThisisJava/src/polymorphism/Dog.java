package polymorphism;

import static java.lang.Boolean.TRUE;

public class Dog extends Animal{
    public Dog(){
        this.tail = true;
        this.leg = 4;
    }
    @Override
    public void bark() {
        System.out.println("멍멍");
    }

    public void dogInfo(){
        //AnimalInfo(this.leg,this.tail);
    }
}
