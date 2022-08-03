/*The ISBN number is a legal number when 
1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 
+ 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10 i
s divisible by 11. The digits are taken from right to left.

Eg : 1259060977
Sum = (1*10) + (2*9) + (5*8) + (9*7) + (0*6) + (6*5) + (0*4) + (9*3) + (7*2) + (7*1)
And this sum should be divisible by 11.
*/

import java.util.Scanner;

public class ISBN_No {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num=scn.nextInt(); //used long as some 10 digit numbers might be big
        String new_num=String.valueOf(num);
        int len=new_num.length();

        if(len==10){
            int sum=0;
            for(int i=1;i<len+1;i++){
                int rem=(int)num%10;
                num=num/10;
                int mul=i*rem;
                sum+=mul;
            }
            System.out.println("The sum in that pattern is : "+sum);
            if(sum%11==0)
                System.out.println("It is an ISBN Number");
            else
                System.out.println("It is not an ISBN Number");
        }
        else
        System.out.println("It is not an ISBN Number");
        
        scn.close();
    }
}
