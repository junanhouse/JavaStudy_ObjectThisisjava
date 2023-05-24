package InterfaceExam;

public class BookExam_rtaMain {
    public static void main(String[] args) {
        BookExam_RemoteControl rc = new BookExam_Television();

        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new BookExam_Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

    }
}
