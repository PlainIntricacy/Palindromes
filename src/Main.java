/**
 * https://www.reddit.com/r/dailyprogrammer/comments/3kx6oh/20150914_challenge_232_easy_palindromes/
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of lines to be read:");
        int lines = Integer.parseInt(input.nextLine());
        String parse="";

        System.out.println("Please enter your lines of text below.");

        for(int i=0; i<lines; i++){
            parse+=cleanText(input.nextLine().toLowerCase());
        }

        System.out.println("Current content of parsed text:");
        System.out.println(parse);
        System.out.println();
        System.out.println("Is the given text a palindrome? " + calcPalindrome(parse));

    }

    public static String cleanText(String q){
        q = q.replaceAll("[^a-zA-Z]+","");
        return q;
    }

    public static boolean calcPalindrome(String q){
        boolean status = true;
        int i=0, j=q.length()-1;
        while(status&&j>i){
            if(q.charAt(i)!=q.charAt(j)){
                status = false;
            }
            ++i;
            --j;
        }
        return status;
    }
}
