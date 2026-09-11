// Q7: Count odd numbers from 1 to N

import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        int i=1;
        while(i<=n)
        {
            if(i%2==0)
            {
                
            }
            else{
                count=count+1;
            }
            i++;
        }
        System.out.print(count);
    }
}
