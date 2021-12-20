package Programming_DataStructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing_CircularLinkedList 
{
	// Declaring CircularLinkedLsts class object.
	private static CircularLinkedLists list;	
	
	@BeforeClass
	static public void Setup() throws Exception {
		System.out.println("Welcome to CircularLinkedLists - Data Structure Testing Interface\n");
	}

	@Before
	public void BeforeEachTest() throws Exception {
		list = new CircularLinkedLists();
	}
	
	@Test
	public void TestOne()	//Insert & Delete fucntion
	{
		System.out.println("\nTest One Interface\n");

		list.InsertFirst(0);
		list.InsertLast(1);
		list.InsertFirst(0);
		list.InsertLast(1);
		list.InsertLast(1);
		list.InsertFirst(0);
		list.InsertLast(1);
		list.InsertFirst(0);
		list.InsertFirst(1);

		list.displayCircularLinkedList();

		list.DeleteFirst();
		list.DeleteLast();
		list.DeleteFirst();
		list.DeleteLast();
		list.DeleteFirst();
		list.DeleteLast();
		list.InsertFirst(1);

		list.displayCircularLinkedList();
	}
}
