import java.util.List;
/**
 * Shell for a bianry search tree class.
 * @author scottm
 *
 */

public class BinarySearchTree<E extends Comparable<? super E>> {
    
    private BSTNode<E> root;
    // CS307 students. Add any other instance variables you want here
    
    // CS307 students. Add a default contructor here.
    
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
        return true;
    }

    /**
     *  remove a specified item from this Binaray Search Tree if it is present.
     *  <br>
     *  pre: data != null<br>
     *  post: remove data from the tree, return true if this tree
     *  changed as a result of this method call, false otherwise.
     *  @param data the data to remove from the tree if present
     *  @return false if data was not present
     *  returns true if data was present and size() = old size() - 1
     */
    public boolean remove(E data){
        return true;
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
        return true;
    }


    /**
     *  return how many elements are in this Binary Search Tree.
     *  <br>
     *  pre: none<br>
     *  post: return the number of items in this tree
     *  @returns the number of items in this Binary Search Tree
     */
    public int size(){
        return -1;
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
        return -2;
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
        return null;
    }
                                  


    /**
     * return the maximum value in this binary search tree.
     * <br>
     * pre: size() > 0<br>
     * post: return the largest value in this Binary Search Tree
     * @return the maximum value in this tree
     */
     public E max(){
         return null;
     }

    /**
     * return the minimum value in this binary search tree.
     * <br>
     * pre: size() > 0<br>
     * post: eturn the smallest value in this Binary Search Tree
     * @return the minimum value in this tree
     */
     public E min(){
         return null;
     }
	
	/**
	 * An add method that implements the add algorithm iteratively instead of recursively.
	 * <br>pre: data != null
	 * <br>post: if data is not present add it to the tree, otherwise do nothing.
	 * @param data the item to be added to this tree
	 * @return true if data was not present before this call to add, false otherwise.
	 */
	public boolean iterativeAdd(E data){
		return false;
	}

	/**
	 * Find the number of nodes in this tree at the specified depth.
	 * @param d The depth to find nodes at.
	 * @return The number of nodes in this tree at a depth equal tot
	 * the parameter d.
	 */
	public int numNodesAtDepth(int d) {
		return -1;
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
