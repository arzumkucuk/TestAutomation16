package day19_ForLoop;

public class Characters_A_Z {

    public static void main(String[] args) {

        for (char ch ='A'; ch <= 'Z'; ch++ ){ // you can 'a' to 'z'

            System.out.print(ch+" ");
        }
        System.out.println();

        for (int i=97; i<=122; i++){
            System.out.print( (char)i+" ");
        }

        System.out.println();
        System.out.println("============================================");

        //task06

        for (char ch='Z'; ch>='A'; ch--){

            System.out.print(ch+" ");
        }

        System.out.println();

        for (int i =90; i>= 65; i--){
            System.out.print(( char)i+" ");
        }

    }

}
