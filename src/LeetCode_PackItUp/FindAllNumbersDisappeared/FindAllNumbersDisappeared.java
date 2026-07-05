package LeetCode_PackItUp.FindAllNumbersDisappeared;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums){
        for (int i = 0; i < nums.length; i++){  //区别：numsSize和nums.length
            int val = Math.abs(nums[i]);
            int idx = val - 1;

            if (nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        } 

        List<Integer> result = new ArrayList<>();   //尖括号 <Integer> 叫泛型（Generics）。int 要写成 Integer。
                                                    //最后空尖括号 <> 和圆括号 () 是固定搭配，告诉机器：“立刻执行造数组的动作，初始大小你看着办就行，反正以后不够用了你会自动扩容。”
    /*这一行相当于：
    int count = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] > 0) {
            count++;
        }
    }
    int* result = (int*)malloc(count * sizeof(int));
    *returnSize = count;

    */
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                result.add(i + 1);  //相当于result[resultIndex] = i + 1;和resultIndex++;两行
            }
        }

        return result;
    }

}
