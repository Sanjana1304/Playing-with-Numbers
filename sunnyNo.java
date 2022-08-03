
/* A number is called a sunny number 
if the number next to the given number is a perfect square. 
In other words, a number N will be a sunny number if N+1 is a 
perfect square.

*/

import java.util.Scanner;

public class sunnyNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();

        int next_num=num+1;
        System.out.println("Next number is : "+next_num);
        double sqr = Math.sqrt(next_num);
        
        int new_sqr=(int)sqr;
        if(sqr==new_sqr){
            System.out.println("which is a perfect square");
            System.out.println("So "+num+" is a sunny number");
        }   
        else{
            System.out.println("which is not a perfect square");
            System.out.println("So "+num+" is not a sunny number");
        }
        scn.close();
    }
}
