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

    
    
    
    //--- by chjeong
    
    // 최상위 root노드
    private BinaryTreeNode binaryTreeNode;
    
	public void insertBinaryTree(int i) {
		// TODO Auto-generated method stub
		BinaryTreeNode newNode = new BinaryTreeNode(i);
		if ( binaryTreeNode == null ) {
			binaryTreeNode = newNode;
			//--- ★ return 이 없으면 안된다.
			//--- binaryTreeNode가 NULL 이면 i를 넣고 끝낸다.
			return;
		}
		
		BinaryTreeNode currentBinary = binaryTreeNode; 
		BinaryTreeNode parentBinary = null; 
		while(true) {
			parentBinary = currentBinary;
			if( i < currentBinary.data ){
				currentBinary = currentBinary.left;
				if ( currentBinary == null ) {
					parentBinary.left = newNode;
					return;
				}
			} else {
				currentBinary = currentBinary.right;
				if ( currentBinary == null ) {
					parentBinary.right = newNode;
					return;
				}
			}
		}
			
	}

	public boolean findBinaryTree( int i ) {
		// TODO Auto-generated method stub
		BinaryTreeNode currentBinary = binaryTreeNode; 
		
		if ( currentBinary == null ) {
			return false;
		}
		
    	while( currentBinary!=null ){ 
    		if(currentBinary.data==i){ 
    			return true; 
    		}else if( currentBinary.data > i ) {
    			currentBinary = currentBinary.left;
    			if ( currentBinary == null )
    				return false;
    		}else if( currentBinary.data < i ) {
    			currentBinary = currentBinary.right;
    			if ( currentBinary == null )
    				return false;
    		} 
    	} 
    	return false;
	} 

}
