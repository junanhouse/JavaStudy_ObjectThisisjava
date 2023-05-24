package InterfaceExam;

public interface BookExam_RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음");
        } else {
            System.out.println("무음 해제");
        }
    }

}
