import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Viết chương trình Java để tìm tất cả các bộ ba bằng một tổng cho trước trong
         * một mảng số nguyên chưa được sắp xếp.
         * Example:
         * Input :
         * nums = { 1, 6, 3, 0, 8, 4, 1, 7 }
         * Output:
         * Triplets of sum 7
         * (0 1 6)
         * (0 3 4)
         */
        int[] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        System.out.println("Original array " + Arrays.toString(nums));
        Arrays.sort(nums);
        bai3(nums, 10);

    }

    public static void bai3(int[] nums, int tripletOfSum) {
        int length = nums.length; // tạo ra hàm length có độ dài = lenght
        for (int i = 0; i <= length - 1; i++) {
            int sum = tripletOfSum - nums[i];
            int upIndex = i + 1;
            int downIndex = nums.length - 1;
            while (upIndex < downIndex) {
                if (nums[upIndex] + nums[downIndex] < sum) {
                    upIndex++;

                } else if (nums[upIndex] + nums[downIndex] > sum) {
                    downIndex--;

                } else {
                    System.out.println("(" + nums[i] + " " + nums[upIndex] + " " + nums[downIndex] + ")");
                    upIndex++;
                    downIndex--;
                }
            }
        }

    }
}
