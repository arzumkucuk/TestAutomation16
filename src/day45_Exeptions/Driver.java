package day45_Exeptions;

public class Driver {

    public static void main(String[] args) {

        String browserName = "CHROME"; //"Cybertek"; // default

        switch (browserName.toLowerCase()){
            case "chrome":
                System.out.println("chrome is selected");
                break;

            case "firefox":
                System.out.println("Firefox is selected");
                break;

            case "safari":
                System.out.println("safari is selected");
                break;

            case "opera":
                System.out.println("Opera is selected");
                break;

            default:
                throw new RuntimeException("No Such A Browser Named Cybertek " + browserName);
        }


        System.out.println("=========================================================");

        throw new ClassCastException("Invalid Class");



    }
}
