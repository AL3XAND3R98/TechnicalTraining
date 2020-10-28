package Day3.Exceptions;

public class MainEntryPoint {
    public static void main(String[] args) {
        Accounts salesDepartment = new Accounts();
        Accounts itDepartment = new Accounts();

        try{
            salesDepartment.SalarySlip("Alex", 10000, 8);
        }
        catch (AbsentiesException e) {
            System.out.println("Pls send time report");
        }
        try {
            itDepartment.SalarySlip("Shaq", 5000, 8);
        } catch (Exception e) {
            System.out.println("It is fine");
        }
    }
}
