
/*A number is called an automorphic number if and only if the 
square of the given number ends with the same number itself. 
For eg, 25, 76 are automorphic numbers because their square is 
625 and 5776, respectively and the last two digits of the square 
represent the number itself.
*/

import java.util.Scanner;

public class automorphicNum {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();
        
        String new_num=String.valueOf(num);
        int len=new_num.length();
        
        int sq=num*num;
        System.out.println("Square is : "+sq);
        String rem_sum="";
        for(int i=0;i<len;i++){
            int rem=sq%10;
            sq=sq/10;
            String new_rem=String.valueOf(rem);
            rem_sum=new_rem+rem_sum;
        }
        System.out.println("Last "+len+" digits are : "+rem_sum);
        if(new_num.equals(rem_sum))
            System.out.println("It is an automorphic number");
        else
            System.out.println("It is not an automorphic number");
        scn.close();

    }
}
