package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LC590 {

	public List<Integer> postorder(Node root) {
        if(root == null)
            return new LinkedList<Integer>();
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node n = stack.pollLast();
            ans.addFirst(n.val);
            for(Node child : n.children){
                stack.add(child);
            }
        }
        return ans;
    }
	
	
	// Definition for a Node.
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
}
