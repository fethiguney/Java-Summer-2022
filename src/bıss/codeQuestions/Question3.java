package bıss.codeQuestions;

public class Question3 {

    public static void main(String[] args) {
        int[] input = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        if (isSubsetSum(input, sum)) {
            System.out.println("True");
            System.out.println("There is a subset with sum "+sum);
        } else {
            System.out.println("False");
            System.out.println("There is no subset that add up to "+sum);
        }

    }


    public static boolean isSubsetSum(int[] input, int sum) {

        int n = input.length;
        boolean[][] subset = new boolean[sum + 1][n + 1];
        for (int k = 0; k < input.length ; k++) {
            if(input [k] < 0){
                System.out.println("All inputs must be non-negatif integer");

            } else {
                for (int i = 0; i <= n; i++) {
                    subset[0][i] = true;
                }
                for (int i = 1; i <= sum; i++) {
                    subset[i][0] = false;
                }
                for (int i = 1; i <= sum; i++) {
                    for (int j = 1; j <= n; j++) {
                        subset[i][j] = subset[i][j - 1];
                        if (i >= input[j - 1]) {
                            subset[i][j] = subset[i][j] || subset[i - input[j - 1]][j - 1];
                        }
                    }
                }
            }
        }



        return subset[sum][n];
    }


}
