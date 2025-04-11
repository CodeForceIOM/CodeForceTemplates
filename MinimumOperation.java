import java.util.Scanner;

public class MinimumOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();        // read input as integer
        // Start writing your solution here. -------------------------------------

      /*

      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String

      int result = 3*n;
      out.println(result);                    // print via PrintWriter
      */

       System.out.println(n);
        sc.close();


    }
    public static int findMinOps(int n, int k) {
        if (n==0)
            return 0;
        if (k == 1)
            return n;

        int sub = n;
        int index = 0;

        while (sub > 1) {
            index++;
            sub = sub - (int) Math.pow(k, maximPower(sub, k));
        }

        if (index == 1)
            if (sub == 1)
                return index +1;
            else return index;
        return index + 1;
    }

    public static int maximPower(int n, int k) {
        int interator = 0;
        int power = 1;

        if (k == 1)
            return 0;

        while (power < n) {
            power = power * k;

            if (power==n)
                interator++;

            interator++;
        }

        return interator - 1;
    }
}
