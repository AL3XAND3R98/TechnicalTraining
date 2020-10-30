package Day4.Interfaces;

public class HSBC extends QA implements BankOfEngland {

    public void openAccount(){
        System.out.println("Account opened in HSBC");
    }

    public void showBalance(){
        System.out.println("Balance shown in HSBC");
    }
    
}
