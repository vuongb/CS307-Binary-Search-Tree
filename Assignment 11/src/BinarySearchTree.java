import java.util.List;
import java.util.ArrayList;
/**
 * Shell for a bianry search tree class.
 * @author scottm
 *
 */

public class BinarySearchTree<E extends Comparable<? super E>> {
    
	
	// Instance Variables
    private BSTNode<E> root;
    private int size;
    
    
    
    
    // Constructors
    
    // Empty Constructor
    public BinarySearchTree() {
    	root = null;
    	size = 0;
    }
    
    // Constructor to set root node to data
    public BinarySearchTree(E data)
    {
    	root.setValue(data);
    	size = 1;
    }
    
    
    
    
    
    // Methods
    
    
    
    
    /**
     *  add the specified item to this Binary Search Tree if it is not already present.
     *  <br>
     *  pre: data != null<br>
     *  post: add this item to the tree. Return true if this tree
     *  changed as a result of this method call, false otherwise.
     *  @param data the data to add to the tree
     *  @return false if an item equivalent to data is already present
     *  in the tree, return true if data is added to the tree and size() = old size() + 1
     */
    public boolean add(E data){
        
    	int oldSize = size;
    	root = addHelper(data, root);
    	return oldSize != size;
    }
    
    
    private BSTNode<E> addHelper(E data, BSTNode<E> currentNode)
    {
    	if(currentNode == null)
    	{
    		size++;
    		return new BSTNode<E>(data);
    	}
    	else
    	{
    		if(data.compareTo(currentNode.getValue()) < 0)
    			currentNode.setLeft(addHelper(data, currentNode.getLeft()));
    		else if(data.compareTo(currentNode.getValue()) > 0)
    			currentNode.setRight(addHelper(data, currentNode.getRight()));
    	}
    	return currentNode;
    }

    /**
     *  remove a specified item from this Binary Search Tree if it is present.
     *  <br>
     *  pre: data != null<br>
     *  post: remove data from the tree, return true if this tree
     *  changed as a result of this method call, false otherwise.
     *  @param data the data to remove from the tree if present
     *  @return false if data was not present
     *  returns true if data was present and size() = old size() - 1
     */
    public boolean remove(E data){
        int oldSize = size;
        root = removeHelper(data, root);
        assert oldSize == size || oldSize == size+1;
        return oldSize != size;
    }
    
    private BSTNode<E> removeHelper(E data, BSTNode<E> currentNode)
    {
    	
    	if(currentNode == null)
    		return currentNode;
    	
    	int compare = data.compareTo(currentNode.getValue());
    	
    	if(compare < 0)
    		currentNode.setLeft(removeHelper(data, currentNode.getLeft()));
    	else if(compare > 0)
    		currentNode.setRight(removeHelper(data, currentNode.getRight()));
    	else
    	{
    		
    		size--;
    		// 2 Children
    		if(currentNode.getLeft() != null && currentNode.getRight() != null)
    		{
    			BSTNode<E> temp = currentNode.getLeft();
    			while(temp.getRight() != null)
    				temp = temp.getRight();
    		
    			currentNode.setValue(temp.getValue());
    			currentNode.setLeft(removeHelper(currentNode.getValue(), currentNode.getLeft()));
    			size++;
    		}
    		
    		// leaf node
    		else if(currentNode.getRight() == null && currentNode.getLeft() == null)
    			currentNode = null;
    		
    		else
                currentNode = ( currentNode.left != null ) ? currentNode.getLeft() : currentNode.getRight();
    		
    	}
    	
    	
    	return currentNode;
    }


    /**
     *  check to see if the specified element is in this Binary Search Tree.
     *  <br>
     *  pre: data != null<br>
     *  post: return true if data is present in tree, false otherwise
     *  @param data the data to look for in the tree
     *  @returns true if data is present in this tree, false otherwise
     */
    public boolean isPresent(E data){
        return isPresentHelper(data, root);
    }
    
    private boolean isPresentHelper(E data, BSTNode<E> currentNode) {
    	
    	if(currentNode == null)
    		return false;    	
    	int compare = data.compareTo(currentNode.getValue());
    	if(compare == 0)
    		return true;
    	else if(compare < 0)
    		return isPresentHelper(data, currentNode.getLeft());
    	else
    		return isPresentHelper(data, currentNode.getRight());
    		
    }


    /**
     *  return how many elements are in this Binary Search Tree.
     *  <br>
     *  pre: none<br>
     *  post: return the number of items in this tree
     *  @returns the number of items in this Binary Search Tree
     */
    public int size(){
        return size;
    }

    /**
     *  return the height of this Binary Search Tree.
     *  <br>
     *  pre: none<br>
     *  post: return the height of this tree.
     *  If the tree is empty return -1, otherwise return the
     *  height of the tree
     *  @returns the height of this tree or -1 if the tree is empty
     */
    public int height(){
    	return heightHelper(root);
    }
    
    private int heightHelper(BSTNode<E> currentNode)
    {
    	if(currentNode == null)
    		return -1;
    	else
    		return 1 + Math.max(heightHelper(currentNode.getLeft()), heightHelper(currentNode.getRight()));
    }

