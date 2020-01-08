package leetcode;

public class LC155 {
	
	//Use your test cases
	
	class MinStack {
	    
	    Node root;
	    /** initialize your data structure here. */
	    public MinStack() {
	    }
	    
	    public void push(int x) {
	        Node node = new Node();
	        node.val = x;
	        if(root == null){
	            root = node;
	            root.min = x;
	        }else{
	            root.next = node;
	            node.prev = root;
	            if(x < root.min)
	                node.min = x;
	            else
	                node.min = root.min;
	            root = node;
	        }
	    }
	    
	    public void pop() {
	        root = root.prev;
	    }
	    
	    public int top() {
	        return root.val;
	    }
	    
	    public int getMin() {
	        return root.min;
	    }
	    class Node{
	        int val;
	        int min;
	        Node next;
	        Node prev;
	    }
	}

	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */

}
