/* A positive integer whose sum of digits 
of its square is equal to the number itself is 
called a neon number.
Eg : 9 
square is 81 => 8+1=9(given number itself)
*/
import java.util.Scanner;

public class NeonNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();
        
        int sq=num*num;
        System.out.println("Square is : "+sq);
        String new_sq=String.valueOf(sq);
        int len=new_sq.length();

        int sum=0;
        for(int i=0;i<len;i++){
            int rem=sq%10;
            sq=sq/10;
            sum+=rem;
        }
        System.out.println("Sum is : "+sum);
        if(sum==num)
            System.out.println("It is a neon number");
        else
        System.out.println("It is not a neon number");
        scn.close();
    }
}
