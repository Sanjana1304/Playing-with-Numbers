/*A number is said to be Peterson 
if the sum of factorials of each digit is equal to the sum 
of the number itself.
Eg : 145 = 1!+4!+5! 
*/
import java.util.Scanner;

public class petersonNo {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();

        String new_num=String.valueOf(num); 
        int len=new_num.length();

        int sum=0;
        for(int i=0;i<len;i++){
            int rem=num%10;
            num=num/10;
            int facto=1;
            for(int j=1;j<=rem;j++){
                facto=facto*j;
            }
            sum+=facto;
        }
        System.out.println("Sum of the factorials is : "+sum);
        scn.close();
    }
}
