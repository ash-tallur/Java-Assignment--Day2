/* For given number (int), order digits in the number in ascending order
     ex:     i/p 613       o/p 136
             i/p 01020   o/p  00012 */

import java.util.Scanner;

public class NumberAscending {
    public static void main(String[] args) {
        //Taking the input from the user
        System.out.println("Enter the number of whose digits you want to sort in ascending- ");
        Scanner sc = new Scanner(System.in);
        int inputnumber = sc.nextInt();
        //Passing the input as argument to the method
        ascendingDigits(inputnumber);

    }
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
    }
}
