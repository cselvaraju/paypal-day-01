package com.paypal;

import java.io.FileNotFoundException;

public class QueueTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		Queue q = new Queue();
//		BetterQueue q = new BetterQueue();
		
//		QueueIntf q = new BetterQueue();
		
		QueueIntf q = Framework.getInstance();
		
		q.enqueue(0);
		q.dequeue();
	}

}
