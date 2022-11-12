package day49_Abstraction_JavaRecap.RemoteDriverTask;

public class FirefoxDriver extends RemoteDriver{

    @Override
    public void javaScriptExecuter(String script) {
        System.out.println("Script "+ script + " is executed on Firefox");
    }

    @Override
    public void takeScreenShoot() {
        System.out.println("Taking Screenshoot on Firefox");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+" on Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing firefox browser");
    }

    @Override
    public void quit() {
        System.out.println("Quitong firefox");
    }
}
