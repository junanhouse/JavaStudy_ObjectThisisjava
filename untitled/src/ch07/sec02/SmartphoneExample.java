package ch07.sec02;

public class SmartphoneExample {
    public  static void main(String[] args){
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        System.out.println("wifi : " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
