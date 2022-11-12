package day41_Encapsulation;

public class Login {

    public static void main(String[] args) {

        Credentials obj = new Credentials();

        //System.out.println(obj.userName);
        //obj.userName = "ABC";
        //System.out.println(obj.userName);

        System.out.println(obj.getUserName());

        System.out.println(obj.getPassword());

        //obj.getPassword() =123456; Read ONLY

      //  obj.userName ="HI";
        obj.setUserName("Hello");
        System.out.println(obj.getUserName() );

        obj.setPassWord(234344);
        System.out.println(obj.getPassword() );



    }

}
