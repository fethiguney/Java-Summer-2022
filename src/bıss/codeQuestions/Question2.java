package bıss.codeQuestions;


public class Question2 {



    public static void main(String[] args) {

        String str="This is not not";
        System.out.println(equalIsNot(str));


    }

    public static boolean equalIsNot(String str) {

        //define two variables for the "is" count and the "not" count
        int isCount = 0;
        int notCount = 0;

        //get the index of "is" using indexof() method and count the sum of the "is"
        int index = 0;
        while ((index = str.indexOf("is", index)) != -1) {
            isCount++;
            index += 2; // move past the "is"
        }

        //get the index of "not" using indexof() method and count the sum of the "not"
        index = 0;
        while ((index = str.indexOf("not", index)) != -1) {
            notCount++;
            index += 3; // move past the "not"
        }
        System.out.println("not count :"+notCount);
        System.out.println("is count : "+isCount);

        return isCount == notCount;
    }

}
