package day35_Custom_Class;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.setInfoBankAc("Arzum", "123456789");

        account1.getInfo();

        account1.deposit(100); // available:100

        account1.withDraw(80);// 20

        account1.withDraw(20); //0

        account1.deposit(100000); // available:100000

        account1.showBalance();


        BankAccount account2 = new BankAccount();

        account2.setInfoBankAc("ErenK", "38576385638");

        account2.deposit(200);

        account2.showBalance();




    }
}
