package day40_Constructor;

public class ConstructorIntro {
    static int b; // only 1 copy


    static{
        System.out.println("static block");
        b = 200; // 1
    }

    public ConstructorIntro(int a){ // class name ile ayni olmali
        System.out.println("Constructor with int argument");
        b = 200;
        this.a = a;
    }

    int a = 100;

    public static void main(String[] args) {

        System.out.println("Hello");
       // System.out.println(a); non static not accepted in the static method

        int num = new ConstructorIntro(200).a;  // a =200

        ConstructorIntro obj2 = new ConstructorIntro(300); // a=300
        ConstructorIntro obj3 = new ConstructorIntro(400); // a=400

    }


}
