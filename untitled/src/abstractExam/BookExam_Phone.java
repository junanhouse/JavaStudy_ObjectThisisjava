package abstractExam;

abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn(){
        System.out.println("on");
    }
    void turnOff(){
        System.out.println("off");
    }
}

class SmartPhone extends  Phone{
    SmartPhone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("search");
    }
}
public class BookExam_Phone {
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone("홍길동");

        sp.turnOn();
        sp.internetSearch();
        sp.turnOff();
    }
}
