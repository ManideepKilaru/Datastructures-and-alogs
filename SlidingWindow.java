public class SlidingWindow {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        float[] ret = new float[k];
        for (int i = 0; i < nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[i];
            }
            ret[i] = sum / nums.length;
        }
        for (int i = 0; i < k; i++) {
            System.out.println(ret[i]);
        }
    }
}