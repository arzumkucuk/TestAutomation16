package day45_Exeptions;

public class ExeptionsHandling {

    public static void main(String[] args) {
        // StringIndexoutofBound

        String str = "Cybertek";

        try {
            System.out.println(str.substring(200, 300)); // cybertek index 200 ve 300 cok fazla aslinda bug var
            System.out.println("Try Block");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // sistenden hazir mesaj ceker hata olani
        //    e.printStackTrace();
        }

        // Thread.sleep

        try {
            Thread.sleep(5000);

        }catch (InterruptedException e){

        }


        try {
            System.out.println(100 / 0);
        }catch (ArithmeticException e){
            System.out.println("Unchecked exeption is occured: "+ e.getMessage());
            e.printStackTrace();
        }




        System.out.println("Test Completed");
    }
}
