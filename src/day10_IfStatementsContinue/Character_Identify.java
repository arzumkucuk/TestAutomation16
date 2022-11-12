package day10_IfStatementsContinue;

public class Character_Identify {

    public static void main(String[] args) {

        char character = 'A';
        //                      65 <= character <= 90              ||       97 <= character <= 122
        boolean isAlphabetic = (character >= 65 && character<= 90) || (character>= 97 && character <= 122);
                    //          upper case letters                 ||          lower case letters
                    //  48 <= character <= 57
        boolean isDigit = (character >= 48 && character <= 57);

        String alphabet =""; // oncelikli bunu kullan!
                            // istersen bu sekilde sout yazmadan if altina ekle istersen de  sout olarak yaz.

       // System.out.println(character+ " is Alphabetic character");
      //  System.out.println(character+ " is not Alphabetic character");
     //   System.out.println();

        if (isAlphabetic){
          //  System.out.println(character+ " is Alphabetic character");
            alphabet = character + " is Alphabetic character";

        }else {
          //  System.out.println(character+ " is not Alphabetic character");
            alphabet = character + " is Alphabetic character";

        }
        System.out.println(alphabet);

        String digit = "";

        if (isDigit){
            digit = character + " is a digit";
        }else {
            digit = character + " is not a digit";
        }

        System.out.println(digit);











    }
}
