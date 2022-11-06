public class Lecture22 {
    public static void main(String[] args) {
        double[] someSillyNums;
        someSillyNums = new double[3];
        someSillyNums[0] = 33.4;
        someSillyNums[2] = 44.3;
        for (int i = 0; i <= someSillyNums.length - 2; i++) {
            System.out.println(someSillyNums[i + 1]);
        }
    }
}
