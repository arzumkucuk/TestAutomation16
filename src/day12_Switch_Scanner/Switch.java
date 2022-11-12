package day12_Switch_Scanner;

public class Switch {

    public static void main(String[] args) {

        int a = 20;

        switch (a){

            case 5:
                System.out.println("Five");
                break;

            case 1:
                System.out.println("one");
                break;

            default:     // her hangi yere yazabilirsin, sonda olmak zorunlu degil 'if' gibi degil. mantikli olan sona yazmak
                System.out.println("Invalid case");
                break;

    // break line silersen eger hepsini print out yapar.

        }



    }
}
