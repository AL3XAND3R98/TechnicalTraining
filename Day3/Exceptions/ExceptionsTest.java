package Day3.Exceptions;

public class ExceptionsTest {

    public static void main(String[] args) {
        String num1, num2;
        float result;

        num1 = "10";
        num2 = "2";

        try {
            result = (float) Integer.parseInt(num1) / Integer.parseInt(num2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Only digits can be used in this operation");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
   
}
