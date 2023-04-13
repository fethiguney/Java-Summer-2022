package bıss;

public class Q3 {

    public static void main(String[] args) {

        int[] input = {3, 34, 9, 12, 5, 2, 4};
        int sum = 12;

        checkIsThereSubset(input,sum);

    }

    public static void checkIsThereSubset(int[] input, int sum){
        boolean isThereNegative=false;
        for (int k : input) {
            if (k < 0) {
                System.out.println("All input integers must be non-negative");
                isThereNegative = true;
            }
        }
        if(!isThereNegative) {
            int subset = 0;
            boolean condition = false;

            for (int i = 0; i < input.length - 1; i++) {
                for (int j = i + 1; j < input.length; j++) {
                    subset = input[i] + input[j];
                    if (subset == sum) {
                        System.out.println("True");
                        System.out.println("There is a subset (" + input[i] + "," + input[j] + ") with sum " + sum);
                        condition = true;
                        break;
                    }
                }
            }

            if (!condition) {
                System.out.println("False");
                System.out.println("There is no subset that add up to " + sum);
            }

        }



    }
}
