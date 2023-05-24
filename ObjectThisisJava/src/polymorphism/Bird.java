package polymorphism;

import static java.lang.Boolean.FALSE;

public class Bird extends Animal{
    public boolean tail;
    public int leg;
    public Bird(){
        this.tail = false;
        this.leg = 2;
    }
    @Override
    public void bark(){
        System.out.println("짹짹");
    }

    public void birdInfo(){
        //AnimalInfo(this.leg, this.tail);
    }

}
