
/*Multiplying a number by two and three separately, the number 
obtained by writing the results obtained with the given number 
will be called a fascinating number. If the result obtained after 
concatenation contains all digits from 1 to 9, exactly once.
Eg: 327
327×2=654
327×3=981
Now, concatenate the above results to the given number (n):
"327"+"654"+ "981"= 327654981 (it contains all digits 1-9 only once)
*/
import java.util.Scanner;

public class fascinatingNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();
        int num2=num*2;
        int num3=num*3;

        String new_num=String.valueOf(num);
        String new_num2=String.valueOf(num2);
        String new_num3=String.valueOf(num3);

        String total=new_num+new_num2+new_num3;
        System.out.println("Resultant number : "+total);
        
        boolean found=true;
        for(char c='1';c<='9';c++){
            int count=0;
            for(int i=0;i<total.length();i++){
            if(total.charAt(i)==c)
                count++;
            }
            if(count>1||count==0){
                found=false;
                break;
            }
        }
        if(found)
            System.out.println(num + " is a fascinating number.");
        else
        System.out.println(num + " is not a fascinating number.");  
        scn.close();
    }
}
