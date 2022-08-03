
/*A positive integer is called a spy number if the 
sum and product of its digits are equal. In other words, 
a number whose sum and product of all digits are equal 
is called a spy number.
Eg : 1124
1+1+2+4=1*1*2*4
*/
import java.util.Scanner;

public class spyNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num=scn.nextInt();

        String new_num=String.valueOf(num);
        int len=new_num.length();

        int sum=0,mul=1;
        for(int i=0;i<len;i++){
            int rem=num%10;
            num=num/10;
            sum+=rem;
            mul*=rem;
        }
        System.out.println("Sum of digits is : "+sum);
        System.out.println("Mul of digits is : "+mul);
        if(sum==mul)
            System.out.println("its a spy number");
        else
            System.out.println("Its not a spy number");
        scn.close();

    }
}
