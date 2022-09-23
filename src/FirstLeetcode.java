import java.lang.reflect.Array;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

public class FirstLeetcode {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] finish = twoSum(nums, 9);
        System.out.printf("out: " + finish );
    }
    public static int[] twoSum(int[] nums, int target) {
        int curentElement = 0;
        int[] answer ={0,0};
        int count=0;
            for(int i=0; i < nums.length -1; i++){
                for (int b=0; b < nums.length -1;b++){
                    if (nums[i] + nums[b] ==9){
                        answer ={i,b};
                        return answer
                    }
                }
            }


       return answer;
    }

    }



