package Day4.Interfaces;

public class Test implements BankOfEngland{

    public void openAccount(){
        for(int i=0; i<=10;i++)
        {
            System.out.println(i);
        }
    }

    public void showBalance(){
        System.out.println("Show Balance in Barclays Bank");
    }
    
}
