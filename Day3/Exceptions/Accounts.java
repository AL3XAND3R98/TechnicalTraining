package Day3.Exceptions;

public class Accounts {
    
    public void SalarySlip(String name, int salary, int absenties) throws AbsentiesException{
        float tax, netsalary;
        if(absenties>10)
        {
            AbsentiesException ref = new AbsentiesException();
            throw ref;
        }
        else
        {
            tax = (float) salary*25/100;
            netsalary = salary - tax;
            System.out.println("Employee Name: "+name);
            System.out.println("Your salary is: "+ salary);
            System.out.println("Your Tax Is: "+ tax);
            System.out.println("Your Net Salart is: "+ netsalary);
        }
    }
}
