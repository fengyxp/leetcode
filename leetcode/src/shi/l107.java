package shi;
import java.util.*;
class TreeNode {
	int val;
	TreeNode left,right;
	TreeNode(int val){
		this.val = val;
		
	}
}

public class l107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null ) {
			return result;
		}
		
		List<TreeNode> list = new ArrayList<TreeNode>();
		List<TreeNode> secondList = new ArrayList<TreeNode>();
		list.add(root);
		while(!list.isEmpty()) {
			List<Integer> nums = new ArrayList<Integer>();
			for (TreeNode t: list) {
				nums.add(t.val);
				if (t.left != null) {
					secondList.add(t.left);
				}
				if (t.right != null) {
					secondList.add(t.right);
				}
			}
			result.add(nums);
			
			list.clear();
			list.addAll(secondList);
			secondList.clear();
		}
		Collections.reverse(result);
		return result;
	}
}
