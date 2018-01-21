// Student information for assignment
//
//  On <my> honor,Bryan Vuong,
//  this programming assignment is my own work.
//
//  Student Name: Bryan Vuong
//  Student UTEID: BKV85
//  Student CS307 class unique section id: 
//  Student email address: vuong.bryan@gmail.com
//  Student TA name: Oliver Jensen

//		Minimum Possible BST Height: log n
//		In order to add N elements into a BST is O(N)
//		In order to add N elements into a treeSet is O(log N)
		
//		If adding N sorted integers in sorted order, the height of the tree would be height N
//		To add 128,000 elements to a BST, it would take approximately: 5.114 E-4
//		To add 256,000 elements to a BST, it would take approximately: .001
//		To add 512,000 elements to a BST, it would take approximately: .002
		
//		The treeset added quicker because it was constantly rebalancing so at the worst case, the big Oh to add would just be O(log n)
//		since java's treeSet class is a balanced BST
//		When adding random integers to a BST, it went quicker than adding sorted integers
		
//		Number of elements: 1000
//
//		Experiment 1
//		Time to add 1000 elements is 0.007250467
//		BST height is 20
//		BST size is 1000
//		Experiment 2
//		Time to add 1000 elements is 0.005590104
//		BST height is 21
//		BST size is 1000
//		Experiment 3
//		Time to add 1000 elements is 0.004160441
//		BST height is 20
//		BST size is 1000
//		Experiment 4
//		Time to add 1000 elements is 0.002273775
//		BST height is 20
//		BST size is 1000
//		Experiment 5
//		Time to add 1000 elements is 8.27982E-4
//		BST height is 21
//		BST size is 1000
//		Experiment 6
//		Time to add 1000 elements is 9.2867E-4
//		BST height is 25
//		BST size is 1000
//		Experiment 7
//		Time to add 1000 elements is 8.14785E-4
//		BST height is 23
//		BST size is 1000
//		Experiment 8
//		Time to add 1000 elements is 7.84482E-4
//		BST height is 22
//		BST size is 1000
//		Experiment 9
//		Time to add 1000 elements is 7.75195E-4
//		BST height is 19
//		BST size is 1000
//		Experiment 10
//		Time to add 1000 elements is 0.003270873
//		BST height is 24
//		BST size is 1000
//
//		The average time to add 1000 items is 3.270873E-4
//		The average height of 1000 items is 21
//		The average size of 1000 items is 1000
//
//
//		Number of elements: 2000
//
//		Experiment 1
//		Time to add 2000 elements is 6.4176E-4
//		BST height is 23
//		BST size is 2000
//		Experiment 2
//		Time to add 2000 elements is 6.10967E-4
//		BST height is 26
//		BST size is 2000
//		Experiment 3
//		Time to add 2000 elements is 7.2143E-4
//		BST height is 24
//		BST size is 2000
//		Experiment 4
//		Time to add 2000 elements is 6.22698E-4
//		BST height is 22
//		BST size is 2000
//		Experiment 5
//		Time to add 2000 elements is 6.5349E-4
//		BST height is 22
//		BST size is 2000
//		Experiment 6
//		Time to add 2000 elements is 6.46647E-4
//		BST height is 26
//		BST size is 2000
//		Experiment 7
//		Time to add 2000 elements is 6.32962E-4
//		BST height is 22
//		BST size is 2000
//		Experiment 8
//		Time to add 2000 elements is 6.53002E-4
//		BST height is 24
//		BST size is 2000
//		Experiment 9
//		Time to add 2000 elements is 0.00114764
//		BST height is 25
//		BST size is 2000
//		Experiment 10
//		Time to add 2000 elements is 6.42737E-4
//		BST height is 26
//		BST size is 2000
//
//		The average time to add 2000 items is 6.42737E-5
//		The average height of 2000 items is 24
//		The average size of 2000 items is 2000
//
//
//		Number of elements: 4000
//
//		Experiment 1
//		Time to add 4000 elements is 0.001501023
//		BST height is 22
//		BST size is 4000
//		Experiment 2
//		Time to add 4000 elements is 0.001383718
//		BST height is 26
//		BST size is 4000
//		Experiment 3
//		Time to add 4000 elements is 0.001822148
//		BST height is 26
//		BST size is 4000
//		Experiment 4
//		Time to add 4000 elements is 0.001430151
//		BST height is 26
//		BST size is 4000
//		Experiment 5
//		Time to add 4000 elements is 0.001456546
//		BST height is 24
//		BST size is 4000
//		Experiment 6
//		Time to add 4000 elements is 0.001658897
//		BST height is 26
//		BST size is 4000
//		Experiment 7
//		Time to add 4000 elements is 0.001349016
//		BST height is 27
//		BST size is 4000
//		Experiment 8
//		Time to add 4000 elements is 0.002034276
//		BST height is 27
//		BST size is 4000
//		Experiment 9
//		Time to add 4000 elements is 0.001535238
//		BST height is 26
//		BST size is 4000
//		Experiment 10
//		Time to add 4000 elements is 0.00138323
//		BST height is 26
//		BST size is 4000
//
//		The average time to add 4000 items is 1.38323E-4
//		The average height of 4000 items is 25
//		The average size of 4000 items is 4000
//
//
//		Number of elements: 8000
//
//		Experiment 1
//		Time to add 8000 elements is 0.002971255
//		BST height is 29
//		BST size is 8000
//		Experiment 2
//		Time to add 8000 elements is 0.003685842
//		BST height is 32
//		BST size is 8000
//		Experiment 3
//		Time to add 8000 elements is 0.002632046
//		BST height is 34
//		BST size is 8000
//		Experiment 4
//		Time to add 8000 elements is 0.002264977
//		BST height is 30
//		BST size is 8000
//		Experiment 5
//		Time to add 8000 elements is 0.002201436
//		BST height is 27
//		BST size is 8000
//		Experiment 6
//		Time to add 8000 elements is 0.002771347
//		BST height is 26
//		BST size is 8000
//		Experiment 7
//		Time to add 8000 elements is 0.002458531
//		BST height is 26
//		BST size is 8000
//		Experiment 8
//		Time to add 8000 elements is 0.002505454
//		BST height is 30
//		BST size is 8000
//		Experiment 9
//		Time to add 8000 elements is 0.002301635
//		BST height is 27
//		BST size is 8000
//		Experiment 10
//		Time to add 8000 elements is 0.002221476
//		BST height is 28
//		BST size is 8000
//
//		The average time to add 8000 items is 2.221476E-4
//		The average height of 8000 items is 28
//		The average size of 8000 items is 8000
//
//
//		Number of elements: 16000
//
//		Experiment 1
//		Time to add 16000 elements is 0.00528902
//		BST height is 31
//		BST size is 16000
//		Experiment 2
//		Time to add 16000 elements is 0.006130198
//		BST height is 38
//		BST size is 16000
//		Experiment 3
//		Time to add 16000 elements is 0.005658044
//		BST height is 31
//		BST size is 16000
//		Experiment 4
//		Time to add 16000 elements is 0.005142387
//		BST height is 35
//		BST size is 16000
//		Experiment 5
//		Time to add 16000 elements is 0.00506174
//		BST height is 34
//		BST size is 16000
//		Experiment 6
//		Time to add 16000 elements is 0.008763222
//		BST height is 30
//		BST size is 16000
//		Experiment 7
//		Time to add 16000 elements is 0.008249032
//		BST height is 33
//		BST size is 16000
//		Experiment 8
//		Time to add 16000 elements is 0.006124333
//		BST height is 30
//		BST size is 16000
//		Experiment 9
//		Time to add 16000 elements is 0.004607669
//		BST height is 32
//		BST size is 16000
//		Experiment 10
//		Time to add 16000 elements is 0.005395083
//		BST height is 33
//		BST size is 16000
//
//		The average time to add 16000 items is 5.395083000000001E-4
//		The average height of 16000 items is 32
//		The average size of 16000 items is 16000
//
//
//		Number of elements: 32000
//
//		Experiment 1
//		Time to add 32000 elements is 0.013190533
//		BST height is 33
//		BST size is 32000
//		Experiment 2
//		Time to add 32000 elements is 0.012064888
//		BST height is 37
//		BST size is 32000
//		Experiment 3
//		Time to add 32000 elements is 0.010427985
//		BST height is 30
//		BST size is 32000
//		Experiment 4
//		Time to add 32000 elements is 0.011404066
//		BST height is 36
//		BST size is 32000
//		Experiment 5
//		Time to add 32000 elements is 0.011618149
//		BST height is 35
//		BST size is 32000
//		Experiment 6
//		Time to add 32000 elements is 0.010765238
//		BST height is 37
//		BST size is 32000
//		Experiment 7
//		Time to add 32000 elements is 0.01316365
//		BST height is 36
//		BST size is 32000
//		Experiment 8
//		Time to add 32000 elements is 0.011172387
//		BST height is 35
//		BST size is 32000
//		Experiment 9
//		Time to add 32000 elements is 0.010869836
//		BST height is 39
//		BST size is 32000
//		Experiment 10
//		Time to add 32000 elements is 0.010766216
//		BST height is 34
//		BST size is 32000
//
//		The average time to add 32000 items is 0.0010766216
//		The average height of 32000 items is 35
//		The average size of 32000 items is 32000
//
//
//		Number of elements: 64000
//
//		Experiment 1
//		Time to add 64000 elements is 0.031719452
//		BST height is 37
//		BST size is 64000
//		Experiment 2
//		Time to add 64000 elements is 0.028328829
//		BST height is 38
//		BST size is 64000
//		Experiment 3
//		Time to add 64000 elements is 0.03013387
//		BST height is 37
//		BST size is 63999
//		Experiment 4
//		Time to add 64000 elements is 0.030286857
//		BST height is 42
//		BST size is 64000
//		Experiment 5
//		Time to add 64000 elements is 0.03013387
//		BST height is 38
//		BST size is 64000
//		Experiment 6
//		Time to add 64000 elements is 0.028416808
//		BST height is 39
//		BST size is 64000
//		Experiment 7
//		Time to add 64000 elements is 0.031361669
//		BST height is 39
//		BST size is 64000
//		Experiment 8
//		Time to add 64000 elements is 0.029939827
//		BST height is 39
//		BST size is 64000
//		Experiment 9
//		Time to add 64000 elements is 0.027389896
//		BST height is 37
//		BST size is 63999
//		Experiment 10
//		Time to add 64000 elements is 0.02769098
//		BST height is 38
//		BST size is 64000
//
//		The average time to add 64000 items is 0.0027690980000000002
//		The average height of 64000 items is 38
//		The average size of 64000 items is 63999
//
//
//		Number of elements: 128000
//
//		Experiment 1
//		Time to add 128000 elements is 0.085686411
//		BST height is 44
//		BST size is 127997
//		Experiment 2
//		Time to add 128000 elements is 0.078623144
//		BST height is 39
//		BST size is 127996
//		Experiment 3
//		Time to add 128000 elements is 0.080937976
//		BST height is 43
//		BST size is 127999
//		Experiment 4
//		Time to add 128000 elements is 0.080682836
//		BST height is 40
//		BST size is 127998
//		Experiment 5
//		Time to add 128000 elements is 0.084387741
//		BST height is 39
//		BST size is 127999
//		Experiment 6
//		Time to add 128000 elements is 0.092126982
//		BST height is 45
//		BST size is 127998
//		Experiment 7
//		Time to add 128000 elements is 0.085227454
//		BST height is 40
//		BST size is 128000
//		Experiment 8
//		Time to add 128000 elements is 0.084604267
//		BST height is 46
//		BST size is 127998
//		Experiment 9
//		Time to add 128000 elements is 0.085458154
//		BST height is 40
//		BST size is 127998
//		Experiment 10
//		Time to add 128000 elements is 0.089447035
//		BST height is 40
//		BST size is 127999
//
//		The average time to add 128000 items is 0.0089447035
//		The average height of 128000 items is 41
//		The average size of 128000 items is 127998
//
//
//		Number of elements: 256000
//
//		Experiment 1
//		Time to add 256000 elements is 0.304215135
//		BST height is 42
//		BST size is 255994
//		Experiment 2
//		Time to add 256000 elements is 0.329168005
//		BST height is 43
//		BST size is 255994
//		Experiment 3
//		Time to add 256000 elements is 0.274540712
//		BST height is 41
//		BST size is 255989
//		Experiment 4
//		Time to add 256000 elements is 0.225071936
//		BST height is 48
//		BST size is 255993
//		Experiment 5
//		Time to add 256000 elements is 0.216008117
//		BST height is 43
//		BST size is 255994
//		Experiment 6
//		Time to add 256000 elements is 0.222828464
//		BST height is 50
//		BST size is 255989
//		Experiment 7
//		Time to add 256000 elements is 0.237346996
//		BST height is 43
//		BST size is 255992
//		Experiment 8
//		Time to add 256000 elements is 0.223102178
//		BST height is 42
//		BST size is 255993
//		Experiment 9
//		Time to add 256000 elements is 0.230940639
//		BST height is 41
//		BST size is 255994
//		Experiment 10
//		Time to add 256000 elements is 0.230877588
//		BST height is 41
//		BST size is 255992
//
//		The average time to add 256000 items is 0.0230877588
//		The average height of 256000 items is 43
//		The average size of 256000 items is 255992
//
//
//		Number of elements: 512000
//
//		Experiment 1
//		Time to add 512000 elements is 0.591500618
//		BST height is 48
//		BST size is 511968
//		Experiment 2
//		Time to add 512000 elements is 0.630712481
//		BST height is 47
//		BST size is 511980
//		Experiment 3
//		Time to add 512000 elements is 0.60090169
//		BST height is 46
//		BST size is 511981
//		Experiment 4
//		Time to add 512000 elements is 0.579941122
//		BST height is 44
//		BST size is 511976
//		Experiment 5
//		Time to add 512000 elements is 0.568235972
//		BST height is 46
//		BST size is 511976
//		Experiment 6
//		Time to add 512000 elements is 1.002668215
//		BST height is 46
//		BST size is 511970
//		Experiment 7
//		Time to add 512000 elements is 0.557717564
//		BST height is 47
//		BST size is 511958
//		Experiment 8
//		Time to add 512000 elements is 0.570839669
//		BST height is 47
//		BST size is 511972
//		Experiment 9
//		Time to add 512000 elements is 0.623610111
//		BST height is 51
//		BST size is 511964
//		Experiment 10
//		Time to add 512000 elements is 0.587615357
//		BST height is 46
//		BST size is 511973
//
//		The average time to add 512000 items is 0.0587615357
//		The average height of 512000 items is 46
//		The average size of 512000 items is 511971
//
//
//		Number of elements: 1024000
//
//		Experiment 1
//		Time to add 1024000 elements is 1.481745039
//		BST height is 52
//		BST size is 1023876
//		Experiment 2
//		Time to add 1024000 elements is 1.552188069
//		BST height is 51
//		BST size is 1023886
//		Experiment 3
//		Time to add 1024000 elements is 1.582924108
//		BST height is 51
//		BST size is 1023884
//		Experiment 4
//		Time to add 1024000 elements is 1.469795502
//		BST height is 50
//		BST size is 1023891
//		Experiment 5
//		Time to add 1024000 elements is 1.553440795
//		BST height is 47
//		BST size is 1023876
//		Experiment 6
//		Time to add 1024000 elements is 1.421304273
//		BST height is 50
//		BST size is 1023867
//		Experiment 7
//		Time to add 1024000 elements is 1.439208538
//		BST height is 48
//		BST size is 1023893
//		Experiment 8
//		Time to add 1024000 elements is 1.310934794
//		BST height is 53
//		BST size is 1023888
//		Experiment 9
//		Time to add 1024000 elements is 1.475127533
//		BST height is 52
//		BST size is 1023877
//		Experiment 10
//		Time to add 1024000 elements is 1.559024544
//		BST height is 50
//		BST size is 1023890
//
//		The average time to add 1024000 items is 0.1559024544
//		The average height of 1024000 items is 50
//		The average size of 1024000 items is 1023882


