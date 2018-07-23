package sys4u.com._2018;

public class BinaryTreeNode {

    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode( int data )
    {
        this.data = data;
        left = null;
        right = null;
    }

    //존재하지 않는 값이면 add
    /*public void put( int data )
    {
        if ( data < this.data )
        {             
            if ( left != null )             
            {                 
                left.put( data );             
            }             
            else             
            {                 
                left = new BinaryTreeNode( data );             
            }         
        }         
        else if ( data > this.data )
        {
            if ( right != null )
            {
                right.put( data );
            }
            else
            {
                right = new BinaryTreeNode( data );
            }
        }
    }

    //노드에 해당 값이 있는지 확인
    public boolean exists( int data )
    {
        if ( data==this.data )
        {
            return true;
        } 
        
        if ( data < this.data )
        {
            return left == null ? false : left.exists( data );
        }
        else
        {
            return right == null ? false : right.exists( data );
        }
    }*/
}
