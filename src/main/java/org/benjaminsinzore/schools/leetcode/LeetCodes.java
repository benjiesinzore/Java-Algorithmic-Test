package org.benjaminsinzore.schools.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LeetCodes {


    public static void main(String[] args){

//        char[][] maze = new char[][] {
//
//        } ;
//        int[] entrance = new int[]{1, 2} ;
//        nearestExit(maze, entrance);


        int[] nums1 = new int[]{10,1,2,3,3,9};
        int[] nums2 = new int[]{4,5,6,7,8,9};
        double ans = findMedianSortedArraysAI(nums1, nums2);
        System.out.println(ans);

    }



    //1926. Nearest Exit from Entrance in Maze

    /**
     * You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+'). You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol] denotes the row and column of the cell you are initially standing at.
     *
     * In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance. An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.
     *
     * Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.
     *
     */
    //Example 1:
    /**
     *  Input: maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","."]], entrance = [1,2]
     * Output: 1
     * Explanation: There are 3 exits in this maze at [1,0], [0,2], and [2,3].
     * Initially, you are at the entrance cell [1,2].
     * - You can reach [1,0] by moving 2 steps left.
     * - You can reach [0,2] by moving 1 step up.
     * It is impossible to reach [2,3] from the entrance.
     * Thus, the nearest exit is [0,2], which is 1 step away.
     * */
    //Example 2:
    /**
     * Input: maze = [["+","+","+"],[".",".","."],["+","+","+"]], entrance = [1,0]
     * Output: 2
     * Explanation: There is 1 exit in this maze at [1,2].
     * [1,0] does not count as an exit since it is the entrance cell.
     * Initially, you are at the entrance cell [1,0].
     * - You can reach [1,2] by moving 2 steps right.
     * Thus, the nearest exit is [1,2], which is 2 steps away.
     * */
    //Example 3:
    /***
     * Input: maze = [[".","+"]], entrance = [0,0]
     * Output: -1
     * Explanation: There are no exits in this maze.
     */
    //Constraints
    /***
     * maze.length == m
     * maze[i].length == n
     * 1 <= m, n <= 100
     * maze[i][j] is either '.' or '+'.
     * entrance.length == 2
     * 0 <= entrancerow < m
     * 0 <= entrancecol < n
     * entrance will always be an empty cell.
     */
    public static int nearestExit(char[][] maze, int[] entrance) {

        int returnValue = 0;


        return returnValue;
    }


    //Median of Two Sorted Arrays
    /**
         Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of
         the two sorted arrays.

         The overall run time complexity should be O(log (m+n)).


         Example 1:

         Input: nums1 = [1,3], nums2 = [2]
         Output: 2.00000
         Explanation: merged array = [1,2,3] and median is 2.


         Example 2:

         Input: nums1 = [1,2], nums2 = [3,4]
         Output: 2.50000
         Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


         Constraints:

         nums1.length == m
         nums2.length == n
         0 <= m <= 1000
         0 <= n <= 1000
         1 <= m + n <= 2000
         -106 <= nums1[i], nums2[i] <= 106
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int[] nums = new int[nums1.length + nums2.length];
        double retAns = 0.0;
        int  k = 0;
        for (int i : nums1) {

            nums[k] = i;
            k++;
        }

        for ( int i : nums2) {

            nums[k] = i;
            k++;
        }

        System.out.println(Arrays.toString(nums));
        //Check if the length is odd
        int getMid = 0;
        if (!Objects.equals(nums.length % 2, 0)){

            getMid = ((nums.length - 1) /2) + 1;

        } else {

            int get1, get2, getMid1, getMid2;
            get1 = nums.length / 2;
            get2 = get1 + 1;
            getMid1 = nums[get1];
            getMid2 = nums[get2];
            getMid = (getMid1 + getMid2) / 2;

        }
        retAns = nums[getMid];


        return retAns;
    }




    //By AI
    public static double findMedianSortedArraysAI(int[] nums1, int[] nums2) {
        // combine the two arrays into a single, sorted array
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++;
            } else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }



        while (i < nums1.length) {
            nums[k] = nums1[i];
            i++;
            k++;
        }


        while (j < nums2.length) {
            nums[k] = nums2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(nums));
        // calculate the median of the combined array
        int n = nums.length;
        if (n % 2 == 0) {
            // if the array has even length, the median is the average of the two middle elements
            return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        } else {
            // if the array has odd length, the median is the middle element
            return nums[n / 2];
        }
    }
}



