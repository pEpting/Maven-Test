package eptingpa;

import junit.framework.TestCase;

public class QueueTest extends TestCase {
	
	
	public void testenqueue() {
		Queue testQueue = new Queue(3);
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		testQueue.enqueue(3);
		testQueue.enqueue(4);
		
		assertEquals(1, testQueue.dequeue());
		assertEquals(2, testQueue.dequeue());
		assertEquals(4, testQueue.dequeue());
	}
	
	public void testdequeue() {
		Queue testQueue = new Queue(3);
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		testQueue.enqueue(3);
		assertEquals(1, testQueue.dequeue());
		assertEquals(2, testQueue.dequeue());
		assertEquals(3, testQueue.dequeue());
	}
	
	public void testOverflow() {
		Queue testQueue = new Queue(3);
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		assertEquals(1, testQueue.dequeue());
		assertEquals(2, testQueue.dequeue());
		testQueue.enqueue(3);
		testQueue.enqueue(4);
		assertEquals(3, testQueue.dequeue());
		assertEquals(4, testQueue.dequeue());
	}
	
	public void testQueueEmpty() {
		Queue testQueue = new Queue(3);
		try{
		testQueue.dequeue();
		fail("Queue Emtpy not thrown");
		} 
		catch (Exception e)
		{
		}
	}
}
