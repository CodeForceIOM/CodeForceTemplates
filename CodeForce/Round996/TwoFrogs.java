package CodeForce.Round996;

import java.util.Scanner;

public class TwoFrogs {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int noOfTest = in.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            if (n%2 == 1 && Math.abs(a-b)%2==0) {
                System.out.println("YES");
            } else if (n%2 == 0 && Math.abs(a-b)%2==0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }

}
