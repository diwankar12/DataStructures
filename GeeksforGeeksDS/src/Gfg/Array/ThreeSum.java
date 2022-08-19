package Gfg.Array;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
      //  System.out.println(threeSumHashSet(arr));
                List<Integer[]> list = threeNumberSumStriver(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0);
        //o/p
//        [
//  [-8, 2, 6],
//  [-8, 3, 5],
//  [-6, 1, 5]
//]
        for(Integer[] res: list){
            System.out.println(Arrays.toString(res));
        }
    }

    public static List<List<Integer>> threeSumHashSet(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int fixedValue = nums[i];
            for(int j=1;j<nums.length;j++){
                if(set.contains(-(nums[j]+fixedValue))){
                    List<Integer> l = new ArrayList();
                    l.add(fixedValue);
                    l.add(nums[j]);
                    l.add(-(nums[j]+fixedValue));
                    mainList.add(l);
                } else {
                    set.add(nums[j]);
                }
            }

        }

        return mainList ;

    }







    public List<List<Integer>> threeSumMine(int[] nums) {


        int fixedValue = nums[0] ;
        List<List<Integer>> list = new LinkedList<>();

        int count =0 ;

        List<Integer> integerList = list.get(count);
        integerList.add(fixedValue);
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=1;i<nums.length;i++){
            if(mp.containsValue(-(nums[i]+fixedValue))){

            // integerList.add(nums[i],mp.);
            } else {
                mp.put(i,nums[i]);
            }
        }



return list ;

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ts = new HashSet();
        HashMap<Integer, Integer> map = new HashMap();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length;i++){
            map.put(nums[i], i);
        }

        map.forEach((k,v)->System.out.println("key "+k+" value "+v));


        for(int i = 0 ; i < nums.length; i++){
            int f = nums[i];
            for(int j = i+1; j< nums.length; j++){
                List<Integer> l = new ArrayList();
                int s = nums[j];
                int t = 0 - f - s;
                if(map.containsKey(t) && map.get(t)>j){
                    l.add(f);
                    l.add(s);
                    l.add(t);
                    ts.add(l);
                }
            }
        }
        return new ArrayList(ts);
    }


    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> list = new ArrayList<>();

        // 12,3,1,2,-6,5,-8,6
        Arrays.sort(array);
        for(int i=0;i<array.length-2;i++) {

            //case 1 :
            if (i == 0 || (i > 0 && array[i] != array[i - 1])) {
                int a = -array[i] + targetSum;
                for (int j = i + 1; j < array.length; j++) {
                    int high = array.length - 1;
                    int low = j;
                    while (low < high) {
                        if (array[high] + array[low] == a) {

                            list.add(new Integer[]{-a, array[low], array[high]});
                            while(low<high && array[low]==array[low+1]) low++;
                            while(low<high && array[high]==array[high-1]) high--;
                            high--;
                            low++;

                        } else if (array[high] + array[low] > a) {
                            high--;
                        } else {
                            low++;
                        }
                    }
                }
            }
        }

        return list;
    }

    public static List<Integer[]> threeNumberSumStriver(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> list = new ArrayList<>();

        // 12,3,1,2,-6,5,-8,6
        Arrays.sort(array);
        for(int i=0;i<array.length-2;i++) {

            //case 1 :
            if (i == 0 || (i > 0 && array[i] != array[i - 1])) {
                int a = -array[i] + targetSum;
                    int high = array.length - 1;
                    int low = i+1;
                    while (low < high) {
                        if (array[high] + array[low] == a) {

                            list.add(new Integer[]{-a, array[low], array[high]});
                            while(low<high && array[low]==array[low+1]) low++;
                            while(low<high && array[high]==array[high-1]) high--;
                            high--;
                            low++;

                        } else if (array[high] + array[low] > a) {
                            high--;
                        } else {
                            low++;
                        }
                    }
                }
            }


        return list;
    }

}
