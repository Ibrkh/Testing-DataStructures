package Programming_DataStructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing_Stack_LinekedList 
{
	// Declaring Queues_LinkedList class object.
	private static Stack_LinkedList stack;	
	
	@BeforeClass
	static public void Setup() throws Exception {
		System.out.println("Welcome to Stack_LinkedList - Data Structure Testing Interface\n");
	}

	@Before
	public void BeforeEachTest() throws Exception {
		stack = new Stack_LinkedList();
	}
	
	@Test
	public void TestOne()	//Insert & Delete fucntion
	{
		System.out.println("\nTest One Interface\n");

		stack.push(1);
		stack.push(0);
		stack.pop();
		stack.push(0);
		stack.push(1);
		stack.pop();
		stack.push(1);
		stack.push(0);
		stack.push(0);
		stack.pop();
		stack.push(1);
		stack.push(0);
		
		stack.DisplayStack();
		
		stack.push(1);
		stack.push(0);
		stack.pop();
		stack.push(0);
		stack.push(1);
		stack.pop();
		stack.push(1);
		stack.push(0);
		stack.push(0);
		stack.pop();
		stack.push(1);
		stack.push(0);

		stack.DisplayStack();
	}
}
