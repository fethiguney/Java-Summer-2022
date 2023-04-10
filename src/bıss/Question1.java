package bıss;


import java.util.Arrays;

public class Question1 {

    public static void main(String[] args) {

        int lengthOfArray=4;
        String integers="5 4 3 2";

        getSmallestAbsolutePairs(lengthOfArray, integers);

    }

    public static void getSmallestAbsolutePairs(int lengthOfArray, String integers) {


        //put the integers in a array container
        String [] parts=integers.split(" ");
        int [] numbers=new int[parts.length];
        for (int i = 0; i <parts.length ; i++) {
            numbers[i]=Integer.parseInt(parts[i]);
        }


        //check the length of the array whether equals given number of integers
        if (lengthOfArray== numbers.length) {

            //check the all array inputs are unique
            long amount= Arrays.stream(numbers).distinct().count();
            if (amount== numbers.length) {
                //sort the array
                Arrays.sort(numbers);

                //get the smallest absolute difference between two integers
                int minDiff=Integer.MAX_VALUE;
                for (int i = 1; i <numbers.length ; i++) {
                    int diff=Math.abs(numbers[i]-numbers[i-1]);
                    if(diff<minDiff){
                        minDiff=diff;
                    }
                }
                System.out.println("The smallest absolute difference between two given integers = "+minDiff);

                //print the pair of integers with the smallest absolute value
                for (int i = 1; i <numbers.length ; i++) {
                    if(numbers[i]-numbers[i-1]==minDiff) {
                        System.out.print(numbers[i-1]+" "+numbers[i]+" ");
                    }
                }
            } else {
                System.out.println("All the array inputs are not unique");
            }

        } else {
            System.out.println("The length of the array is not equal to the number of integers list");
        }

    }



}
