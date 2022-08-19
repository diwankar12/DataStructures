package algoExpert.Searching;

public class SearchInRange {

    public static int[] searchForRange(int[] array, int target) {
        // Write your code here.
        int[] ans = new int[]{-1, -1};
        int low = 0;
        int high = array.length - 1;
        getBS(low, high, target, array, ans);

        return ans;
    }

    public static void getBS(int low, int high, int target, int[] array, int[] ans) {

        if (low > high) {
            return;
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == target) {
            if (target != array[mid - 1] || mid == array.length - 1) {
                ans[1] = mid;
                ans[0] = mid;
            } else if (target != array[mid + 1] || mid == 0) {
                ans[1] = mid;
                ans[0] = mid;
            } else if (mid - 1 >= 0 && mid + 1 < array.length && array[mid - 1] == target && target == array[mid + 1]) {
                getBS(low, mid - 1, target, array, ans);
                getBS(mid + 1, high, target, array, ans);
            }
        }
           else {
            if (array[mid] < target) {
                getBS(mid + 1, high, target, array, ans);
            } else {
                getBS(low, mid - 1, target, array, ans);
            }
        }

    }
}
