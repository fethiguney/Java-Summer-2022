package bıss;

public class Q3 {

    public static void main(String[] args) {

        int[] input = {3, 34, 6, 12, 5, 2, 4};
        int sum = 12;

        int subset=0;
        boolean condition=false;

        for (int i = 0; i < input.length-1 ; i++) {
            for (int j =i+1; j < input.length ; j++) {
                subset=input [i]+ input[j];
                if (subset==sum){
                    System.out.println("True");
                    System.out.println("There is a subset ("+input[i]+","+input[j]+") with sum "+sum);
                    condition=true;
                    break;
                }
            }
        }

        if (!condition) {
            System.out.println("False");
            System.out.println("There is no subset that add up to "+sum);
        }


    }
}
