//package com.sparta.hm;
//
//public class Loops {
//
//    public static void main(String[] args) {
//        double weight = 9.4;
//        weight = 3.5;
//
//        //Array when initialised has to be initialised with values or if 0 values , the length its going to be
//        //IMMUTABLE!
//
//        // datatype followed by []
//
//        // Declaring variable example which as an array which can only take doubles
//        // Initialising the array WITH VALUES
//        // Initialised with 3 values, the max size it can be is 3 - we can't add a fourth element
//        double [] example = new double[]{20.0, 1.0, 20.0};
//        double indexOne = example[0];
//        double thirdElement = example[2];
//
//        // not initialised with values
//        double[] weights = new double[4];
//        weights[0] = 3.5;
//        weights[1] = 4.2;
//        weights[2] = 7.1;
//        weights[3] = 1.3;
//        System.out.println(0);
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        //sout(4) // exception thrown
//
//        // Enhanced for loop - ONLY used for read only operations
//        for(double d : weights){
//            System.out.println(d);
//        }
//
//        for(int i = 0; i < weights.length; i++){
//            System.out.println(weights[i]);
//        }
//
//        // while loop will only execute if its condition is true ()
//        int j = 0;
//        while (j <weights.length) {
//            System.out.println(weights[j]);
//            j++;
//
//            int k = 0;
//            do
//                System.out.println(weights[k]);
//                k++;
//        }while(k <weights.length);
//        }
//    }
//
//}
