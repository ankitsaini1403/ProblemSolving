

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean flag = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int[] arr = new int[size];

            int first = 0;
            int last = size - 1;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (flag) {
                    arr[first++] = node.val;
                } else {
                    arr[last--] = node.val;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            List<Integer> level = new ArrayList<>();

            for (int num : arr) {
                level.add(num);
            }

            ans.add(level);
            flag = !flag;
        }

        return ans;
    }
}
