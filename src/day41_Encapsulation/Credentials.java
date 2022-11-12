package day41_Encapsulation;

public class Credentials {

    private String userName = "cybertek";
    private double passWord = 123456;

    public String getUserName(){
        return userName;
    }
    public double getPassword(){
        return passWord;
    }

    public void setUserName(String userName){
        this.userName = userName;
        /*
        if (userName.length() < 8){
            return;
            // we can also do security check in setter of Encapsulation
        }

         */
    }

    public void setPassWord(double passWord){
        this.passWord = passWord;
    }











}
