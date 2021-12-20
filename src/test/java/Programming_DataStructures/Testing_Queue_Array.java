package Programming_DataStructures;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing_Queue_Array 
{
	// Declaring Queues_Array class object.
	private static Queues_Array queue;	
	
	@BeforeClass
	static public void Setup() throws Exception {
		System.out.println("Welcome to Queues_Array - Data Structure Testing Interface\n");
	}

	@Before
	public void BeforeEachTest() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of queue: ");
		int size = input.nextInt();
		queue = new Queues_Array(size);
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

		queue.display();
		
		queue.dequeue();
		queue.enqueue(0);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(0);
		queue.dequeue();
		queue.enqueue(1);
		queue.dequeue();

		queue.display();	

	}
}
