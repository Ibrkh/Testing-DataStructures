package Programming_DataStructures;

import static org.junit.Assert.*;
import java.util.Scanner;
//import org.junit.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing_Arrays 
{
	
	// Declaring Arrays class object.
	private static Arrays array;	
	private static int length;
	
	@BeforeClass
	static public void Setup() throws Exception 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array - Data Structure Testing Interface\n");
		System.out.println("Enter the length of array: ");
		length = input.nextInt();	
	}

	@Before
	public void BeforeEachTest() throws Exception 
	{
		array = new Arrays(length);
	}
	
	@Test
	public void TestOne()	//Insert & Delete fucntion
	{
		System.out.println("\nTest One Interface\n");

		array.InputValues();
		array.display();

		array.InsertAt(1, 0);
		array.display();

		array.DeleteAt(array.size-1);
		array.display();	
	}

	@Test
	public void TestTwo()	//Linear Search fucntion
	{
		System.out.println("\nTest Two Interface\n");

		array.InputValues();
		array.display();
		
		assertEquals(true, array.linearSearch(5));
	}


	@Test
	public void TestThree()	//Binary Search fucntion
	{
		System.out.println("\nTest Three Interface\n");

		array.InputValues();
		array.display();

		assertEquals(true, array.binarySearch(5, 0, 9));
	}

	@Test
	public void TestFour()	//Bubble Sort fucntion
	{
		System.out.println("\nTest Three Interface\n");

		array.InputValues();
		array.display();
		
		array.bubbleSort();
		array.display();
	}
}
