// Student information for assignment
//
//  On <my> honor, <NAME>,
//  this programming assignment is my own work.
//
//  Student Name:
//  Student UTEID:
//  Student CS307 class unique section id: 
//  Student email address:
//  Student TA name:

// Experiment results. CS307 students, place your experiment
// results here:


/**
 * Test class for binary search tree
 */

import java.util.ArrayList;

public class BSTTester
{
	public static void main(String[] args)
	{	BinarySearchTree<String> t = new BinarySearchTree<String>();

		//test 1
	    System.out.println("Test 1: empty tree created.");
		showTestResults( t.size() == 0, 1 );

		//test 2
        System.out.println("Test 2: height of empty tree must be -1.");
		showTestResults( t.height() == -1, 2 );

		//test 3
	    System.out.println("Test 3: empty tree must " +
	      		"not contain the String \"abyss\".");
		showTestResults( t.isPresent("abyss") == false, 3 );

		t.add("abyss");
		//test 4
        System.out.println("Test 4: added \"abyss\" to the" +
        		"tree. Size must be 1.");		
		showTestResults( t.size() == 1, 4 );

		//test 5
        System.out.println("Test 5: height of tree with 1" +
        		"element must be 0.");
		showTestResults( t.height() == 0, 5 );

		//test 6
        System.out.println("Test 6: \"abyss\" must be in the tree.");
		showTestResults( t.isPresent("abyss") == true, 6 );

		//test 7
        System.out.println("Test 7: tree must " +
        "not contain the String \"beep\".");		
		showTestResults( t.isPresent("beep") == false, 7);

		//test 8
        System.out.println("Test 8: min value must be" +
        		"\"abyss\" at this point.");		
		showTestResults( t.min().equals("abyss"), 8);

		//test 9
        System.out.println("Test 9: max value must be" +
        "\"abyss\" at this point.");    
		showTestResults( t.max().equals("abyss"), 9);

		t.add("abyss");
		//test 10
        System.out.println("Test 10: attempt to add \"abyss\"" +
        		"again. size must remain 1.");    
		showTestResults( t.size() == 1, 10 );

		//test 11
        System.out.println("Test 11: attempt to add \"abyss\"" +
                "again. height must remain 0.");  
		showTestResults( t.height() == 0, 11 );

		//test 12
        System.out.println("Test 12: \"abyss\" must still be" +
        		"present.");  
		showTestResults( t.isPresent("abyss") == true, 12 );

		t.add("beep");
		//test 13
        System.out.println("Test 13: added \"beep\" to the" +
                "tree. Size must be 2.");   		
		showTestResults( t.size() == 2, 13 );

		//test 14
        System.out.println("Test 14: height of tree with 2" +
                "elements must be 1."); 
		showTestResults( t.height() == 1, 14 );

		//test 15
		System.out.println("Test 15: Removing \"abyss\" from the tree.");
		showTestResults( t.remove("abyss") == true, 15 );

		//test 16
	    System.out.println("Test 16: Removing \"beep\" from the tree.");
		showTestResults( t.remove("beep") == true, 16 );

		//test 17
	    System.out.println("Test 17: Tree must be empty at this point.");
		showTestResults( t.size() == 0, 17 );

		t.add("beep");
		t.add("abyss");
		t.add("calls");
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("abyss");
		expected.add("beep");
		expected.add("calls");

		//test 18
	    System.out.println("Test 18: Added \"beep\", \"abyss\", and" +
	    		"\"calls\" to the tree in that order.\n" +
	    		"Testing getAll method.");

		showTestResults( expected.equals( t.getAll() ) == true, 18 );
		
		//test 19
		t.add("bit");
		t.add("dish");
        System.out.println("Test 19: Added \"bit\" and \"dish\" to" +
        		"tree. Checking that \"yes\" is not present.");		
		showTestResults( t.remove("yes") == false, 19);
		
		//test 20
		t.add("a");
	    System.out.println("Test 20: Added \"a\" and then " +
	    		"removed it.");
		showTestResults(t.remove("a") == true, 20);
		
		//test 21
	    System.out.println("Test 21: Checking that \"calls\" is still present.");
		showTestResults(t.remove("calls") == true, 21);
		
		//test 22
		t.remove("abyss");
        System.out.println("Test 22: Removing \"abyss\". " +
        		"Checking that \"beep\" is still present.");
		showTestResults(t.remove("beep") == true, 22);

	}

	private static void showTestResults(boolean passed, int testNum)
	{	if( passed )
			System.out.println( "test " + testNum + " passed.");
		else
			System.out.println( "test " + testNum + " failed.");
	}
}