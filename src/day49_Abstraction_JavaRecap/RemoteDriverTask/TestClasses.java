package day49_Abstraction_JavaRecap.RemoteDriverTask;

public class TestClasses {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();

        System.out.println("-----------------------------------------");

        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.google.com");
        driver2.takeScreenShoot();
        driver2.close();


    }
}
