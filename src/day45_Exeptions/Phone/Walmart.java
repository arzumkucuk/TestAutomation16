package day45_Exeptions.Phone;

public class Walmart {

    public static void main(String[] args) {

        long number = 911;
        iPhone iPhone = new iPhone("13 pro","USA", 1200);
        Samsung samsung = new Samsung("S20","Korea", 1000);
        Nokia nokia = new Nokia("nokia", "Brick", "finland", 500);

        iPhone.call(number);
        iPhone.faceTime(12355);

        samsung.freeze();
        samsung.text(number);

        nokia.call(number);
       // nokia.faceTime(); olmaz cunku iPhone classin aait bir ozellik

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}
