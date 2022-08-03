//find the factorial of a given number
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();
        int facto=1;
        for(int i=1;i<=num;i++)
            facto=facto*i;
        System.out.println("Factorial of the given number : "+facto);
        scn.close();
    }
}
