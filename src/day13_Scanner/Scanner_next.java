package day13_Scanner;

import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your company name:");

        String companyName = scan.next();  // next() ozelligi cevap verildiginde ilk kelimesi cikar. sadece ilk kelime
        System.out.println("Your company name is: "+ companyName);

    }

}
