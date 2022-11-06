public class ArrayExample5 {
    public static void main(String[] args) {

        int[] aHandfulOfDigits = {2, 9, 16, 25, 36, 49};

        // Array values can be used as any other variable
        int sumOfFirstTwo = aHandfulOfDigits[0]
                + aHandfulOfDigits[1];
        System.out.println("Sum of first two: " + sumOfFirstTwo);

        // Array elements can be used in relational ops
        if (aHandfulOfDigits[3] < aHandfulOfDigits[0]) {
            System.out.println("First elements larger than fourth");
        }

        // Array elements can also be used as loop
        int myCounter = -7;
        while (aHandfulOfDigits[3] == 25) {
            if (myCounter == 0) aHandfulOfDigits[3] = 65;
            System.out.println("Value of aHandfulOfDigits[3] : "
                    + aHandfulOfDigits[3]);
            myCounter++;
        }
    }
}