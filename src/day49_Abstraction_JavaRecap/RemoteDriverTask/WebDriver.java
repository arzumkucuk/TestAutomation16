package day49_Abstraction_JavaRecap.RemoteDriverTask;

interface JavaScriptExecuter{
    void javaScriptExecuter(String script);
        }
interface TakeScreenShoot{
    void takeScreenShoot();
        }

public interface WebDriver {
     void get(String URL);
     void close();
     void quit();

}
