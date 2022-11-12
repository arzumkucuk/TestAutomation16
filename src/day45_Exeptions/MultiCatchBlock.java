package day45_Exeptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try {
            System.out.println(25 / 0); // Arithmetic Exception
        }catch (NoSuchElementException e){
            System.out.println("No such element Exception");
        }catch (ClassCastException e){
            System.out.println("Class cast Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }


        System.out.println("---------------------------------------------------------");

       String[] names = {"Walid",  "Agalar", "Ayjeren"};

       try {
           names[10] = "Muhtar";

       }catch (IllegalArgumentException e){
           System.out.println("Illeal Argument Exception");
       }catch (NoSuchElementException e){
           System.out.println("No such Element Exception");
       }catch (StringIndexOutOfBoundsException e) {
           System.out.println("String index out of bound exception");
       }catch (IndexOutOfBoundsException e){
           System.out.println("Index out of bounds exception");

       }catch (RuntimeException e ) {
           System.out.println("Runtime Exception");
       }

    }
}