/**
 * Test class for binary search tree
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.TreeSet;

public class BSTTester
{
	public static void main(String[] args)
	{	

		
		
//		Binary Search Tree Random Addition		
		
//		Stopwatch s = new Stopwatch();
//		int n = 1000;
//		Random r = new Random();
//		double timeAverage = 0;
//		int heightAverage = 0;
//		int sizeAverage = 0;
//		for(int m = n; m <= 1024000; m*=2)
//		{
//			System.out.println();
//			System.out.println();
//			System.out.println("Number of elements: " + m);
//			System.out.println();
//			timeAverage = 0;
//			heightAverage = 0;
//			sizeAverage = 0;;
//			for(int i = 1; i <= 10; i++)
//			{
//				BinarySearchTree<Integer> b = new BinarySearchTree<Integer>();
//				s.start();
//				for(int j = 0; j < m; j++){
//				    b.add( r.nextInt() );
//				}
//				s.stop();
//				timeAverage += s.time();
//				heightAverage += b.height();
//				sizeAverage += b.size();
//				System.out.println("Experiment " + i);
//				System.out.println("Time to add " + m + " elements is " + s.time());		
//				System.out.println("BST height is " + b.height());
//				System.out.println("BST size is " + b.size());
//			}
//			System.out.println();
//			System.out.println("The average time to add " + m + " items is " + s.time()/10);
//			System.out.println("The average height of " + m + " items is " + heightAverage/10);
//			System.out.println("The average size of " + m + " items is " + sizeAverage/10);
//		}
		
		
//		Tree Set Random Add		
		
//		Stopwatch s = new Stopwatch();
//		int n = 1000;
//		Random r = new Random();
//		double timeAverage = 0;
//		int sizeAverage = 0;
//		for(int m = n; m <= 1024000; m*=2)
//		{
//			System.out.println();
//			System.out.println();
//			System.out.println("Number of elements: " + m);
//			System.out.println();
//			timeAverage = 0;
//			sizeAverage = 0;;
//			for(int i = 1; i <= 10; i++)
//			{
//				TreeSet<Integer> b = new TreeSet<Integer>();
//				s.start();
//				for(int j = 0; j < m; j++){
//				    b.add( r.nextInt() );
//				}
//				s.stop();
//				timeAverage += s.time();
//				sizeAverage += b.size();
//				System.out.println("Experiment " + i);
//				System.out.println("Time to add " + m + " elements is " + s.time());		
//				System.out.println("TreeSet size is " + b.size());
//			}
//			System.out.println();
//			System.out.println("The average time to add " + m + " items is " + s.time()/10);
//			System.out.println("The average size of " + m + " items is " + sizeAverage/10);
//		}
		
		
//		BST sorted Addition		
		
//		Stopwatch s = new Stopwatch();
//		int n = 1000;
//		double timeAverage = 0;
//		int heightAverage = 0;
//		int sizeAverage = 0;
//		for(int m = n; m <= 64000; m*=2)
//		{
//			System.out.println();
//			System.out.println();
//			System.out.println("Number of elements: " + m);
//			System.out.println();
//			timeAverage = 0;
//			heightAverage = 0;
//			sizeAverage = 0;;
//			for(int i = 1; i <= 10; i++)
//			{
//				BinarySearchTree<Integer> b = new BinarySearchTree<Integer>();
//				s.start();
//				for(int j = 1; j <= m; j++){
//				    b.iterativeAdd(j);
//				}
//				s.stop();
//				timeAverage += s.time();
//				heightAverage += b.height();
//				sizeAverage += b.size();
//				System.out.println("Experiment " + i);
//				System.out.println("Time to add " + m + " elements is " + s.time());		
//				System.out.println("BST height is " + b.height());
//				System.out.println("BST size is " + b.size());
//			}
//			System.out.println();
//			System.out.println("The average time to add " + m + " items is " + s.time()/10);
//			System.out.println("The average height of " + m + " items is " + heightAverage/10);
//			System.out.println("The average size of " + m + " items is " + sizeAverage/10);
//		}
		
		
//		Tree Set Sorted Add	
		
//		Stopwatch s = new Stopwatch();
//		int n = 1000;
//		Random r = new Random();
//		double timeAverage = 0;
//		int sizeAverage = 0;
//		for(int m = n; m <= 64000; m*=2)
//		{
//			System.out.println();
//			System.out.println();
//			System.out.println("Number of elements: " + m);
//			System.out.println();
//			timeAverage = 0;
//			sizeAverage = 0;;
//			for(int i = 1; i <= 10; i++)
//			{
//				TreeSet<Integer> b = new TreeSet<Integer>();
//				s.start();
//				for(int j = 1; j <= m; j++){
//				    b.add(j);
//				}
//				s.stop();
//				timeAverage += s.time();
//				sizeAverage += b.size();
//				System.out.println("Experiment " + i);
//				System.out.println("Time to add " + m + " elements is " + s.time());		
//				System.out.println("TreeSet size is " + b.size());
//			}
//			System.out.println();
//			System.out.println("The average time to add " + m + " items is " + s.time()/10);
//			System.out.println("The average size of " + m + " items is " + sizeAverage/10);
//		}
		
		
		
		
		
		
		
		BinarySearchTree<String> t = new BinarySearchTree<String>();

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
		
		System.out.println();
		System.out.println("---------My Tests--------");
		System.out.println();
		
		//set up int counters to see how many times methods were tested
		int add = 0;
		int iterativeAdd = 0;
		int max = 0;
		int min = 0;
		int remove = 0;
		int isPresent = 0;
		int height = 0;
		int size = 0;
		int numNodesAtDepth = 0;
		int getAll = 0;
		
		
		//test 23
		t.add("aaa");
		System.out.println("Test 23: Adding \"aaa\".");
		showTestResults(t.isPresent("aaa"), 23);
		add++;
		isPresent++;
		
		//test 24
		t.add("abcdefghijklmnopqrstuvwxyz");
		System.out.println("Test 24: Adding the alphabet.");
		showTestResults(t.isPresent("abcdefghijklmnopqrstuvwxyz"), 24);
		isPresent++;
		add++;
		
		//test 25
		System.out.println("Test 25: Getting the min of the tree.");
		showTestResults(t.min().equals("aaa"), 25);
		min++;
		
		//test 26
		System.out.println("Test 26: Getting the max of the tree.");
		showTestResults(t.max().equals("dish"), 26);
		max++;
		
		//test 27
		t = new BinarySearchTree<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		//t.remove("b");
		List<String> l1 = t.getAll();
		List<String> l2 = new ArrayList<String>();
		l2.add("a");
		l2.add("b");
		l2.add("c");
		System.out.println("Test 27: Adding and getAll.");
		showTestResults(l1.equals(l2), 27);
		add++;
		getAll++;
		
		//test 28
		t.remove("a");
		System.out.println("Test 28: Removing \"a\".");
		showTestResults(!t.isPresent("a"), 28);
		remove++;
		isPresent++;
		
		//test 29 
		System.out.println("Test 29: Getting the size.");
		showTestResults(t.size() == 2, 29);
		size++;
		
		//test 30
		System.out.println("Test 30: Iterative adding \"duckroll\" and size check.");
		t.iterativeAdd("duckroll");
		showTestResults(t.size() == 3 && t.isPresent("duckroll"), 30);
		iterativeAdd++;
		size++;
		isPresent++;
		
		//test 31
		System.out.println("Test 31: Iterative adding \"mcroll'd\" and removing \"b\" and \"c\".");
		t.iterativeAdd("mcroll'd");
		t.remove("b");
		t.remove("c");
		showTestResults(t.isPresent("mcroll'd") && !t.isPresent("b") && !t.isPresent("c"), 31);
		iterativeAdd++;
		remove++;
		isPresent++;
		
		//test 32
		System.out.println("Test 32: Checking the height of the tree.");
		int i = t.height();
		showTestResults(i == 1, 32);
		height++;
		
		//test 33
		System.out.println("Test 33: Adding a bunch of stuff and checking height");
		t.add("z");
		t.add("zzz");
		t.add("zzzzSNORLAX!!!");
		t.add("zzzzzzzzzSnorlax Used Sleep Talk!");
		t.add("zzzzzzzzzzzzzzzzzzzzzzNo more zzzzzz's.");
		i = t.height();
		showTestResults(i == 6, 33);
		add++;
		height++;
		
		//test 34
		System.out.println("Test 34: Test in which I do a whole lot in an attempt to break your code.");
		t = new BinarySearchTree<String>();
		t.add("foo");
		t.add("foo");
		t.remove("food");
		t.add("food");
		t.remove("foo");
		t.iterativeAdd("apple");
		t.add("apple");
		t.add("bananananana");
		t.add("well, i can't really spell banana.");
		t.add("orange");
		t.add("MEGATEST");
		t.remove("fruit");
		t.remove("MEGATEST");
		t.remove("apple");
		t.remove("food");
		t.remove("well, i can't really spell banana.");
		t.remove("bananananana");
		l1 = t.getAll();
		l2 = new ArrayList<String>();
		l2.add("orange");
		showTestResults(l1.equals(l2), 34);
		add++;
		remove++;
		iterativeAdd++;
		getAll++;
		
		//test 35
		System.out.println("Test 35: Remove root.");
		t.remove("orange");
		t.add("m");
		t.add("a");
		t.add("z");
		t.add("c");
		t.add("w");
		t.remove("m");
		l2.remove("orange");
		l2.add("a");
		l2.add("c");
		l2.add("w");
		l2.add("z");
		showTestResults(t.getAll().equals(l2), 35);
		add++;
		remove++;
		getAll++;
		
		
		
		//test 36
		System.out.println("Test 36: Max.");
		showTestResults(t.max().equals("z"), 35);
		max++;
		
		//test 37
		System.out.println("Test 37: Max again.");
		t.add("zz");
		t.add("zy");
		t.add("zzz");
		showTestResults(t.max().equals("zzz"), 37);
		add++;
		max++;
		
		//test 38
		System.out.println("Test 38: Testing min.");
		showTestResults(t.min().equals("a"), 38);
		min++;
		
		//test 39
		System.out.println("Test 39: numNodesAtDepth");
		t = new BinarySearchTree<String>();
		t.add("m");
		t.add("a");
		t.add("z");
		t.add("y");
		t.add("c");
		t.add("b");
		t.add("x");
		showTestResults(t.numNodesAtDepth(2) == 2, 39);
		numNodesAtDepth++;
		add++;
		
		//test 40
		System.out.println("Test 40: numNodesAtDepth PART TWO!");
		showTestResults(t.numNodesAtDepth(3) == 2, 40);
		numNodesAtDepth++;
		
		//test 41
		System.out.println("Test 41: add in a line and get height.");
		t = new BinarySearchTree<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		t.add("f");
		t.add("g");
		t.add("h");
		t.remove("d");
		t.remove("e");
		t.add("p");
		t.add("q");
		t.remove("c");
		t.remove("f");
		showTestResults(t.height() == 5, 41);
		
		//test 42 
		System.out.println("Test 42: Trying to get numDepth...AT AN IMPOSSIBLE DEPTH");
		i = t.numNodesAtDepth(t.height() + 1);
		showTestResults(i == 0, 42);
		numNodesAtDepth++;
		

		
		System.out.println();
		System.out.println();
		System.out.println("Methods Tested:");
		System.out.println("Add: " + add);
		System.out.println("Iterative Add: " + iterativeAdd);
		System.out.println("Get All: " + getAll);
		System.out.println("Remove: " + remove);
		System.out.println("Size: " + size);
		System.out.println("Height: " + height);
		System.out.println("NumNodesAtDepth: " + numNodesAtDepth);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("IsPresent: " + isPresent);

	}

	private static void showTestResults(boolean passed, int testNum)
	{	if( passed )
			System.out.println( "test " + testNum + " passed.");
		else
			System.out.println( "test " + testNum + " failed.");
	}
}