    /**
     *  return a list of all the elements in this Binary Search Tree.
     *  <br>
     *  pre: none<br>
     *  post: return a List object with all data from the tree in ascending order. 
     *  If the tree is empty return an empty List
     *  @returns a List object with all data from the tree in sorted order
     *  if the tree is empty return an empty List
     */
    public List<E> getAll(){
        List<E> output = new ArrayList<E>();
        getAllHelper(root, output);
        return output;
    }
    
    public List<E> getAllHelper(BSTNode<E> currentNode, List<E> output)
    {
    	
    	if(currentNode != null)
    	{
    		getAllHelper(currentNode.getLeft(), output);
    		output.add(currentNode.getValue());
    		getAllHelper(currentNode.getRight(), output);
    	}
    	return output;
    }
                                  


    /**
     * return the maximum value in this binary search tree.
     * <br>
     * pre: size() > 0<br>
     * post: return the largest value in this Binary Search Tree
     * @return the maximum value in this tree
     */
     public E max(){
    	 
    	 
    	 
    	 BSTNode<E> temp = root;   	 
    	 while(temp.getRight() != null)
    		 temp = temp.getRight();
    	 
    	 return temp.getValue();
     }
     

    /**
     * return the minimum value in this binary search tree.
     * <br>
     * pre: size() > 0<br>
     * post: Return the smallest value in this Binary Search Tree
     * @return the minimum value in this tree
     */
     public E min(){
    	 
    	 
    	 assert size > 0;
  	 
    	 BSTNode<E> temp = root;    	 
    	 while(temp.getLeft() != null)
    	 {
    		 temp = temp.getLeft();
    	 }
    	 
    	 return temp.getValue();
    	 
    	 

     }
	
	/**
	 * An add method that implements the add algorithm iteratively instead of recursively.
	 * <br>pre: data != null
	 * <br>post: if data is not present add it to the tree, otherwise do nothing.
	 * @param data the item to be added to this tree
	 * @return true if data was not present before this call to add, false otherwise.
	 */
	public boolean iterativeAdd(E data){
		
		if(root == null)
		{
			root = new BSTNode<E>(data, null, null);
			size++;
			return true;
		}
		
		int oldSize = size;
		root = iterativeAddHelper(data, root);
		return oldSize != size;
	}
	
	
	private BSTNode<E> iterativeAddHelper(E data, BSTNode<E> currentNode)
	{
		boolean flag = false;
		int compare = data.compareTo(currentNode.getValue());

		while(!flag && compare != 0)
		{
			compare = data.compareTo(currentNode.getValue());
			if(compare < 0)
			{
				if(currentNode.getLeft() == null)
				{
					currentNode.setLeft(new BSTNode<E>(data));
					flag = true;
					size++;
				}
				else
					currentNode = currentNode.getLeft();
			}
			else if(compare > 0)
			{
				if(currentNode.getRight() == null)
				{
					currentNode.setRight(new BSTNode<E>(data));
					flag = true;
					size++;
				}
				else
					currentNode = currentNode.getRight();
			}
			else
			{
				flag = true;
				size++;
			}
		}
		return currentNode;
	}

	/**
	 * Find the number of nodes in this tree at the specified depth.
	 * @param d The depth to find nodes at.
	 * @return The number of nodes in this tree at a depth equal to
	 * the parameter d.
	 */
	public int numNodesAtDepth(int d) {
		return numNodeHelper(d, root);
	}
	
	private int numNodeHelper(int d, BSTNode<E> currentNode) 
	{
		
		if(d == 0 || currentNode == null)
		{
			if(currentNode == null)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		else
		{
			int left = numNodeHelper(d-1, currentNode.getLeft());
			int right = numNodeHelper(d-1, currentNode.getRight());
			return left + right;
		}
	}
	
	/**
	 * Prints a vertical representation of this tree.
	 * The tree has been rotated counter clockwise 90
	 * degrees. The root is on the left. Each node is printed
	 * out on its own row. A node's children wil not necessarily
	 * be at the rows directly above and below a row. They will
	 * be indented three spaces from the parent. Nodes indented the
	 * same amount are at the same depth.
	 * pre: none
	 */
	public void printTree(){
	    printTree(root, "");
	}
	
	private void printTree(BSTNode<E> n, String spaces){
	  if(n != null){
	      printTree(n.getRight(), spaces + "  ");
	      System.out.println(spaces + n.getValue());
	      printTree(n.getLeft(), spaces + "  ");
	  }
	}
	
	private static class BSTNode<E extends Comparable<? super E>> {
	    private E value;
	    private BSTNode<E> left;
	    private BSTNode<E> right;

	    public BSTNode(){
	        this(null);
	    }
	 
	    public BSTNode(E initValue){
	        this(initValue, null, null); 
	    }

	    public BSTNode(E initValue, 
	            BSTNode<E> initLeft, 
	            BSTNode<E> initRight) {
	        value = initValue; 
	        left = initLeft; 
	        right = initRight; 
	    }

	    public E getValue() { 
	        return value; 
	    }
	    
	    public BSTNode<E> getLeft() { 
	        return left;
	    }
	    
	    public BSTNode<E> getRight() { 
	        return right; 
	    }

	    public void setValue(E theNewValue) { 
	        value = theNewValue; 
	    }
	    
	    public void setLeft(BSTNode<E> theNewLeft) { 
	        left = theNewLeft; 
	    }
	    
	    public void setRight(BSTNode<E> theNewRight) { 
	        right = theNewRight; 
	    }    
	}


}
