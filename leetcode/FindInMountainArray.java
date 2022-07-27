package leetcode;

// https://leetcode.com/problems/find-in-mountain-array/
public final class FindInMountainArray {
    public int findInMountainArray(int target, int[] mountainArr) {
        int leftPointer = 0;
        int rightPointer = mountainArr.length - 1;
        int midPointer;
        
        while (leftPointer <= rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (midPointer + 1 == mountainArr.length) {
                if (target == mountainArr[midPointer]) {
                    return midPointer;
                } else {
                    break;
                } 
            }
            if (mountainArr[midPointer + 1] > mountainArr[midPointer]) {
                if (target == mountainArr[midPointer]) {
                    return midPointer;
                } else if (target > mountainArr[midPointer]) {
                    leftPointer = midPointer + 1;
                } else {
                    rightPointer = midPointer - 1;
                }
            } else {
                rightPointer = midPointer - 1;
            }
        }
        
        leftPointer = 0;
        rightPointer = mountainArr.length - 1;
        while (leftPointer <= rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (midPointer + 1 == mountainArr.length) {
                if (target == mountainArr[midPointer]) {
                    return midPointer;
                } else {
                    break;
                }
            }
            if (mountainArr[midPointer + 1] < mountainArr[midPointer]) {
                if (target == mountainArr[midPointer + 1]) {
                    return midPointer;
                } else if (target > mountainArr[midPointer]) {
                    rightPointer = midPointer - 1;
                } else {
                    leftPointer = midPointer + 1;
                }
            } else {
                leftPointer = midPointer + 1;
            }
        }
        return -1;
    }
}
