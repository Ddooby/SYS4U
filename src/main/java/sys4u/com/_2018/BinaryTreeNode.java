package sys4u.com._2018;

public class BinaryTreeNode {
	
	int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

	//--- BinaryTreeNode 생성자
    public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
    
	public BinaryTreeNode(int data) {
		super();
		this.data = data;
	}
    
}
