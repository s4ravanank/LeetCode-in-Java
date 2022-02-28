package g0101_0200.s0112_path_sum;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Data_Structure_I_Day_12_Tree
// #2022_02_22_Time_0_ms_(100.00%)_Space_44_MB_(9.82%)

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (sum == root.val && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}