package com.sparta.hm.basics;

public class loopExcercise {


    public static void main(String[] args) {

   int[] arr={1, 2, 3, 4};
            System.out.println(sumOfArray(arr));

        //write code so it returns the sum of all numbers in an array
        //logic here - any loop you like!! Try
    }


    public static int sumOfArray(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }

}


