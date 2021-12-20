package Programming_DataStructures;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing_LinkedLists 
{
	// Declaring LinkedLsts class object.
	private static LinkedLists list;	
	
	@BeforeClass
	static public void Setup() throws Exception {
		System.out.println("Welcome to LinkedLists - Data Structure Testing Interface\n");
	}

	@Before
	public void BeforeEachTest() throws Exception {
		list = new LinkedLists();
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
		
		list.DisplayLinkedList();

		list.DeleteFisrt();
		list.DeleteLast();
		list.DeleteFisrt();
		list.DeleteLast();
		list.DeleteFisrt();
		list.DeleteLast();
		list.DeleteAt(0);

		list.DisplayLinkedList();
	}
}
