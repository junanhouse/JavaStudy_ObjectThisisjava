package InterfaceExam;

public class BookExam_Television implements BookExam_RemoteControl{
    int volume;
    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }
    @Override
    public void setVolume(int volume){
        if(volume>BookExam_RemoteControl.MAX_VOLUME) {
            this.volume = BookExam_RemoteControl.MAX_VOLUME;
        } else if(volume<BookExam_RemoteControl.MIN_VOLUME) {
            this.volume = BookExam_RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("볼륨은 " + this.volume + "입니다. ");
    }
}
