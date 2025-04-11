public final class MajorOak {
    public static void main(String[] args) {
        System.out.println(isNumberOdd(calculateLeafs(1,1)));
        System.out.println(isNumberOdd(calculateLeafs(2,1)));
        System.out.println(isNumberOdd(calculateLeafs(2,2)));
        System.out.println(isNumberOdd(calculateLeafs(3,2)));
        System.out.println(isNumberOdd(calculateLeafs(4,4)));

    }

    static int calculateLeafs(int requestedYear, int lifeSpan) {
        int sum = 0;

        for (int i=requestedYear-lifeSpan+1; i<=requestedYear; i++) {
            sum += Math.pow(i, i);
        }
        return sum;
    }

    static String isNumberOdd(int number) {
        if (number%2 == 0) return "YES";
        else return "NO";
    }
}
