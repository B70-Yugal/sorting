package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int n,arr[];
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of array: ");
	n=sc.nextInt();
	System.out.println("Enter the elements to be sorted:");
	arr=new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i]=sc.nextInt();
	}
    bubble(arr,n);
	System.out.println("sorted array");
	System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[]arr,int n){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped= false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped= true;
                }
            }
            if(swapped== false)
                break;
        }
    }
}
