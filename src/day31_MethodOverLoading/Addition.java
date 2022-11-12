package day31_MethodOverLoading;

public class Addition {
    public static void main(String[] args) {

        System.out.println(  addition2numbers(100,200)  );
        System.out.println(   addition3numbers(100,200,300)  );
        System.out.println(   addition4numbers(100,200,300,400)  );

    }

    public static int addition2numbers (int a, int b){
        return a+b;
    }

    public static int addition3numbers (int a, int b, int c){
        return addition2numbers(a,b)+c;
    }

    public static int addition4numbers (int a, int b, int c, int d){
        return addition2numbers(a,b) + addition2numbers(c,d);
    }
}
