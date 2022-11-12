package day45_Exeptions;

public class Throws_VS_TryCatch {

    public static void main(String[] args) throws InterruptedException {

        method1();
        System.out.println("Try & Catch");

       // method2(); eger methodu baska bir yerde kullanacaksan throw yazdiginda baska yerde hata verir burada oldugu gibi.
        //          baska yerde kullanacaksan try&catch kullanmak zorundasin hata vermemesi icin

        //Thread.sleep(3000);
        BrowserUtility.sleep(3);

        sleep(5);

        System.out.println("Test completed");


    }

    public static void  method1(){

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
    }

    public static void method2() throws InterruptedException{
        Thread.sleep(3000);
    }

    public static void sleep(long seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}




