package Programming_DataStructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing_Queues_LinkedList 
{
	// Declaring Queues_LinkedList class object.
	private static Queues_LinkedList queue;	
	
	@BeforeClass
	static public void Setup() throws Exception {
		System.out.println("Welcome to Queues_LinkedList - Data Structure Testing Interface\n");
	}

	@Before
	public void BeforeEachTest() throws Exception {
		queue = new Queues_LinkedList();
	}
	
	@Test
	public void TestOne()	//Insert & Delete fucntion
	{
		System.out.println("\nTest One Interface\n");

		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(1);
		queue.enqueue(0);
		queue.dequeue();
		queue.enqueue(1);
		queue.enqueue(0);
		queue.enqueue(1);
		queue.dequeue();
		queue.enqueue(1);
		queue.enqueue(1);
		queue.dequeue();
		queue.enqueue(1);

		queue.DisplayQueue();
		
		queue.dequeue();
		queue.enqueue(0);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(0);
		queue.dequeue();
		queue.enqueue(1);
		queue.dequeue();

		queue.DisplayQueue();	
	}
}
