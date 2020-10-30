package Day4.Interfaces;

public class Main {
    public static void main(String[] args) {
        Test ref = new Test();
        Banking(ref);

        HSBC hsbc = new HSBC();
        Banking(hsbc);

        Barclays barclays = new Barclays();

    }

    public static void Banking(BankOfEngland bankingRef) 
    {
        bankingRef.showBalance();
        bankingRef.openAccount();    
    }
}
