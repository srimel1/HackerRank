import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static int removeDupes(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
//        System.out.println(map.keySet());
        System.out.println(map.size()+", nums = "+map.keySet());

        return map.size();

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 4, 6, 7, 7, 4, 7, 8};
        int[] arr = {3,2,2,3};

//        int[] ar = {1, 1, 2};
//        removeDupes(ar);
//        Arrays.sort(arr);
//
//        removeDupes(arr);
//        System.out.println(removeDuplicates(arr));

        System.out.println(Arrays.toString(removeElement(arr,3)));

    }
    public static int removeDuplicates(int[] nums){
        System.out.println("nums before = " + Arrays.toString(nums));
        if(nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    
    public static int[] removeElement(int[] nums, int val){
        int[] copy = new int[nums.length - 1];
        System.out.println(Arrays.toString(nums));

        for (int i = 0, k = 0; i < nums.length; i++) {
            //System.out.println("i: "+i+" nums[i]="+nums[i]);
            if(nums[i] == val) continue;
            copy[k++] = nums[i];
        }


        return copy;
    }

    public int removeEl(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
