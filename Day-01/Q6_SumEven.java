// Q6: Sum of even numbers from 1 to N

import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        int i=1;
        while(i<=n)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            i++;
        }
        System.out.print(sum);
    }
}
