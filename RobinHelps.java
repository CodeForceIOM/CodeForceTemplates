import java.util.List;

public final class RobinHelps {
    record TestCase (int noOfPeople, int threshold, List<Integer> goldOfEachPerson) {}

    public static void main(String[] args) {

        int numberOfTestCases = 4;
        TestCase case1 = new TestCase(2,2 , List.of(2,0));
        TestCase case2 = new TestCase(3,2 , List.of(3,0,0));
        TestCase case3 = new TestCase(6,2 , List.of(0,3,0,0,0,0));
        TestCase case4 = new TestCase(2,5 ,List.of(5,4));

        List<TestCase> tests = List.of(case1,case2,case3,case4);

        for(TestCase test:tests) {
            int noOfRecievers = 0;
            int pot = 0;
            for(int noOfCoin:test.goldOfEachPerson()) {
                if(noOfCoin >= test.threshold()) {
                    pot += noOfCoin;
                }
                else if( noOfCoin == 0 && pot > 0) {
                    noOfRecievers += 1;
                    pot --;
                }
            }
            System.out.println(noOfRecievers);
        }

    }
}
