import sun.rmi.runtime.NewThreadAction;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        Mobile mobile = new Mobile("MobileName", "red", "MobileBrand");
        mobile.makeCall("Mobile Message!!!");

        Mobile iphone = new iPhone("iPhone", "white", "Apple");
        iphone.makeCall("iPhone Message!!!");

        Mobile android = new Android("AndroidPhone", "black", "OnePlus");
        android.makeCall("Android Message!!!");
        android.getMobileInfo();

        Person person = new Person("Sam",android);
        person.makeCall("Sam Android Message!!!");
        person.makeCall("Super long Msg.......................................................................................");

        person.chnageMobile(iphone);
        person.makeCall("Sam iphone");
        person.makeCall("Super long Msg..................................................");
    }
}