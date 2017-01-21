// Digital Logic Assignment 1
// Brian J Gardner
// Prof Chankaya

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryConverter {
    public static void convertNumber(char[] inputNumberArray){ 
        int powerOfTwoCounter = inputNumberArray.length-1;
        long outputDecimalNumber =0;
        for(int i =0; i<inputNumberArray.length; i++){
            if(inputNumberArray[i]=='1'){
                outputDecimalNumber +=1*(Math.pow(2,powerOfTwoCounter));
            }
            powerOfTwoCounter--;
        }
        System.out.println("The converted decimal value = " + outputDecimalNumber);
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter an unsigned binary number up to 32 bits: ");

        //Capture user input data as a string
        String stringArrayInput = new String();
        stringArrayInput = (inputScanner.nextLine());

        //convert input to an array and call func
        char[] inputArray = stringArrayInput.toCharArray();
        convertNumber(inputArray);
    }
}
