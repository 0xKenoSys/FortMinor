package FindAllNumbersDisappeared;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums){
        for (int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            int idx = val - 1;

            if (nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                result.add(i + 1);
            }
        }

        return result;
    }

}
