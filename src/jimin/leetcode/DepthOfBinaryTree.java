package jimin.leetcode;

public class DepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
			int count=0;
			return count;
	}

	public static void dfs(int[][] a, boolean[] c, int v) {
		int n = a.length - 1;
		c[v] = true;
		System.out.print(v + " ");
		for (int i = 1; i <= n; i++) {
			if (a[v][i] == 1 && !c[i]) {
				dfs(a, c, i);
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 9, 20, (Integer) null, (Integer) null, 15, 7 };
		TreeNode root=new TreeNode(array[0]);
		TreeNode value=root;
		for(int i=1;i<array.length;i++) {
			if(value.left==null) {
				value.left=new TreeNode(array[i]);
			}
			else if(value.right==null){
				value.right=new TreeNode(array[i]);
			}
			else {
				
			}
		}
		
		
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}