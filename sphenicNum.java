/*A number will be a sphenic number if the product 
of three distinct prime numbers(its factors) gives the number itself.
Eg : 30
Its factors are 2,3,5,6,10,15
Considering only its prime factors -> 2,3,5 -> product of these 3 gives 
the number(30) itself
*/

import java.util.Scanner;

public class sphenicNum{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();
        int mul=1;
        System.out.println("Prime factors are : ");
        for(int i=2;i<num;i++){
            if(num%i==0){
                int count=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        count+=1;
                    }
                }
                if(count==0){
                    System.out.println(i);
                    mul=mul*i;
                }
            }
        }
        System.out.println("Product of the prime factors : "+mul);
        if(num==mul)
            System.out.println("Therefore ,Its a sphenic number");
        else
            System.out.println("Therefore ,Its not a sphenic number");
        scn.close();
                
    }
}
