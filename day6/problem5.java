/*Given an array arr[] and an integer k, reverse every
sub-array of consecutive k elements in place.
If the last group has fewer than k elements, 
reverse that group as is. Do not return anything; modify the original array.*/


class Solution {
    // Function to reverse every sub-array of size k
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            // reverse sub-array [left, right]
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
