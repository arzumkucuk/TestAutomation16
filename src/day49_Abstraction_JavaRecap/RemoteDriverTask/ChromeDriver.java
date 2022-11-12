package day49_Abstraction_JavaRecap.RemoteDriverTask;

public class ChromeDriver extends RemoteDriver {


    @Override
    public void javaScriptExecuter(String script) {
        System.out.println("Script "+ script + " is executed on Chrome");
    }

    @Override
    public void takeScreenShoot() {
        System.out.println("Taking Screenshoot on Chrome");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+" on Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing chrome browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting chrome");
    }
}
