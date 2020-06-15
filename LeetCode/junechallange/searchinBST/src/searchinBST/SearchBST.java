package searchinBST;

public class SearchBST {

	public TreeNode searchBST(TreeNode root, int val) {
		
		if(root == null || root.val == val) return root;
		
		if(root.val > val)
			return searchBST(root.left, val);
		
		return searchBST(root.right, val);
	}
}
