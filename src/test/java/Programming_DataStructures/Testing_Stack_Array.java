package Programming_DataStructures;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing_Stack_Array 
{
	// Declaring Queues_Array class object.
	private static Stack_Array stack;	
	private static int size;
	
	@BeforeClass
	static public void Setup() throws Exception {
		System.out.println("Welcome to Status_Array - Data Structure Testing Interface\n");
	}

	@Before
	public void BeforeEachTest() throws Exception {
		stack = new Stack_Array();
	}
	
	@Test
	public void TestOne()	//Insert & Delete fucntion
	{
		System.out.println("\nTest One Interface\n");

		stack.push(2);
		stack.push(2);
		stack.pop();
		stack.push(2);
		stack.push(2);
		stack.push(2);
		stack.pop();
		stack.pop();
		stack.push(2);
		stack.push(2);
		stack.pop();
		stack.pop();
		
		stack.display();

		stack.push(2);
		stack.push(2);
		stack.pop();
		stack.push(2);
		stack.push(2);
		stack.push(2);
		stack.pop();
		stack.pop();
		stack.push(2);
		stack.push(2);
		stack.pop();

		stack.display();
	}
}
