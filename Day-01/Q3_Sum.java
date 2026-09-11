// Q3: Sum from 1 to N

import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        int sum=0;
        for(int i=n;i>=1;i--)
        {
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
