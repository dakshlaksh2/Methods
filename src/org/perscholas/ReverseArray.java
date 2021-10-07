package org.perscholas;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private String userInput;
    String getUserInput(){
        return this.userInput;
    }

    public static char[] revArray(char[] charArray ){
        //initializing a veriable for array.length
        int len = charArray.length;
        //New array declaration
       char[] resultArray = new char[len];
        for(int i=0; i< len; i++){
            //
            resultArray[len-i-1]=charArray[i];
        }//end of for loop
        System.out.println(Arrays.toString(resultArray));
        return resultArray;

    }//end of method

    public void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        userInput = sc.nextLine();
    }
    public static void main(String[] args) {
        //getting user input string
        ReverseArray obj = new ReverseArray();
        obj.userInput();
        char[] charArray =obj.getUserInput().toCharArray();
        //converting a string to a char array
        revArray(charArray);
    }//end of main method
}
