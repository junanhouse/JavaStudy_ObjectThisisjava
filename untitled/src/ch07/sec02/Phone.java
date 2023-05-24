package ch07.sec02;

public class Phone {
    public String model;
    public String color;

    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("생성자 실행");
    }

    public void bell(){
        System.out.println("bell!!!!!!!!!!");
    }
    public  void sendVoice(String message){
        System.out.println("자기: " + message);
    }

    public  void receiveVoice(String message){
        System.out.println("상대방 : " + message);
    }

    public  void hangUp(){
        System.out.println("종료");
    }
}
