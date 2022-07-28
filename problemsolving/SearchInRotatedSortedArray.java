package problemsolving;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public final class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int leftPointer = 0;
        int pivot = 0;
        int rightPointer = nums.length - 1;
        int midPointer;
        
        while (leftPointer <= rightPointer) {
           midPointer = leftPointer + (rightPointer - leftPointer) / 2;
           if (midPointer + 1 == nums.length || midPointer == 0) {
               pivot = midPointer;
               break;
           }
           if (nums[midPointer] > nums[midPointer + 1]) {
               pivot = midPointer;
               break;
           } else if (nums[midPointer] < nums[midPointer - 1]) {
               pivot = midPointer - 1;
               break;
           }
            else if (nums[midPointer] < nums[0]){
               rightPointer = midPointer - 1;
           } else if (nums[midPointer] > nums[0]){
               leftPointer = midPointer + 1;
           }
        }
    
        leftPointer = 0;
        rightPointer = pivot;
        while (leftPointer <= rightPointer) {
           midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (target == nums[midPointer]) {
                return midPointer;
            } else if (target > nums[midPointer]) {
                leftPointer = midPointer + 1;
            } else {
                rightPointer = midPointer - 1;
            }
        }
        
        leftPointer = pivot + 1;
        rightPointer = nums.length - 1;
        while (leftPointer <= rightPointer) {
           midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (target == nums[midPointer]) {
                return midPointer;
            } else if (target > nums[midPointer]) {
                leftPointer = midPointer + 1;
            } else {
                rightPointer = midPointer - 1;
            }
        }
        
        return -1;
    }

    public int searchWithDuplicates(int[] nums, int target) {
        int leftPointer = 0;
        int pivot = 0;
        int rightPointer = nums.length - 1;
        int midPointer;
        
        while (leftPointer <= rightPointer) {
           midPointer = leftPointer + (rightPointer - leftPointer) / 2;
           if (midPointer + 1 == nums.length || midPointer == 0) {
                pivot = midPointer;
                break;
           }
           if (nums[midPointer] > nums[midPointer + 1]) {
                pivot = midPointer;
                break;
           } else if (nums[midPointer] < nums[midPointer - 1]) {
                pivot = midPointer - 1;
                break;
           }
           if (nums[leftPointer] == nums[midPointer] && nums[midPointer] == nums[rightPointer]) {
                if (nums[leftPointer] > nums[leftPointer + 1]) {
                    pivot = leftPointer;
                    break;
                }
                leftPointer ++;
                if (nums[rightPointer] < nums[leftPointer - 1]) {
                    pivot = rightPointer - 1;
                    break;
                }
                rightPointer --;
           }
            else if (nums[midPointer] < nums[0]){
               rightPointer = midPointer - 1;
           } else if (nums[midPointer] > nums[0]){
               leftPointer = midPointer + 1;
           }
        }
    
        leftPointer = 0;
        rightPointer = pivot;
        while (leftPointer <= rightPointer) {
           midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (target == nums[midPointer]) {
                return midPointer;
            } else if (target > nums[midPointer]) {
                leftPointer = midPointer + 1;
            } else {
                rightPointer = midPointer - 1;
            }
        }
        
        leftPointer = pivot + 1;
        rightPointer = nums.length - 1;
        while (leftPointer <= rightPointer) {
           midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (target == nums[midPointer]) {
                return midPointer;
            } else if (target > nums[midPointer]) {
                leftPointer = midPointer + 1;
            } else {
                rightPointer = midPointer - 1;
            }
        }
        
        return -1;
    }
}