import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MeningMean {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer("");
        token = new StringTokenizer(br.readLine());
        int noOfTests = Integer.parseInt(token.nextToken());

        System.out.println("The number entered is:" + noOfTests);

//        long count = 0;
        for (int i = 0; i < noOfTests; ++i) {
            String temp[] = br.readLine().split(" ");
            int u = Integer.parseInt(temp[0]);
            int v = Integer.parseInt(temp[1]);
//
//            token = new StringTokenizer(br.readLine());
//            int v = Integer.parseInt(token.nextToken());
//            int u = Integer.parseInt(token.nextToken());
//            count += (u + v);
        }

        //System.out.println(count);
    }
}
