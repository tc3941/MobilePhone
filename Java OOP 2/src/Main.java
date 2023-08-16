import java.util.*;

public class Main {
    public static void main(String[] args) {
        MobilePhone iPhone = new MobilePhone("Apple", "iPhone 13 Max", "5851324567", 128);
        iPhone.makeCall("5851122334");
        iPhone.installApp("Angry Birds");
        iPhone.displayInfo();
    }
}