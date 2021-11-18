/* For given number (int), order digits in the number in ascending order
     ex:     i/p 613       o/p 136
             i/p 01020   o/p  00012 */

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAscending {
    public static void main(String[] args) {
        //Taking the input from the user
        System.out.println("Enter the number of whose digits you want to sort in ascending- ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        if(inputNumber ==0 || inputNumber<0){
            System.out.println("The number cannot be zero or negative, please enter a larger number");
        }else {
            //Passing the input as argument to the method
            ascendingDigits(inputNumber);
        }

    }

    // read num
    // create array with digits in num
    // sort array
    // print array
    static void ascendingDigits(int num){
        // The given number is integer to find the length of the number converting it
        // to String and finding the length
        String temp = Integer.toString(num);

        int numOfDigits = temp.length();
        if(numOfDigits<=1){
            System.out.println("Please enter more than one digit number");
        }
        else {
            //Based on the length instantiating a integer array
            int[] digitsArray = new int[numOfDigits];

            // using for loop assigning the values to the array
            for (int i = 0; i < numOfDigits; i++) {
                //taking each character then getting the integer by
                //subtracting the character with zero and assigning to array
                digitsArray[i] = temp.charAt(i) - '0';
            }

//        for(int k =0;k<digitsArray.length;k++){
//            System.out.println(digitsArray[k]);
//        }

            //sorting the array of digits
            for (int l = 0; l < digitsArray.length; l++) {
                for (int j = l + 1; j < digitsArray.length; j++) {
                    int tempDigit = 0;
                    if (digitsArray[l] > digitsArray[j]) {
                        tempDigit = digitsArray[l];
                        digitsArray[l] = digitsArray[j];
                        digitsArray[j] = tempDigit;
                    }
                }
            }
            System.out.println("The sorted number ");
            //printing the number using for loop
            for (int m = 0; m < digitsArray.length; m++) {
                System.out.print(digitsArray[m]);
            }
        }

    }
}

  /*
    static void ascendingDigits(int number){
        //Considering the length of the number by using String's valueOf function
        int numberLength = String.valueOf(number).length();
        //tempNum is for temporarily storing the number, digit is for taking each digit of the number and sortedNum is having the sorted number
        int tempNum;
        int digit=0;
        int sortedNum = 0;
        //Checking if the user entered 0
        if(number == 0){
            System.out.println("The number cannot be zero");
        }
        //checking if the number is single digit
        else if(numberLength ==1){
            System.out.println("Enter two digit number");
        }
        //Sorting the number when its length is more than 1
        else if(numberLength>1){
            //We are considering 0 -9 digits
            for(int i =0;i<10;i++){
                tempNum = number;
                //Unless the number is greater than zero
                while(tempNum>0){
                    //Taking the last digit of the given number
                    digit = tempNum%10;
                    //Verifying the digit with i, if matched we are writing that digit to the sortedNum
                    if(digit==i){
                        sortedNum = sortedNum*10;
                        sortedNum = sortedNum+digit;
                    }
                    //we are taking the remaining input number after omitting last digit
                 tempNum=tempNum/10;
                }
            }
            System.out.println("The sorted number is " + sortedNum);
        }
    }*/



