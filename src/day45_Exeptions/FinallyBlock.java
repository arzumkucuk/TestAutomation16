package day45_Exeptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Catch Block");
          //  System.exit(0);
        }finally { // end of try catch, her durumda yazar system.exit ondan once yazildigi zaman haricinde
            System.out.println("Finally: Closed");
        }

        System.out.println("Test Completed");

    }
}
