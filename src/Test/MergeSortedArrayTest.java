package Test;

import Problems.Array.MergeSortedArray;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArrayTest {
    @Test
    public void smallNumsTest(){
        //Setup arguments
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = nums2.length;
        int[] expected = {1,2,2,3,5,6};
        //Run
        MergeSortedArray.merge(nums1,m,nums2,n);
        assertArrayEquals(expected,nums1);
    }
    @Test
    public void zeroNTest(){
        //Setup arguments
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        int[] expected = {1};
        //Run
        MergeSortedArray.merge(nums1,m,nums2,n);
        assertArrayEquals(expected,nums1);
    }
    @Test
    public void zeroMTest(){
        //Setup arguments
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        int[] expected = {1};
        //Run
        MergeSortedArray.merge(nums1,m,nums2,n);
        assertArrayEquals(expected,nums1);
    }
}