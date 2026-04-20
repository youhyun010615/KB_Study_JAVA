package self_study.ch08.sec02;

public class MultiInterfaceExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnoff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https//www.youtube.com");
    }
}
