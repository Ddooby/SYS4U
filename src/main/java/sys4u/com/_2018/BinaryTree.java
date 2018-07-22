package sys4u.com._2018;

public class BinaryTree
{
	// 최상위 root노드
    private BinaryTreeNode root;
    
    public BinaryTree() {
    	this.root = null;
    }

    public boolean find( int id )
    {
    	BinaryTreeNode current = root; 
    	while(current!=null){ 
    		if(current.data==id){ 
    			return true; 
    		}else if(current.data>id){ 
    			current = current.left; 
    		}else{ 
    			current = current.right; 
    		} 
    	} 
    	return false; 
    }

    public void insert(int id){ 
		BinaryTreeNode newNode = new BinaryTreeNode(id); 
		if(root==null){ 
			root = newNode; 
			return; 
		} 
		BinaryTreeNode current = root; 
		BinaryTreeNode parent = null; 
		while(true){ 
			parent = current; 
			if(id<current.data){				 
				current = current.left; 
				if(current==null){ 
					parent.left = newNode; 
					return; 
				} 
			}else{ 
				current = current.right; 
				if(current==null){ 
					parent.right = newNode; 
					return; 
				} 
			} 
		} 
} 

}
