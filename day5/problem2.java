/*“Third Largest Element” is also a basic array problem from GfG’s Easy list.

📌 Problem Statement (GeeksforGeeks)

Given an array of distinct elements, find the third largest element.
If the array has less than 3 elements, return -1.*/

package day5;

public class thirdmax {
    public static int thirdmaximum(int[] nums){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        for(int num : nums){
            if( num > max){
                tmax = smax;
                smax = max;
                max = num;
            }else if ( num > smax &&  num != max){
                tmax = smax;
                smax = num;
            }else if(num > tmax && num != smax && num != max){
                tmax = num;
            }
            if(tmax == Integer.MIN_VALUE)
            return -1;
            
        }
        return tmax;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 3, 5};
        System.out.println(thirdLargest(arr1)); // Output: 3

        int[] arr2 = {10, 2};
        System.out.println(thirdLargest(arr2)); // Output: -1
    }
}
