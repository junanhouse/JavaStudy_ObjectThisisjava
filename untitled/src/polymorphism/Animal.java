package polymorphism;

import static java.lang.Boolean.TRUE;

public class Animal {
    public int leg;
    public boolean tail;

    public void bark() {
    }
    public void AnimalInfo(){
        System.out.println("다리 : " + this.leg + "개");
        if (this.tail){
            System.out.println("꼬리 있음");
        } else{
            System.out.println("꼬리 없음");
        }
    }

}
