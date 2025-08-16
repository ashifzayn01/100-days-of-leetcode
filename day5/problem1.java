/*Problem: Second Largest Element in Array

Statement:
Given an array of integers, your task is to find the second largest distinct element present in the array.
If the second largest element does not exist (for example, when all elements are the same or array has only one element), return -1.

Input:

An integer N representing the size of the array.

An array of N integers arr[].

Output:

Print the second largest element of the array.

If no second largest exists, print -1.*/


package day5;
public class smax{
    public static int SecondMax(int[]nums){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length; i++){
            if(nums[i] > max)
            max = nums[i];

        }
        for(int num: nums){
            if(num > smax && num != max){
                smax = num;
             
            }
        }
        if(smax == Integer.MIN_VALUE){
            return -1;
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println(SecondMax(arr1));  // Output: 34

        int[] arr2 = {10, 10, 10};
        System.out.println(SecondMax(arr2));  // Output: -1
    }
}



