/*
A number is called a tech number if the given number has an even 
number of digits and the number can be divided exactly into two 
parts from the middle. After equally dividing the number, sum up 
the numbers and find the square of the sum. If we get the number 
itself as square, the given number is a tech number, else, not a 
tech number. For example, 2025 is a tech number.
*/
import java.util.Scanner;

public class TechNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();

        String new_num=String.valueOf(num);
        int len=new_num.length();

        if(len%2==0){
            System.out.println("Has even no of digits");
            int len_half=(len/2); //to split
            String frst_half=new_num.substring(0,len_half); //to get frst half of the num
            String sec_half=new_num.substring(len_half,len); //to get second half of the num
            
            int frst=Integer.parseInt(frst_half);
            int sec=Integer.parseInt(sec_half);
            System.out.println("Frst half : "+frst);
            System.out.println("Second half : "+sec);
            
            int sum=frst+sec;
            System.out.println("Sum = "+sum);
            int sq=sum*sum;
            System.out.println("Square of sum = "+sq);
            
            if(num==sq){
                System.out.println("Square of sum of the two halves is equal to the given num");
                System.out.println("It is a tech number");
            }
            else{
                System.out.println("Square of sum of the two halves is not equal to the given num");
                System.out.println("So It is not a tech number");
            }
            
        }
        
        else{
            System.out.println("Does not have even no of digits");
            System.out.println("It is not a tech number");
        }
        scn.close();
    }
}
