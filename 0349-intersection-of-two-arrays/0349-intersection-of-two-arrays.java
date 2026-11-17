class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int k = 0;

        int[] ans = new int[Math.min(n1, n2)];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean duplicate = false;

                    for (int x = 0; x < k; x++) {
                        if (ans[x] == nums1[i]) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (!duplicate) {
                        ans[k] = nums1[i];
                        k++;
                    }

                    break;
                }
            }
        }

        return java.util.Arrays.copyOf(ans, k);
    }
}