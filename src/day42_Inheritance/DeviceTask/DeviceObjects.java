package day42_Inheritance.DeviceTask;

public class DeviceObjects {

    public static void main(String[] args) {

        TV tv = new TV("Samsung","LX32", 499.99);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();
        tv.turnOn();
        tv.turnOff();

        Phone phone= new Phone("Apple", "12 Pro Max", 1099.99);
        System.out.println(phone);
        phone.turnOn();
        phone.turnOff();
        phone.call(911);
        phone.text(237645314);

        System.out.println(TV.hasBattery);

    }
}
