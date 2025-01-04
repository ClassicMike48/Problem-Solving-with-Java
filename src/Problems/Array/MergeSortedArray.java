package Problems.Array;

// Pulled from Top Interview 150 from Leetcode.com https://leetcode.com/problems/merge-sorted-array?envType=study-plan-v2&envId=top-interview-150
// !!! Different than MergeSortArray which returns an array
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1; //Last index of nums1
        int p2 = n-1; //Last index of nums2
        int full = m+n-1; //Last index of nums1 - only needed since nums1 is storing the result

        //Compare the largest elements in nums1 and nums2, largest is added to the end of nums1
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[full] = nums1[p1];
                p1--;

            }
            else{
                nums1[full] = nums2[p2];
                p2--;
            }
            full--;
        }

        // In order for the operation to be complete, all elements in nums2 must be added to nums1. Since nums1 can become fully exhausted
        // in the previous loop, this loop ensures the operation is completed. if nums2 is fully added before nums1, then the operation
        // is already complete and this loop will not need to run
        while(p2 >= 0){
            nums1[full] = nums2[p2];
            p2--;
            full--;
        }
    }
}