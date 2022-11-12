package day45_Exeptions;

public class LuchBreakException extends RuntimeException {

    public LuchBreakException(){
        super("It's time for lunch");
    }

    public LuchBreakException(String msg){
        super(msg);
    }

}
/*
class Test{

    public static void main(String[] args) {

        throw  new LuchBreakException("");
    }
    }
 */

