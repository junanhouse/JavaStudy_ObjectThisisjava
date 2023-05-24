package ch07.sec02;

public class SmartPhone extends Phone{
    public boolean wifi;

    public SmartPhone(String model, String color){
        super(model, color);
        this.model = model;
        this.color = color;
    }

    public  void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("wifi 상태 변경");
    }

    public  void internet(){
        System.out.println("internet 연결");
    }
}
