package com.assessment1.jotc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Jumping on the cloud solution
 *
 */
public class JOTCApp 
{
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome Jumping on the cloud game");
        System.out.println("Enter a valid JOTC request.**without space and sperator");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int result = Result.jumpingOnClouds(processJOTCInput(bufferedReader));
        System.out.println("Minimum number of jump for the request is : " + result);
    }

    public static int[] processJOTCInput(BufferedReader bufferedReader) throws IOException {

        final String regex = "[0-1]+";
        String s = bufferedReader.readLine();
        if (!s.matches(regex)) {
            throw new IllegalArgumentException("invalid input for JOTC, request can contains only '0' and '1'");
        }
        int[] arr = Stream.of(s.split("")).mapToInt(Integer::parseInt).toArray();
        int size = arr.length;
        if (size < 2 || size > 100) {
            throw new IllegalArgumentException("invalid input for JOTC, request's size must be greater that 2 and less than 100 ");
        }
        if (arr[0] == 1 || arr[size - 1] == 1) {
            throw new IllegalArgumentException("invalid input for JOTC, first and last element of request must be 0");
        }
       int lastEle = 0;
       for(int current : arr) {
           if(current == 1 && lastEle == 1) {
               throw new IllegalArgumentException("invalid input for JOTC, two consecutive element can not be 1");
           }
           lastEle = current;
       }
        return arr;
    }
}
/**
 * Jumping on the cloud result
 *
 */
class Result {
    public static int jumpingOnClouds(int[] c) {
        int size = c.length;
        int jumpCount = 0;
        for (int i = 0; i < size - 1; i++, jumpCount++) {
            if (i + 2 < size && c[i + 2] == 0) {
                i++;
            }
        }
        return jumpCount;
    }
}
