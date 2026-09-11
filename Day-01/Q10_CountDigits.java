import java.util.Scanner;

class Q10_CountDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int count = 0;
        int i = n;

        while(i != 0) {
            count++;
            i = i / 10;
        }

        System.out.print(count);
    }
}
