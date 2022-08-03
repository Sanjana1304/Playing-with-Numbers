/* Eg : 742
Its series : 7, 4, 2, 13, 19, 34, 66, 119, 219, 404, 742 (series of sum of the previous 3 digits)
and in this series if he given num itself comes,then the num is said to
be keith number
*/
import java.util.Scanner;

public class KeithNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();

        int num_preserved=num;
        String new_num=String.valueOf(num);
        int len=new_num.length();

        int arr[]=new int[3];
        for(int i=0;i<len;i++){
            int rem=num%10;
            num=num/10;
            arr[i]=rem;
        }
        int w=arr[2];
        int x=arr[1];
        int y=arr[0];
        System.out.print(w+" "+x+" "+y+" ");
        for(int i=0;i<100;i++){
            int z=w+x+y;
            w=x;
            x=y;
            y=z;
            System.out.print(z+" ");
            if(num_preserved==z){
                System.out.println("\nIts a keith num");
                break;
            }
            else if(z>num_preserved){
                System.out.println("\nIts not a keith num");
                break;
            } 
        }
        scn.close();
    }
}
