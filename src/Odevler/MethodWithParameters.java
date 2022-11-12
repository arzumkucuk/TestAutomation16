package Odevler;

public class MethodWithParameters {

    public static void main(String[] args) {

        caclculateage(1995,2022);
    }

    public static void caclculateage (int birthyear, int currentyear ){

        if (birthyear<currentyear){
            System.out.println("Your age is:"+(currentyear-birthyear)+" years old");
        }else{
            System.out.println("invalid");
        }
    }
}
