package day23_Arrays;

public class Array_Practice {

    /*
    3 main data structures:

            1. Array
            2. Collection
            3. Map

     Variable:
                DataType name= data;
                int num =1;
                // String friends ="Cybertek", "Muhtar", "Nadire"

     Array variable: a variable can have multiple data

            declare:
                    DataType[] arrayName = {data1, data2, data3 ... };

            initializing the size only:
                    DataType[] arrayName= new DataType[size];

                    length : returns the size of the array. total number of elements

                    last index = length -1





     */


    public static void main(String[] args) {

       //  String students = "Muhtar", "Asya", "Nadir"

        String[] students= {"Cybertek", "Muhtar", "Nadir", "Asiya", "Saim"};
        //indexOfNum   =         0           1        2        3        4

        String name1 =  students[4];  // eger index disi rakam verirsen sistem hata verir
        System.out.println(name1);

        System.out.println("=====================================");

        int [] scores = {85, 70, 95, 90, 100}; // size: 5
        //               0    1   2  3   4

        String[] names = {"Mike", "Adam", "Tonny", "John", "Amy"}; // size: 5
        //                 0        1       2        3      4

        /*
        System.out.println( names[0]+ " : " + scores[0] );
        System.out.println( names[1]+ " : " + scores[1] );
        System.out.println( names[2]+ " : " + scores[2] );
        System.out.println( names[3]+ " : " + scores[3] );
        System.out.println( names[4]+ " : " + scores[4] );
        */

        for (int i=0; i<=4; i++){   // 0, 1, 2, 3, 4
            System.out.println(names[i]+ " : " + scores[i]); // soutla hepsini tek tek yazmak yerine bu sekilde yazariz.
        }

        System.out.println("================================================");

        String[] classMates = new String[5];  // size is 5,
        classMates[0] = "Fatih";
        classMates[2] = "Hazel";
        classMates[1] = "Viorel";
        classMates[3] = "Elkem";
        classMates[4] = "Ahmed";

        // Stringin default u nedir?
        // null olarak cikar. Array de tanimladigimiz string bos ise output null cikar.

        for (int i = 0; i <= classMates.length-1; i++){
            System.out.println(classMates[i]);
        }












    }
}
