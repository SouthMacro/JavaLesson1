import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainProgram
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Please choose operation number:");
        System.out.println("1) A method that checks the square root of a number.");
        System.out.println("2) A method that checks a number to a specified degree.");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputTaskValue = Integer.parseInt(bufferedReader.readLine());

        if (inputTaskValue == 1)
        {
            System.out.println("Please, input a number:");
            try
            {
                double inputNumber = Double.parseDouble(bufferedReader.readLine());
                System.out.print("Your result is: ");
                System.out.format("%.3f%n", GetSqrtResult(inputNumber));
            }
            catch(NumberFormatException ex){
                System.out.println("Something error " + ex.getMessage());
            }
        }
        else if (inputTaskValue == 2)
        {
            System.out.println("Please, input a number and pow value:");
            try
            {
                int inputNumber = Integer.parseInt(bufferedReader.readLine());
                int powValue = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Your result is: " + GetPowResult(inputNumber, powValue));
            }
            catch(NumberFormatException ex){
                System.out.println("Something error " + ex.getMessage());
            }
        }
        else
        {
            throw new Exception("Please input a valid number(1 or 2)");
        }
    }

    /**
     * This method returns the square root of a number.
     * @param firstValue - is square root of a number.
     * @return square root of a number.
     */
    private static double GetSqrtResult(double firstValue)
    {
        return Math.sqrt(firstValue);
    }

    /**
     *
     * @param firstNumber - is number to set pow result.
     * @param powValue - is pow value.
     * @return a number to a specified degree.
     */
    private static int GetPowResult(int firstNumber, int powValue)
    {
        return (int)Math.pow(firstNumber, powValue);
    }
}
