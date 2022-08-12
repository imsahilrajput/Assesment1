package com.array;
import java.io.*;

class ArrayRotation {
     
    public static void rotateArray(int arr[], int rotationValue)
    {	
    	int n= arr.length;
        int flag = 0;
        while (rotationValue>=flag+1) {
            int finish = arr[0];
            for (int i=0; i<n-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n-1] = finish;
            rotationValue--;
        }
 
        for (int x:arr) {
            System.out.println(x);
        }
    }
     
    public static void main(String[] args)
    {
        int arr[] = { 100,200,300};
        int rotationValue = 2;
        rotateArray(arr, rotationValue);
    }
}

