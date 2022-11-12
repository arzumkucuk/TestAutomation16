package day49_Abstraction_JavaRecap.RemoteDriverTask;

public class CybertekDriver extends RemoteDriver{
    @Override
    public void javaScriptExecuter(String script) {
        System.out.println("Script "+ script + " is executed on Cybertek");
    }

    @Override
    public void takeScreenShoot() {
        System.out.println("Taking Screenshoot on Cybertek");

    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+" on Cybertek");
    }

    @Override
    public void close() {
        System.out.println("Closing cybertek driver browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting cybertek");
    }
}
