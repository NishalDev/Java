package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class integer {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
       
        try {
            System.out.println("Enter numerator: ");
            int a=sc.nextInt();

            System.out.println("Enter denominator: ");
            int b=sc.nextInt();

            int result = a/b;
            System.out.println("Result:"+result);
        } catch (ArithmeticException e) {
            System.out.println("Entered denominator is 0, divide by zero exception!");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter valid input!");
        }
        finally{
            sc.close();
        }
     }
    
}
