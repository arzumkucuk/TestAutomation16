package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {

        /*
        Stirng methods;
        charAt, + , length, upper, lower,
         */

        // charAt(index); ==> char

        String str ="Cybertek";
        //           01234567

        char ch1= str.charAt(7);
        System.out.println(ch1);

        // + :

        String str2= "Cybertek";
        str2 = str2 + " School";

        System.out.println(str2);

        // length() ==> int

        String str3= "Cybertek School";
        int l = str3.length();

        System.out.println(l);

        // lastIndex: length-1

        String s4 = "Cybertek";
        char ch2 = str3.charAt(l-1);

        System.out.println("last index: "+ ch2); // str3.length()-1

        //  upperCase & lowerCase

        String str4= "cybertek";
        str4 = str4.toUpperCase(); // "CYBERTEK"

        System.out.println(str4);

        String str5= "JAVA";
        str5 = str5.toLowerCase(); //"java"

        System.out.println(str5);

        // trim() gereksiz bosluklsri siler

        String str6 = "    Cybertek     ";
        str6 = str6.trim();
        System.out.println(str6);

        // substring: basladigin karakter dahil bitirdigin karakter dahil olmaz. (7,11) gibi 7 dahil 11 dahil ddegil

        String str7 = "I like Java Language";
        String word =  str7.substring(7,11); // Java ==>
        System.out.println(word);

        String word2= str7.substring(12, str7.length());
        System.out.println(word2);
        String word3 = str7.substring(12);
        System.out.println(word3);

        String word4 = str7.substring(2,5+1);
        System.out.println(word4);


        // indexOf & lastIndexOf ==> int

        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);

        System.out.println(str8.charAt(i1));

        int i2= str8.indexOf(", W") + 2;
        int i3= str8.indexOf("We");
        System.out.println(i2);
        System.out.println(i3);

        String str9="Java Java Java";

        int i4= str9.lastIndexOf("J");
        int i5=str9.indexOf("J");

        int i6= str9.indexOf(" Java ")+1;
        int i7= str9.lastIndexOf("Java ");

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);

        // replace & replaceFirst:

        String s1= "I like Java, Java is a programming language";
        s1=s1.replace("Java","C#"); //"...."

        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");

        System.out.println(s2);

        String s3= "I like Java, Java is a programming language";
        s3 = s3.replace("Java is", "C# is");

        System.out.println(s3);










    }
}
