/*A number is called an emirp number if we get another prime 
number on reversing the number itself. In other words, 
an emirp number is a number that is prime forwards or backward. 
Note: Palindrome primes are excluded.
Eg : 13 : Its reverse is 31. So both 13 n 31 r primes
*/

import java.util.Scanner;

public class emirpNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scn.nextInt();
        int num_preserved=num;
        String new_num=String.valueOf(num);
        int len=new_num.length();
        
        String rev="";
        for(int i=0;i<len;i++){
            int rem=num%10;
            num=num/10;
            rev+=rem;
        }
        int reverse=Integer.parseInt(rev);
        System.out.println("Reverse is : "+reverse);

        if(num_preserved==reverse)
            System.out.println("Its a palindrome,so its not a emirp number");
        else{
            //frst checking if num is prime
            int count1=0;
            for(int i=2;i<(num_preserved/2);i++){
                if(num_preserved%i==0)
                count1++;
            }
            boolean res1=true;
            if(count1==0)
                res1=true;
            else
                res1=false;

            //checking if reverse is also prime
            int count2=0;
            for(int i=2;i<(reverse/2);i++){
                if(reverse%i==0)
                count2++;
            }
            boolean res2=true;
            if(count2==0)
                res2=true;
            else
                res2=false;
            
            if (res1 && res2)
                System.out.println("It is a emirp number");
            else
                System.out.println("It is not a emirp number");
        }
        
        scn.close();
        
    }
}
