package org.perscholas;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static char[] revArray(char[] charArray ){
        int len = charArray.length;
       char[] resultArray = new char[len];
        for(int i=0; i< len; i++){
            resultArray[len-i-1]=charArray[i];
        }
        System.out.println(Arrays.toString(resultArray));
        return resultArray;

    }


    public static void main(String[] args) {
        //ReverseArray ra =new ReverseArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        char[] charArray =input.toCharArray();
        revArray(charArray);
    }
}
