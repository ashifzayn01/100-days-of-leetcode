/*From GeeksforGeeks (June 25, 2025 – Last Updated)

Problem Title: Maximum consecutive one’s (or zeros) in a binary array
Problem Statement:

Given a binary array arr[] consisting of only 0s and 1s, find the length of the longest contiguous sequence of either 1s or 0s in the array.*/


public class MaxConsecutive {

    // Function to find the maximum consecutive 1's or 0's
    public static int maxConsecutiveCount(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int maxCount = 1; // minimum possible streak
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // same as previous element → streak continues
                currentCount++;
            } else {
                // different → reset streak
                currentCount = 1;
            }

            // update maximum streak
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {0, 0, 1, 0, 1, 0};
        int[] arr3 = {0, 0, 0, 0};

        System.out.println("Max consecutive count: " + maxConsecutiveCount(arr1)); // 4
        System.out.println("Max consecutive count: " + maxConsecutiveCount(arr2)); // 2
        System.out.println("Max consecutive count: " + maxConsecutiveCount(arr3)); // 4
    }
}
