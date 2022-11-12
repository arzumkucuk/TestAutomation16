package day35_Custom_Class;

import java.time.LocalDate;

public class BankAccount {

    /*
    Attiributes:
            AccountName, accountNumber, avaliableBalance

    Actions:
            SetInfo: set

     */

    public String accountName;
    public String accountNumber;
    public double availableBalance = 0;

    public void setInfoBankAc(String acctName, String acctNum) {
        accountName = acctName;
        accountNumber = acctNum;
        //availableBalance = avlblBlnce;


    }

    public void getInfo(){
        System.out.println("===============================================");
        System.out.println("Date: "+ LocalDate.now() );
        System.out.println("Account Name: "+ accountName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Avaliable Balance: "+ availableBalance);
        System.out.println("===============================================");
    }

    public void deposit(double amount){
        availableBalance += amount;
    }

    public void withDraw(double amount){
        availableBalance -= amount;
    }

    public void showBalance(){
        System.out.println("As of today "+ LocalDate.now()+ " your available balance is: $"+ availableBalance);
    }

}
