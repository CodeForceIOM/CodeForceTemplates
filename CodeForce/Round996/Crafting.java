package CodeForce.Round996;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class Crafting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfTest = in.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int noMaterials = in.nextInt();
            List<Integer> have = new ArrayList<Integer>();
            List<Integer> needed = new ArrayList<Integer>();

            for (int j = 0; j < noMaterials; j++) {
                have.add(in.nextInt());
            }

            for (int j = 0; j < noMaterials; j++) {
                needed.add(in.nextInt());
            }

            if(canMake(have, needed)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean canMake(List<Integer> have, List<Integer> need) {

        int noZeros = 0;
        for (int i =0; i<need.size(); i++) {
            if (need.get(i) == 0) {
                noZeros +=1;
            }
        }
        if( noZeros == need.size()-1 && have.stream().mapToInt(a->a).sum() ==need.stream().mapToInt(a->a).sum()) {
            return true;
        }
        List<Integer> missing = new ArrayList<>();
        for (int i=0; i<have.size(); i++) {
            missing.add(have.get(i)-need.get(i));
        }
        missing = missing.stream().sorted().toList();

        int defficient = Math.abs(missing.get(0));

        List<Integer> compare = new ArrayList<>();
        for (int i=1; i<missing.size(); i++) {
            compare.add(missing.get(i));
        }
        OptionalInt min = compare.stream().mapToInt(a->a).min();

        if (min.isPresent()) {
            if (min.getAsInt() >= defficient) {
                return  true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
