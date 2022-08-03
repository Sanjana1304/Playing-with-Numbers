import java.util.Scanner;

public class autobioNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the number : ");
        int num=scn.nextInt();
        //int num_preserved=num;
        //String new_num=String.valueOf(num);
        //int len=new_num.length();

        int digitcount[]=new int[10];
        while(num!=0){
            int rem=num%10;
            digitcount[rem]++;
            num=num/10;
        }
        for(int i=0;i<digitcount.length;i++){
            if(digitcount[i]!=0)
            System.out.println(i+":  "+digitcount[i]);
        }
        scn.close();
    }
}//3211000
