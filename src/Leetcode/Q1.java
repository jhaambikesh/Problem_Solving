package Leetcode;

import java.util.*;

public class Q1{
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++ ){
            int complement = target - nums[i];
            if(!map.containsKey(complement)){
                //Add to map if complement is not visited already.
                map.put(nums[i],i);
            }else{
                //return both the index of complement and nums[i] as they add up to the target.
                return new int[]{map.get(i),i};
            }
        }
        //return {-1,-1} if no such pair is present.
        return new int[]{-1,-1};
    }
    public static void main(String[]args){
        int[] result = twoSum(new int[]{3,2,4},6);
        System.out.println(result[0] + " " + result[1]);
    }
}