package com.paypal;

public class BetterQueue implements QueueIntf {

	@Override
	public void enqueue(int data) {
		// TODO Auto-generated method stub
		System.out.println("BetterQueue::enqueue() called");
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		System.out.println("BetterQueue::dequeue() called");
		return 0;
	}

}
